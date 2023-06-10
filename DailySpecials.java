import java.util.Scanner;

public class DailySpecials {
    public static void main (String[]args) {

        String days = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a week day (M - F).");

        days = input.next();
        days = days.toLowerCase();

        String coffee = "";
        double price = 0;
        int quantity;
        double total;
        boolean run = true;

        while (run) {

            switch (days) {
                case "monday":
                    coffee = "Latte";
                    price = 3.50;
                    run = false;
                    break;

                case "tuesday":
                    coffee = "Frappe";
                    price = 4.50;
                    run = false;
                    break;


                case "wednesday":
                    coffee = "Mocha";
                    price = 3.00;
                    run = false;
                    break;


                case "thursday":
                    coffee = "Capuccino";
                    price = 3.50;
                    run = false;
                    break;


                case "friday":
                    coffee = "Macchiato";
                    price = 2.50;
                    run = false;
                    break;


                case "saturday":
                case "sunday":
    
                    System.out.println("Please enter a weekday. Monday to Friday only!");
                    input = new Scanner(System.in);
                    days = input.next();
                    days = days.toLowerCase();

                default: 
                    System.out.println("Invaild input. Enter a Weekday!");
                    input = new Scanner(System.in);
                    days = input.next();
                    days = days.toLowerCase();
            }
        }

        String cap = days.substring(0, 1).toUpperCase() + days.substring(1);
        System.out.print(cap + "'s coffee special of the day is " + coffee + ". The price is ");
        System.out.printf("$%.2f.%n", price);
        System.out.println("How many " + coffee + "s would you like to order?");

        quantity = input.nextInt();
        total = price * quantity;

        while (!run) {

            if (quantity < 0) {
                System.out.println("That's not a valid input. Use positive integers only.");
                quantity = input.nextInt();
            } else if (quantity == 0) {
                System.out.println("Oop! Looks like you dont like coffee!");
                run = true;
            } else if (quantity == 1) {
                System.out.println("Looks like you'll be ordering " + quantity + " " + coffee + ". The total for your order is: ");
                System.out.printf("$%.2f.%n", total);
                run = true;
            } else {

                System.out.print("That is " + quantity + " " + coffee + "s. The total for your order is ");
                System.out.printf("$%.2f.%n", total);

                if (quantity > 1 && quantity < 5) {
                    run = true;

                } else if (quantity >= 5 && quantity < 10) {
                    System.out.print("We have a 10% discount promotion on orders over 5 items!! Your new total is: ");
                    total *= 0.9;
                    System.out.printf("$%.2f.%n", total);
                    run = true;

                } else if (quantity >=10) {
                    System.out.print("We have a 20% discount promotion on orders over 10 items!! Your new total is: ");
                    total *= 0.8;
                    System.out.printf("$%.2f.%n", total);
                    run = true;

                }
            }
        }
    }
}
