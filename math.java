import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        
        //System.out.println(Math.PI);
        //System.out.println(Math.E);


        double result;

        result = Math.pow(2,3);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.floor(3.99);
        result = Math.max(10, 20);
        result = Math.min(10, 20);


        System.out.println(result);


        Scanner scanner = new Scanner(System.in);


        double a;
        double b;
        double c;

        System.out.print("Enter the lenght of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        System.out.println("The hypotenuse (side c) is: " + c + "cm");


        double radius;
        double circumference;
        double erea;
        double volume;



        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        erea = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1fcm\n", circumference);
        System.out.printf("The erea is: %.1fcm²\n", erea);
        System.out.printf("The volume is: %.1fcm³\n", volume);




        scanner.close();






    }
}
