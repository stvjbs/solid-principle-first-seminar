package srp2;

import srp2.model.JsonPersister;
import srp2.model.OrderView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter order:");
        OrderView view = new OrderView();
        JsonPersister persister = new JsonPersister(view);
        persister.save();
    }
}
