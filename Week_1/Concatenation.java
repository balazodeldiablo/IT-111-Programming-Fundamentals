public class Concatenation {
    public static void main(String[] args) {
        String color = "red";
        int money = 2_000_000;

        System.out.println(color+money);

        // This shows the two variables concatenated without a space in between, making the presentation not very visually appealling. 
        // Instead, we add a space in between the two variables. 
        // Notice the difference in output making the presentation more visually appealing.

        System.out.println(color+" "+money);
        System.out.println("My favorite color is "+color+" and I won "+money+" in the lottery yesterday!");

      
    }
}
