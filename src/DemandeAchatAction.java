public class DemandeAchatAction implements Ordre{
    private Stock abcStock;

    public DemandeAchatAction(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.passeOrdrePourAcheter();
    }

}
