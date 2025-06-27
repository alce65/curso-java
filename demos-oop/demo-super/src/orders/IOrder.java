package orders;
import java.util.Set;

import containers.IContainer;
import products.IProduct;

public interface IOrder {

    // Getters

    String getReference();
	Set<IContainer> getContainers();
	
    // Lógica de negocio
    
    Set<IProduct> getCalculatedProducts();
    void addContainer(IContainer container);
	IContainer addProduct(IProduct product);

}
