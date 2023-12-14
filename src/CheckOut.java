import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        double total = 0;
        do{
            total += InputHelper.getRangedDouble(scan, "Please enter the item price: $", 0.50, 9.99);
            if (!InputHelper.getYNConfirm(scan, "Do you want to add another item? [Y/N]")){
                done = true;
            }
        } while (!done);
        System.out.printf("Total Cost in $: %8.2f", total);
    }

}