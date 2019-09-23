import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Ariel 1, Betty 2, Carol 3, Daenerys 4, Emma 5
        // Vivaldi 1, Xavi 2, Yuri 3, Wolverine 4, Zerq 5

        String[] husband = {"Vivaldi", "Xavi", "Yuri", "Wolverine", "Zerq"};
        String[] wife = {"Ariel", "Betty", "Carol", "Daenerys", "Emma"};

        // Women's preferences
        int[] ariel = {2, 4, 1, 3, 5};
        int[] betty = {1, 2, 5, 3, 4};
        int[] carol = {2, 3, 4, 5, 1};
        int[] daenerys = {2, 5, 4, 3, 1};
        int[] emma = {3, 2, 5, 1, 4};

        // Men's preferences
        int[] vivaldi = {1, 4, 3, 2, 5};
        int[] xavi = {1, 5, 2, 3, 4};
        int[] yuri = {2, 4, 1, 5, 3};
        int[] wolverine = {3, 1, 2, 4, 5};
        int[] zerq = {5, 2, 1, 4, 3};
    }
}