package fr.univ_amu.iut.tp1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Created by pyrrha on 23/11/2016.
 */
public class AppliDomotique {

    private static Collection<IConnectable> listeObjetsConnectes = new ArrayList<IConnectable>();

    public static void main(String[] args) {

        do {
            try {
                //Class<?> obj =  Class.forName(nom);
                //c = (IConnectable) obj.newInstance();

                Scanner scanner = new Scanner(System.in);
                String lu = scanner.nextLine();
                if (lu == "") break;

                IFabrique fabrique = new FabriqueConcrete();
                IConnectable objetConnecte = fabrique.creer(lu);
                objetConnecte.configurer();
                listeObjetsConnectes.add(objetConnecte);
            } catch (NullPointerException e) {
                System.out.println("L'objet n'existe pas : " + e.getMessage());
            }
        } while (true);
    }

    public static void ajouter(IConnectable iconnectable) {
        iconnectable.configurer();
        listeObjetsConnectes.add(iconnectable);
    }

    /**
     * Pour les tests
     * @return La liste des objets connectés
     */
    public static Collection<IConnectable> getListeObjetsConnectes() {
        return listeObjetsConnectes;
    }
}
