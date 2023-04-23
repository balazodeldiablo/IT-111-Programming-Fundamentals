public class MyDataTypes {
    public static void main (String[] args) {
        short daysInAYear = 365;
        int salary = 125000;
        long minutes = 2233720368L;
        float average = 1.8F;
        double dollarsAnHour = 26.5D;
        boolean value = true;
        char myChar = 'A';

        System.out.println("Last year had "+daysInAYear+" days. I earned about "+salary+" dollars. I worked for around "+minutes+" minutes.");
        System.out.println("Thus, I averaged around "+average+" cents per minute at "+dollarsAnHour+" an hour. I really need a raise!!");

        if (value == true) {
            System.out.println("My name is Andy. My initial is "+myChar+".");
        }
    }
}
