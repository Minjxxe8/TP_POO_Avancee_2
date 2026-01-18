//Ici, j'ai décidé de faire en sorte que cette classe affiche seulement les soldes des comptes, quelque chose que le PEL et le compte courant partagent.
public abstract class CompteBancaire {

    protected double solde = 100;
    public double getSolde() {
        return solde;
    }

}
