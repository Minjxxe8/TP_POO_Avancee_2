public class ClientVipService extends CalculateurRemise {

    public ClientVipService(double remise) {
        super(remise);
    }

    @Override
    public String getTypeClient() {
        return "VIP";
    }
}
