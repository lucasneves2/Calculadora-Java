import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    System.out.println("Digite o primeiro número:");
        float num1 = leia.nextFloat();

    System.out.println("Digite o segundo número:");
        float num2 = leia.nextFloat();

    System.out.println("Digite a operação desejada (+, -, *, /):");
        char operacao = leia.next().charAt(0); 
        
        float resultado = 0;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
            if (num1 == 0 || num2 == 0) {
                System.out.println("Erro: Divisão por zero não é permitida.");
                return; // Interrompe a execução do método
            } else {
                resultado = num1 / num2;
            }
            break;
            default:
                System.out.println("Operação inválida. Tente novamente.");
        }
        
        {
            System.out.println("O resultado é: " + resultado);
        }

        leia.close(); 
    }
    
}



        