
//Pour ce projet, j'ai décider de rajouter un "factory" qui va s'occuper de uniquement récupérer une instance des différents clients avec leur remise. Le but est que ici ne se trouve aucune logique.
public class CalculateurRemiseFactory {
    public static CalculateurRemise creerCalculateur(int typeClient) {
        switch (typeClient) {
            case 1:
                return new ClientStandartService(1.0);
            case 2:
                return new ClientEtudiantService(0.9);
            case 3:
                return new ClientVipService(0.8);
            default:
               return null;
        }
    }
}
