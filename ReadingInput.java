import java.util.Scanner;

public class ReadingInput {

    public static void main(String[] args){
        int base = 0;
        int height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base:");
        base = scanner.nextInt();
        System.out.println("Enter Height:");
        height = scanner.nextInt();
        area = 0.5 * base * height;

        System.out.println("Area : " + area);
    }

}