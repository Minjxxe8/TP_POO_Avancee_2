public class ClientEtudiantService extends CalculateurRemise {

    public ClientEtudiantService(double remise) {
        super(remise);
    }

    @Override
    public String getTypeClient() {
        return "";
    }
}
