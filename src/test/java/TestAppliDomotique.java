import fr.univ_amu.iut.tp1.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertSame;

/**
 * Created by pyrrha on 23/11/2016.
 */
public class TestAppliDomotique {

    @Test
    public void testTheArrayList() {
        Collection<IConnectable> listeDeReference = new ArrayList<IConnectable>();

        Cafetiere cafetiere = new Cafetiere();
        listeDeReference.add(cafetiere);
        AppliDomotique.ajouter(cafetiere);

        Radio radio = new Radio();
        listeDeReference.add(radio);
        AppliDomotique.ajouter(radio);

        assert (listeDeReference.containsAll(AppliDomotique.getListeObjetsConnectes()) &&
            AppliDomotique.getListeObjetsConnectes().containsAll(listeDeReference));
    }
}
