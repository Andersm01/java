import java.util.Random;

public class random_numbers {
    public static void main(String[] args) {
        
        Random random = new Random();

        int number;
        double number1;
        boolean isHeads;

        number = random.nextInt(1,101);
        number1 = random.nextDouble();
        isHeads = random.nextBoolean();

        System.out.println(number);
        System.out.println(number1);
        System.out.println(isHeads);

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    


    }
}
