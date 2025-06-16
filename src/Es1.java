public class Es1 {
    public static void main(String[] args) {


    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static void concatenation(String stringa, int num1) {
        System.out.println("La stringa è: " + num1);
    }

    public static String[] inserisciInArray(String[] array, String testo) {

        String[] newArray = new String[6];

        newArray[0] = array[0];
        newArray[1] = array[1];
        newArray[2] = testo;
        newArray[3] = array[2];
        newArray[4] = array[3];
        newArray[5] = array[4];

        return newArray;
    }

}

