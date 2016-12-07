import org.junit.Test;
import java.util.Scanner;

/**
 * Created by Sebastian on 03.12.2016.
 * A simple console calculator.
 */
public class Calculator {
    private double number1;
    private double number2;
    private double result;
    private String operator;
    private boolean cont;

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    /**
     * Constructs a new Calculator
     */
    public Calculator(){
        cont = true;
        runCalculator();
    }

    @Test
    /**
     * starts the calculator
     */
    public void runCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Taschenrechner Version 1.0 - Created by Sebastian Tratter");
        while (cont){
            System.out.println("Bitte geben Sie die erste Zahl ein");
            number1 = input.nextDouble();
            System.out.println("Bitte geben Sie einen Operator ein.");
            operator = input.next();
            System.out.println("Bitte geben Sie die zweite Zahl ein");
            number2 = input.nextDouble();

            if(operator.equals("+")) {
                result=number1+number2;
            } else if (operator.equals(("-"))) {
                result=number1-number2;
            } else if(operator.equals("*")) {
                result=number1*number2;
            } else if (operator.equals("/")) {
                result=number1/number2;
            } else{
                System.out.println("Ungültige eingabe");
                return;
            }

            System.out.println("Ergebnis: "+result);
            System.out.println("");
            System.out.println("---------------");
            System.out.println("Fortfahren? Y/N");
            if(input.next().equals("Y"))
                cont = true;
            else
                cont = false;
        }
    }
}