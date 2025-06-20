package accounting;

public class Product {

    private String sku;
    private String name;
    private int unityPrice;

    Product(String sku, String name, int unitaryPrice) {
        this.sku = sku;
        this.name = name;
        this.unityPrice = unitaryPrice;
    }

    private int calculatePrice(int items) {
        return items * unityPrice;
    }

    String renderInvoiceLine(int amount) {
        int value = calculatePrice(amount);
        String message = """
                %s: %s unidades a %sEU ..... Total %s
                """.formatted(name, amount, unityPrice, value);
        return message;
    }

}
