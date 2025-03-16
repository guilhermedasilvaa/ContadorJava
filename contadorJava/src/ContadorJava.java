import java.util.Scanner;
import java.util.Locale;

public class ContadorJava{
    /**
     * @param args
     * @throws ParametrosInvalidosException
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o Primeiro valor: ");
        int firstValue = scanner.nextInt();
        System.out.println("Digite o Segundo valor (deve ser menor que o primerio): ");
        int secondValue = scanner.nextInt();
        try{
            loopThrough(firstValue, secondValue);
        }catch(ParametrosInvalidosException e){
            System.out.println("o segundo valor deve ser menor que o primeiro");

        }
    }

    static int loopThrough(int firstValue, int secondValue) throws ParametrosInvalidosException{

        if(firstValue < secondValue)
        {
           throw new ParametrosInvalidosException(); 
        }
        int newValue = firstValue - secondValue;
        for (int i = 1; i <= newValue; i++)
        {
            System.out.println(i);
        }
        return newValue;
    }
}
