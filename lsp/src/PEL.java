//Ici le PEL peut importer Compte bancaire sans problème, sans être obligé d'implémenter une méthode de retrait, qu'il ne peut dans tous les cas pas utiliser.
public class PEL extends CompteBancaire {
    private final double tauxInteret = 0.03;
    protected double solde = 1000;

    public double getSolde() {
        return solde;
    }
}
