import java.util.Scanner;

public class Es3 {
    public static void main (String[] args){
        //pariDispari();
        perimetro();
    }
    public static void pariDispari(){
        Scanner in = new Scanner((System.in));
        System.out.println(("Inserisci un numero: "));
        int numero= in.nextInt();

        if(numero%2 == 0){
            System.out.println((0));
        }else {
            System.out.println(1);
        }
        in.close();
    }
    public static void perimetro(){
        Scanner in = new Scanner((System.in));
        System.out.println("Base");
        double base = in.nextDouble();
        System.out.println("Altezza");
        double altezza = in.nextDouble();
        System.out.println("il perimetro è: " + (base+altezza)*2);
        in.close();
    }
}
