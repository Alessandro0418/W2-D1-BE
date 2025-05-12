package Exercise1;

import java.util.Random;
import java.util.Scanner;

public class ArrayEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1; // tra 1 e 10
        }

        boolean continueLoop = true;

        while (continueLoop) {

            System.out.print("Array corrente: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();


            System.out.print("Inserisci la posizione (0-4) dove vuoi inserire il numero (o -1 per uscire): ");
            int position;
            try {
                position = Integer.parseInt(scanner.nextLine());
                if (position == -1) {
                    continueLoop = false;
                    break;
                }


                System.out.print("Inserisci il valore da mettere (0 per uscire): ");
                int value = Integer.parseInt(scanner.nextLine());

                if (value == 0) {
                    continueLoop = false;
                    break;
                }


                numbers[position] = value;

            } catch (IndexOutOfBoundsException e) {
                System.out.println("⚠️ Errore: posizione non valida. Inserisci un valore tra 0 e 4.");
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Inserisci solo numeri interi.");
            }
        }

        System.out.println("Programma terminato.");
        scanner.close();
    }
}
