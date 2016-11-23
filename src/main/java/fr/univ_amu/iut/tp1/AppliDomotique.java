package fr.univ_amu.iut.tp1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by pyrrha on 23/11/2016.
 */
public class AppliDomotique {

    public static void main(String[] args) {
        int saisie = 0;

        do {
                Scanner scanner = new Scanner(System.in);
                saisie = scanner.nextInt();

                switch (saisie) {
                    case 0:
                        System.out.println("Adèle : \"This is the end...\"");
                        break;
                    case 1:
                        Radio radio = new Radio();
                        radio.configurer();
                        break;
                    case 2:
                        Cafetiere cafetiere = new Cafetiere();
                        cafetiere.configurer();
                        break;
                }
        } while (saisie != 0);
    }

}
