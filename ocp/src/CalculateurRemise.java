
//Ici se trouve la logique de calcul qui sera répartie entre les différents clients. On récupère le type de client avec un get, on détermine comment fonctionne le calculateur, puis le client gère sa partie.
public abstract class CalculateurRemise {

    protected double remise;

    public CalculateurRemise(double remise) {
        this.remise = remise;
    }

    public double calculateurTotal(double total) {
        return total * remise;
    }

    public abstract String getTypeClient();
}
