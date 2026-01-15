public class ClientStandartService extends CalculateurRemise{


    public ClientStandartService(double remise) {
        super(remise);
    }

    @Override
    public String getTypeClient() {
        return "Standard";
    }
}