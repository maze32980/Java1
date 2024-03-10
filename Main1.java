public class Main1 {
    public static void main(String[] args) {
        System.out.println("Using a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("Using a while loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        System.out.println("Using a do-while loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }
}
