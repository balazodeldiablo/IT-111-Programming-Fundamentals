import java.util.Scanner;

public class DailySpecials {
    public static void main (String[]args) {
        String specials = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a week day (M - F).");

        specials = input.next();

        String coffee;
        double price;
        int quantity;
        double total;

        switch (specials) {
            case "Monday":
                coffee = "Latte";
                price = 3.50;
                System.out.print(specials + "'s coffee special of the day is " + coffee + ". The price is ");
                System.out.printf("$%.2f.%n", price);
                System.out.println("How many " + coffee + "s would you like to order?");

                quantity = input.nextInt();

                if (quantity < 0) {
                    System.out.println("That's not a valid input. Use positive integers only.");
                    break;
                }

                total = price * quantity;

                switch (quantity) {
                    case 0:
                    System.out.println("Oop! Looks like you dont like coffee!");
                    break;

                    case 1:
                    System.out.println("Looks like you'll be ordering " + quantity + " " + coffee + ".");
                    break;

                    default:
                    System.out.print("That is " + quantity + " " + coffee + "s. The total for your order is ");
                    System.out.printf("$%.2f.%n", total);

                }
                break;
            
            case "Tuesday":
                coffee = "Frappe";
                price = 4.50;
                System.out.print(specials + "'s coffee special of the day is " + coffee + ". The price is ");
                System.out.printf("$%.2f.%n", price);

                System.out.println("How many " + coffee + "s would you like to order?");

                quantity = input.nextInt();

                if (quantity < 0) {
                    System.out.println("That's not a valid input. Use positive integers only.");
                    break;
                }

                total = price * quantity;

                switch (quantity) {
                    case 0:
                    System.out.println("Oop! Looks like you dont like coffee!");
                    break;

                    case 1:
                    System.out.println("Looks like you'll be ordering " + quantity + " " + coffee + ".");
                    break;

                    default:
                    System.out.print("That is " + quantity + " " + coffee + "s. The total for your order is ");
                    System.out.printf("$%.2f.%n", total);

                }
                break;
            
            case "Wednesday":
                coffee = "Mocha";
                price = 3.00;
                System.out.print(specials + "'s coffee special of the day is " + coffee + ". The price is ");
                System.out.printf("$%.2f.%n", price);

                System.out.println("How many " + coffee + "s would you like to order?");

                quantity = input.nextInt();

                if (quantity < 0) {
                    System.out.println("That's not a valid input. Use positive integers only.");
                    break;
                }

                total = price * quantity;

                switch (quantity) {
                    case 0:
                    System.out.println("Oop! Looks like you dont like coffee!");
                    break;

                    case 1:
                    System.out.println("Looks like you'll be ordering " + quantity + " " + coffee + ".");
                    break;

                    default:
                    System.out.print("That is " + quantity + " " + coffee + "s. The total for your order is ");
                    System.out.printf("$%.2f.%n", total);

                }
                break;
            
            case "Thursday":
                coffee = "Capuccino";
                price = 3.50;
                System.out.print(specials + "'s coffee special of the day is " + coffee + ". The price is ");
                System.out.printf("$%.2f.%n", price);  

                System.out.println("How many " + coffee + "s would you like to order?");

                quantity = input.nextInt();

                if (quantity < 0) {
                    System.out.println("That's not a valid input. Use positive integers only.");
                    break;
                }

                total = price * quantity;

                switch (quantity) {
                    case 0:
                    System.out.println("Oop! Looks like you dont like coffee!");
                    break;

                    case 1:
                    System.out.println("Looks like you'll be ordering " + quantity + " " + coffee + ".");
                    break;

                    default:
                    System.out.print("That is " + quantity + " " + coffee + "s. The total for your order is ");
                    System.out.printf("$%.2f.%n", total);

                }
                break;
                
            case "Friday":
                coffee = "Macchiato";
                price = 2.50;
                System.out.print(specials + "'s coffee special of the day is " + coffee + ". The price is ");
                System.out.printf("$%.2f.%n", price);  

                System.out.println("How many " + coffee + "s would you like to order?");

                quantity = input.nextInt();

                if (quantity < 0) {
                    System.out.println("That's not a valid input. Use positive integers only.");
                    break;
                }

                total = price * quantity;

                switch (quantity) {
                    case 0:
                    System.out.println("Oop! Looks like you dont like coffee!");
                    break;

                    case 1:
                    System.out.println("Looks like you'll be ordering " + quantity + " " + coffee + ".");
                    break;

                    default:
                    System.out.print("That is " + quantity + " " + coffee + "s. The total for your order is ");
                    System.out.printf("$%.2f.%n", total);

                }
                break;
                
            default:
                System.out.println("Input error. Please enter a weekday or check your spelling.");
                break;

        }
    }
}
