//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import.java.util.Arrays
public class Main {


    String[] arraySm = {"uno", "due", "tre", "quattro", "cinque"};
    String insert = "sono out";
    String[] risultato = Es1.inserisciInArray(arraySm, insert);

    public static void main(String[] args) {

    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatenation(String string, int num) {
        return string + num;
    }

    {
        String[] arraySium = {"uno", "due", "tre", "quattro", "cinque"};
        String inserire = "sono dentro";

        String[] risultato = Es1.inserisciInArray(arraySium, inserire);
        System.out.println(Arrays.toString(risultato));
    }

