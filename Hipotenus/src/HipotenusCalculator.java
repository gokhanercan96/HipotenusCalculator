import java.util.Scanner;

public class HipotenusCalculator {
    public static void main(String[] args) {

        int tabanKenari, dikKenar, denklem;
        double hipotenus;
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban Kenaın Uzunluğu: ");
        tabanKenari = inp.nextInt();

        System.out.print("Dik Kenarın Uzunluğu: ");
        dikKenar = inp.nextInt();

        denklem = ((tabanKenari*tabanKenari)+(dikKenar*dikKenar));
        hipotenus = Math.sqrt(denklem);
        System.out.print("Hipotenüs Uzunluğu: " + hipotenus);
    }
}
