public class DemandeVenteAction implements Ordre{
    private Stock abcStock;

    public DemandeVenteAction(Stock abcStock){ this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.passeOrdrePourVendre();
    }
}
