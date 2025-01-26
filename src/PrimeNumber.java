import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt(); // taken input from the user thru keyboard

        int count = 0;
        // num=7

        //1. i=1 true (loop condition) num =7  count=1
        //2. i=2 true         count=1
        //3. i=3 true         count=1
        //4. i=4 true         count=1
        // 5. i=5 true        count=1
        // 6. i=6 true        count=1
        //7. i=7  true        count=2
        //8. i=8 false hence loop will get terminated
        // 30
         // 2 to 29

        for (int i = 2; i <num; i++) {
            if(num%i==0){
                count++;
                break; // loop will get terminated here no matter which iteration you are.
            }


        }

        if(count==1){
            System.out.println("Not a Prime Number");
        }

        else {
            System.out.println("Prime Number");
        }
    }
}
