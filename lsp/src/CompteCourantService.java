//Ici, le Compte Courant peut aussi hériter de CompteBancaire et rajouter sa propre méthode de retrait sans altérer le comportement de CompteBancaire et PEL.
public class CompteCourantService extends CompteBancaire {
    public void retirer(double montant) {
        solde -= montant;
        System.out.println("Retrait effectué. Nouveau solde : " + solde);
    }
}
