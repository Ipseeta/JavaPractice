package numbers;
import java.util.*;
import java.text.*;

/**
 * Created by ipseeta on 5/26/17.
 */
public class GPACalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many subjects do you have?: ");
        int classes = input.nextInt();
        String grades = "";
        double total = 0;
        double dec;

        for (int j = 0; j < classes; j++) {

            Scanner inputs = new Scanner(System.in);
            System.out.print("What is your Grade in subject "+(j+1)+"?: ");
            grades = inputs.nextLine();

            switch (grades) {
                case "A":
                    dec = 4;
                    total += dec;

                    break;
                case "B":
                    dec = 3;
                    total += dec;

                    break;
                case "C":
                    dec = 2;
                    total += dec;

                    break;
                case "D":
                    dec = 1;
                    total += dec;

                    break;
                case "F":
                    dec = 0;
                    total += dec;

                    break;
            }

        }

        double GPA = total / classes;
        System.out.println("Your GPA is "+GPA);


        DecimalFormat formatter = new DecimalFormat("0.##");
        System.out.println("If required in formatted form :"+formatter.format(GPA));
    }

}