package fr.univ_amu.iut.tp1;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Created by pyrrha on 23/11/2016.
 */
public class AppliDomotique {

    private static Collection<IConnectable> listeObjetsConnectes = new ArrayList<IConnectable>();

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
                        ajouter(radio);
                        break;
                    case 2:
                        Cafetiere cafetiere = new Cafetiere();
                        ajouter(cafetiere);
                        break;
                }
        } while (saisie != 0);
    }

    public static void ajouter(IConnectable iconnectable) {
        iconnectable.configurer();
        listeObjetsConnectes.add(iconnectable);
    }

    public static Collection<IConnectable> getListeObjetsConnectes() {
        return listeObjetsConnectes;
    }
}
