import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Ariel 0, Betty 1, Carol 2, Daenerys 3, Emma 4
        // Vivaldi 0, Xavi 1, Yuri 2, Wolverine 3, Zerq 4

        String[] husband = {"Vivaldi", "Xavi", "Yuri", "Wolverine", "Zerq"};
        String[] wife = {"Ariel", "Betty", "Carol", "Daenerys", "Emma"};

        // Women's preferences
        int[] ariel = {1, 3, 0, 2, 4};
        int[] betty = {0, 1, 4, 2, 3};
        int[] carol = {1, 2, 3, 4, 0};
        int[] daenerys = {1, 4, 3, 2, 0};
        int[] emma = {2, 1, 4, 0, 3};
        int[][] women = {ariel, betty, carol, daenerys, emma};

        // Women's availability
        int[] womenAvailability = {5, 5, 5, 5, 5};

        // Men's preferences
        int[] vivaldi = {0, 3, 2, 1, 4};
        int[] xavi = {0, 4, 1, 2, 3};
        int[] yuri = {1, 3, 0, 4, 2};
        int[] wolverine = {2, 0, 1, 3, 4};
        int[] zerq = {4, 1, 0, 3, 2};
        int[][] men = {vivaldi, xavi, yuri, wolverine, zerq};

        // Women preferences are swapped with their indexes for future conveniences
        int[] arielInverse = inverser(ariel);
        int[] bettyInverse = inverser(betty);
        int[] carolInverse = inverser(carol);
        int[] daenerysInverse = inverser(daenerys);
        int[] emmaInverse = inverser(emma);
        int[][] womenInverse = {arielInverse, bettyInverse, carolInverse, daenerysInverse, emmaInverse};

        Stack<Integer> proposeStack = new Stack<>();

        proposeStack.push(4);
        proposeStack.push(3);
        proposeStack.push(2);
        proposeStack.push(1);
        proposeStack.push(0);

        while (!proposeStack.empty()) {
            int currentMan = proposeStack.pop();
        
            for (int i = 0; i < vivaldi.length; i++) {
                if (womenAvailability[men[currentMan][i]] == 5) {
                    womenAvailability[men[currentMan][i]] = womenInverse[men[currentMan][i]][currentMan];
                    break;
                }

                else if (womenInverse[men[currentMan][i]][currentMan] < womenAvailability[men[currentMan][i]]) {
                    int dumpedMan = women[men[currentMan][i]][womenAvailability[men[currentMan][i]]];
                    womenAvailability[men[currentMan][i]] = womenInverse[men[currentMan][i]][currentMan];

                    proposeStack.push(dumpedMan);
                    break;
                }
            }
        }

        int i = 0;
        for (int x : womenAvailability) {
            System.out.println(wife[i] + " marries with " + husband[women[i][x]]);
            i++;
        }

    }

    public static int[] inverser(int[] array) {
        int[] inversedArray = new int[5];

        System.arraycopy(array, 0, inversedArray, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            inversedArray[array[i]] = i;
        }

        return inversedArray;
    }
}