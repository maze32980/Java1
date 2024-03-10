public class Main2 {
    public static void main(String[] args) {
        System.out.println("Using a for loop:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Using a while loop:");
        int j = 5;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }

        System.out.println("Using a do-while loop:");
        int k = 5;
        do {
            System.out.println(k);
            k--;
        } while (k >= 1);
    }
}
