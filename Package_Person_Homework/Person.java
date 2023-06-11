package Package_Person_Homework;

public class Person {
    String name;
    char gender;
    int age;
  
    // Variable is changed to int, name has been changed to carYear to better reflect the variable's purpose.
  
    int carYear;
    boolean violations;
    double creditScore;

    public void display() {
        System.out.println("Customer name: " + name);
        System.out.println("Customer gender: " + gender);
        System.out.println("Customer age: " + age);    
        System.out.println("Customer car model/make: " + carYear);
        System.out.println("Customer has violations? : " + violations);
        System.out.println("Customer's credit score: " + creditScore);
    }

    public double getRate (double monthlyRate) {
        if (violations == true && creditScore <= 700) {
            monthlyRate = 500.00;
        } else {
            monthlyRate = 100.00;
        }
        return monthlyRate;
    }

    public double assumeGender (double adjustedRate) {
        if (gender == 'M' && age <= 25) {
            adjustedRate = 100;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }

    
    // A new carAgeAdjustment method has been implemented in order to adjust the premium for car age.
  
    public double carAgeAdjustment (double carYearAdjustment) {
        if (carYear < 2018) {

            // Hi Olga! Cars usually hit their bottom percentile value at 5 yers old. Given we're in 2023, the year in which cars start paying way less insurance would be 2018. Any car older than 2018 does not need to pay more insurance.

            carYearAdjustment = 0;
            
        } else {

            // Cars 2018 or newer should pay more insurance. 150 dollars seems like a pretty reasonable extra premium for newer cars.

            carYearAdjustment = 150;

        }

        return carYearAdjustment;
    }
}
