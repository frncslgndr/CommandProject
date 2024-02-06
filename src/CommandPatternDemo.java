public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        DemandeAchatAction demandeAchatAction = new DemandeAchatAction(abcStock);
        DemandeVenteAction demandeVenteAction = new DemandeVenteAction(abcStock);

        Broker broker = new Broker();

        broker.takeOrder(demandeAchatAction);
        broker.takeOrder(demandeVenteAction);

        broker.placeOrders();
    }
}