package srp2.model;

import java.io.FileWriter;
import java.io.IOException;

public class JsonPersister implements Persistable {
    private OrderView view;

    public JsonPersister(OrderView view) {
        this.view = view;
    }

    @Override
    public void save() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            Order order = view.getOrder();
            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":" + order.getQuantity() + ",\n");
            writer.write("\"price\":" + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
