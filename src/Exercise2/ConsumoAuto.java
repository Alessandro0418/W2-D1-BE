package Exercise2;

import java.util.Scanner;

public class ConsumoAuto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci i km percorsi: ");
            int km = Integer.parseInt(scanner.nextLine());

            System.out.println("Inserisci i litri di carburante consumati: ");
            int litri = Integer.parseInt(scanner.nextLine());

            int consumo = km / litri;

            System.out.println("Consumo: " + consumo + "km/l");
        } catch (ArithmeticException e) {
            System.out.println("⚠️ Errore: Divisione per zero. I litri non possono essere 0.");
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Inserisci solo numeri interi.");
        }
        scanner.close();
    }
}
