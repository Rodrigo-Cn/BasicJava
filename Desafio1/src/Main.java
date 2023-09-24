import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        try {
            if (num2 < num1) {
                throw new IllegalArgumentException("Número 2 não pode ser menor");
            }
            else {
                for (int i=0; i<(num2-num1); i++){
                    System.out.println(i+1);
                }
            }
        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }
    }
}