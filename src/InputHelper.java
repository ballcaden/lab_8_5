import java.util.Scanner;

public class InputHelper {
    public static void main(String[] args) {
        //Test Methods
        Scanner scan = new Scanner(System.in);


        int x = getInt(scan, "Enter an int: ");
        System.out.print(x);

        System.out.println();

        String input = getRegExString(scan, "Enter your phone number: ", "\\d{3}-\\d{3}-\\d{4}");
        System.out.print(input);

        System.out.println();

        int y = getRangedInt(scan, "Enter an int", 1, 10);
        System.out.print(y);

        System.out.println();

        String input2 = getNonZeroLenString(scan, "Enter a string(Blank space will result in an error): ");
        System.out.print(input2);

        System.out.println();

        double xy = getDouble(scan, "Enter a double: ");
        System.out.print(xy);

        System.out.println();

        double xyx = getRangedDouble(scan, "Enter a double:", 1.0, 10.0);
        System.out.print(xyx);

        System.out.println();

        int xXYY = getPositiveNonZeroInt(scan, "Enter a positive number, that is greater than zero: ");
        System.out.print(xXYY);

        System.out.println();

        boolean ynEquals = getYNConfirm(scan, "Do you want to continue?(Y/N)");
        System.out.print(ynEquals);

        System.out.println();

    }

    public static int getInt(Scanner in, String prompt) {
        boolean done = false;
        int x = 0;

        System.out.println(prompt);
        do {
            if(in.hasNextInt()) {
                x = in.nextInt();
                done = true;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
            in.nextLine(); //clear buffer
        } while (!done);
        return x;
    }

    public static String getRegExString(Scanner in, String prompt, String regEx) {
        boolean done = false;
        String input;
        do {
            System.out.println(prompt);
            input = in.nextLine();
            if (input.matches(regEx)) {
                done = true;
            } else {
                System.out.println("Invalid Input.");
            }
        } while (!done);
        return input;
    }

    public static int getRangedInt(Scanner in, String prompt, int min, int max){
        boolean done = false;
        int x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextInt()) {
                x = in.nextInt();
                if (x >= min && x <= max) {
                    done = true;
                }
                else{
                    System.out.println("Out of range. Please try again.");
                }
            }
            else{
                System.out.println("Invalid input. Please try again.");
            }
            in.nextLine(); //clear buffer
        } while (!done);
        return x;
    }

    public static String getNonZeroLenString(Scanner in, String prompt) {
        boolean done = false;
        String input;
        do {
            System.out.println(prompt);
            input = in.nextLine();
            if(input.length() > 0) {
                done = true;
            } else {
                System.out.println("Error. Blank space detected");
            }
        } while (!done);
        return input;
    }

    public static double getDouble(Scanner in, String prompt) {
        boolean done = false;
        double x = 0;

        System.out.println(prompt);
        do {
            if(in.hasNextDouble()) {
                x = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input. Please try again");
            }
            in.nextLine(); //clears buffer
        } while (!done);
        return x;
    }

    public static double getRangedDouble(Scanner in, String prompt, double min, double max) {
        boolean done = false;
        double x = 0;
        System.out.println(prompt);
        do {
            if(in.hasNextDouble()) {
                x = in.nextDouble();
                if (x >= min && x <= max) {
                    done = true;
                } else {
                    System.out.println("Out of range. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please try again");
            }
            in.nextLine(); //clears buffer
        } while (!done);
        return x;
    }

    public static int getPositiveNonZeroInt(Scanner in, String prompt) {
        boolean done = false;
        int x = 0;
        System.out.println(prompt);
        do {
            if(in.hasNextInt()) {
                x = in.nextInt();
                if(x > 0){
                    done = true;
                } else {
                    System.out.println("Please enter a positive number, that is not zero");
                }
            } else {
                System.out.println("Invalid input. Please try again");
            }
            in.nextLine(); //clears buffer
        } while (!done);
        return x;
    }

    public static boolean getYNConfirm(Scanner in, String prompt) {
        boolean done = false;

        String input;

        do{
            System.out.println(prompt);
            input = in.nextLine();
            if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")) {
                done = true;
            } else {
                System.out.println("Invalid input");
            }
        } while (!done);

        if(input.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }


    }

}
