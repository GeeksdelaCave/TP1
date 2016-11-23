package fr.univ_amu.iut.tp1;

/**
 * Created by pyrrha on 23/11/2016.
 */
public class FabriqueConcrete implements IFabrique {

    public IConnectable creer(String classe) {
        switch (classe) {
            case "Cafetiere":
                return new Cafetiere();
            case "Radio":
                return new Radio();
            default:
                return null;
        }
    }
}
