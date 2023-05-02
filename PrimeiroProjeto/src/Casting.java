import java.util.Scanner;

public class Casting {
    public static void main(String[] args){
        //Conversão de tipos primitivos (casting)
        double dd = 10.10;
        short ss = 32;

        Scanner scanner = new Scanner(System.in);
        int z = (int) scanner.nextDouble();

        System.out.println(z);
    }
}
