import com.product.Bread;
import com.product.Choclate;
import com.product.ProductForSale;

public class Store {
    public static void main(String[] args) {
 ProductForSale[] products = new ProductForSale[5];
 products[0] = new Choclate("sweet", 14, "chocolate ", "oval", "big", true);
 products[1] = new Bread("bread", 5, "bakery","brown", "long");
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
       for(ProductForSale product : products) {
           if (product != null) {
               product.ShowDetails();
           }
       }
    }


}