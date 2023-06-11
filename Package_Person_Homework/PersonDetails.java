package Package_Person_Homework;

public class PersonDetails {
    public static void main(String[] args) {
        Person firstPerson;
        Person secondPerson;
        Person thirdPerson;


        firstPerson = new Person();
        secondPerson = new Person();
        thirdPerson = new Person();


        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 30;
        firstPerson.carYear = 2010;
        firstPerson.violations = false;
        firstPerson.creditScore = 700;

        secondPerson.name = "Jeremy";
        secondPerson.gender = 'M';
        secondPerson.age = 21;
        secondPerson.carYear = 2019;
        secondPerson.violations = true;
        secondPerson.creditScore = 550;

        thirdPerson.name = "Mariana";
        thirdPerson.gender = 'F';
        thirdPerson.age = 54;
        thirdPerson.carYear = 2022;
        thirdPerson.violations = true;
        thirdPerson.creditScore = 600;

      
        // Hi Olga! Here's my final assignment of the course. I just wanted to thank you for everything I learned throughout the course. It's truly been a blessing having you as a teacher. Happy summer break!
      
      
        firstPerson.display();
        System.out.println("Preliminary rate for " + firstPerson.name + ": " + firstPerson.getRate(0) + " dollars.");
        System.out.println("Adjustments to gender: +" + firstPerson.assumeGender(0) + " dollars.");
        System.out.println("Adjustments to car year: +" + firstPerson.carAgeAdjustment(0) + " dollars.");
        System.out.println("Here is " + firstPerson.name + "'s monthly premium: " + (firstPerson.getRate(0) + firstPerson.assumeGender(0) + firstPerson.carAgeAdjustment(0)) + "\n");

        secondPerson.display();
        System.out.println("Preliminary rate for " + secondPerson.name + ": " + secondPerson.getRate(0) + " dollars.");
        System.out.println("Adjustments to gender: +" + secondPerson.assumeGender(0) + " dollars.");
        System.out.println("Adjustments to car year: +" + secondPerson.carAgeAdjustment(0) + " dollars.");
        System.out.println("Here is " + secondPerson.name + "'s monthly premium: " + (secondPerson.getRate(0) + secondPerson.assumeGender(0) + secondPerson.carAgeAdjustment(0)) + "\n");

        thirdPerson.display();
        System.out.println("Preliminary rate for " + thirdPerson.name + ": " + thirdPerson.getRate(0) + " dollars.");
        System.out.println("Adjustments to gender: +" + thirdPerson.assumeGender(0) + " dollars.");
        System.out.println("Adjustments to car year: +" + thirdPerson.carAgeAdjustment(0) + " dollars.");
        System.out.println("Here is " + thirdPerson.name + "'s monthly premium: " + (thirdPerson.getRate(0) + thirdPerson.assumeGender(0) + thirdPerson.carAgeAdjustment(0)) + "\n");

    }
}
