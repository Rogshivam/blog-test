import java.util.Scanner;

public class whileLoop 
    public static void main(String[] arg) {
        int num = 1;
        while (num <= 10 ) {
            System.out.println(num);
            num = num + 1;
        }

        int count = 500;
        while (count >= 200) {
            System.out.println(count);
            count -= 1;
        }

        // Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            // int inp = input.nextInt();
            int inp = 10;
            System.out.println("Number is :" + inp);
                    i++;
        }
    }
}
