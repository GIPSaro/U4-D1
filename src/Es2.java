import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci la prima Stringa: ");
        String string1 = in.nextLine();
        System.out.println("Inserisci la seconda Stringa: ");
        String string2 = in.nextLine();
        System.out.println("Inserisci la terza Stringa: ");
        String string3 = in.nextLine();


        String concat = string1 + " " + string2 + " " + string3;


        String reversedConcat = new StringBuilder(concat).reverse().toString();

        System.out.println("La concatenazione delle stringhe è: " + reversedConcat);

        in.close();
    }
}
