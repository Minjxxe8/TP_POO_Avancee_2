//Cette classe implémente les 3 interfaces, étant donné qu'elle est multifonction. Le split des 3 interfaces est faite dans le cas où une nouvelle machine n'a qu'une ou deux fonctionnalités, pour éviter d'avoir des méthodes inutilisées.
public class ImprimanteMultifonction implements MachineScanInterface, MachinePrintInterface, MachineFaxInterface {

    public void print() {
        System.out.println("Impression en cours...");
    }

    public void scan() {
        System.out.println("Scan en cours...");
    }

    public void fax() {
        System.out.println("Fax envoyé...");
    }
}
