import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Ordre> orderList = new ArrayList<Ordre>();

    public void takeOrder(Ordre ordre){
        orderList.add(ordre);
    }

    public void placeOrders(){

        for (Ordre ordre : orderList) {
            ordre.execute();
        }
        orderList.clear();
    }
}
