import java.util.Scanner;

public class ComparandoStrings {

    public static void main(String[] args){
        String password = "123456";
        System.out.println("Digite sua senha");

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        // == não compara conteúdo, e sim a referência do objeto
        System.out.println(password.equals(pass));

        String x = "123456";
        String y = "123456";

        System.out.println(x == y);
    }
}
