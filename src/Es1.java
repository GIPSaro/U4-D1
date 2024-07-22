import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
//Primoesercizio();
//Secondoesercizio();
        Terzoesercizio();
    }
    public static void Primoesercizio(){
        Scanner in = new Scanner(System.in);

        System.out.println("Primo numero");
        int num1 = in.nextInt();

        System.out.println("Secondo numero");
        int num2 = in.nextInt();

        int result = num1 * num2;

        System.out.println("Risultato:" + result);
        in.close();
    }
    public static void Secondoesercizio(){

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il numero");
        int numero = in.nextInt();
        System.out.println("Inserisci il testo");
        String text = in.nextLine();
        String concat = text + numero;
        System.out.println("Concatenazione:" + concat);
        in.close();
    }
    public static void Terzoesercizio(){

        Scanner in = new Scanner(System.in);

        String[] array = {"Giorgia","Titta", "Michela", "Giulia", "Giuliana", " "};
        System.out.println("Scrivi il tuo nome");
        String newName = in.nextLine();

        for(int i= array.length-2; i>=2; i--){
            array[i+1]= array[i];

        }
        array[2]= newName;
        System.out.println((Arrays.toString(array)));
        in.close();
    }
}
