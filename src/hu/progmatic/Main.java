package hu.progmatic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérlek, adj meg egy természetes számot: ");
        int szam = scanner.nextInt();
        scanner.nextLine();

        int oszto = 1;
        int db = 0;
        while (oszto <= szam) {
            if (szam % oszto == 0) {
                db ++;
                System.out.println("A szám osztója: " + oszto);
            }
            oszto ++;
        }

        System.out.println();
        System.out.println(" " + db + " db osztója van a megadott számnak.");
        //System.out.println("oszto " + oszto);
        // friss
    }
}
