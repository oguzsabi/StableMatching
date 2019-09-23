import java.util.Queue;

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

        // Men's preferences
        int[] vivaldi = {0, 3, 2, 1, 4};
        int[] xavi = {0, 4, 1, 2, 3};
        int[] yuri = {1, 3, 0, 4, 2};
        int[] wolverine = {2, 0, 1, 3, 4};
        int[] zerq = {4, 1, 0, 3, 2};

        int[] arielInverse = inverser(ariel);
        int[] bettyInverse = inverser(betty);
        int[] carolInverse = inverser(carol);
        int[] daenerysInverse = inverser(daenerys);
        int[] emmaInverse = inverser(emma);

        for (int i = 0; i < arielInverse.length; i++) {
            System.out.println(arielInverse[i]);
        }
    }

    public static int[] inverser(int[] array) {
        int[] oldArray = new int[5];

        System.arraycopy(array, 0, oldArray, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            array[oldArray[i]] = i;
            System.out.println("oldArray Values " + oldArray[i]);
        }

        return array;
    }
}