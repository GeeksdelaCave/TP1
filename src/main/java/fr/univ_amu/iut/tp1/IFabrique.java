package fr.univ_amu.iut.tp1;

/**
 * Created by pyrrha on 23/11/2016.
 */
public interface IFabrique {
    IConnectable creer(String classe);
}
