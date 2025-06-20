package accounting;

import java.util.List;

public class Invoice {


    // propiedades y métodos static
    static private Company brand = new Company("68323392y", "Boracay");
    static private byte lastId = 0;
    static private String get_ID() {
        // const year = new Date().getFullYear();
        String id = "";// String(year) + '/' + String(++this.#lastId);
        return id;
    }

    // declaración de propiedades preferiblemente privadas
    private String id = Invoice.get_ID();
    private Company client;
    private List<Item> items; // 
    private double iva;
    private double total = 0;

    // constructor
    Invoice(Company client, Product product, int amount, double iva) {
        // this.#items = [
        //     {
        //         product: product,
        //         amount: amount,
        //     },
        // ];
        this.iva = iva; // 1.21
        this.client = client;
    }

    Company getClient() {
        return client;
    }

    private void calculatePrice(int price) {
        this.total += price * this.iva;
    }

    public void printInvoice() {
        String invoice = """
                
        ${Invoice.#brand.name}
        Nif: ${Invoice.#brand.nif}
        
        Datos cliente
        Nombre: ${this.#client.name}
        Nif: ${this.#client.nif}
        
        Factura ${this.#id}
        
        ${this.#items
        .map((item) => {
            const tuple = item.product.renderInvoiceLine(item.amount);
            this.#calculatePrice(tuple[1]);
            return tuple[0];
        })
        .join('\n')}
        
        ----------------------------------------------
        Total + IVA ........... ${this.#total}
        `;
        """;
        
        System.out.println(invoice);
    }
}
