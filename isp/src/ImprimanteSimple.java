//Cette classe implémente uniquement l'interface d'imprimante, sans être obligé d'implémenter les autres pour soulever une erreur.
public class ImprimanteSimple implements MachinePrintInterface {

    public void print() {
        System.out.println("Impression en cours...");
    }
}
