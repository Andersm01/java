public class variabler {


    public static void main(String[] args){

        System.out.println("I like pizza!");
        
        int age = 30;
        int year = 2025;
        int quantity = 1;

        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);

        System.out.println("The year is " + year);


        double price = 19999.99;
        double gpa = 3.5;
        double temp = -12.5;

        System.out.println(temp);

        System.out.println();

        System.out.println("$ " + price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(symbol);
        System.out.println(grade);
        System.out.println(currency);

        System.out.println();

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;


        System.out.println(isOnline);
        System.out.println(isStudent);

        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are NOT a student");
        }

        System.out.println();

        String name = "Anders Monsen";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "Red";

        System.out.println("Hello " + name);
        System.out.println("Your favorite food is: " + food);
        System.out.println("Your email is " + email);

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old"); 
        System.out.println("Your gpa is: " + gpa); 
        System.out.println("Your average letter grade is: " + grade); 

        System.out.println();

        System.out.println("You choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }



        }
        
}