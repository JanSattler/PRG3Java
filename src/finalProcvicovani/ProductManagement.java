package finalProcvicovani;

import java.util.ArrayList;
import java.util.List;

/**
 * Trida, ktera slouzi pouze jako otestovani implementace OOP architektury dle zadani
 */
public class ProductManagement {

    /**
     * Metoda slouzi pro otestovani spravne implementovane architektury nize
     * Postupne odkomentuje radky kodu, pokud probehne cela metoda bez problemu
     * a vystupy budou odpovidat zadani, mate splneno
     */
    static void init(){
        ArrayList<BasicProduct> products = new ArrayList<>();
        BasicProduct keyboard = new BasicProduct("Keyboard", "Electronics", 650, 15.5);
        BasicProduct shirt = new BasicProduct("Shirt", "Apparel", 305, 15.5);
        BasicProduct charger = new BasicProduct("Charger", "Electronics", 1500, 6.49);
        products.add(keyboard);
        products.add(shirt);
        products.add(charger);

        //doopravdy implementuje interface Product?
//        Product bundle = new BundleProduct(products);
        //jak pocita cenu? Melo by vyjit 15.5+15.5+6.49
//        System.out.println(bundle.getPrice());
        //ziska spravne dostupny pocet kusu? mel by napsat 305
//        System.out.println(bundle.getQuantity());
        //jak je formatovany vystup?
//        bundle.printProductInfo();

        //Implementovali jste pro BasicProduct defaultni razeni spravne?
//        System.out.println(products);
//        Collections.sort(products);
//        System.out.println(products);
    }

}

/**
 * Rozhrani predstavujici produkut
 */
interface Product {

    /**
     * Metoda ziska a spocita cenu produktu
     * @return cena za kus produktu
     */
    double getPrice();

    /**
     * Metoda ziska/spocita pocet dostupnych kusu u produktu
     * @return pocet dostupnych kusu k prodeji
     */
    int getQuantity();

    /**
     * Vypise zakladni specifikace produktu
     */
    void printProductInfo();
}

/**
 * Trida reprezentujici prosty produkt
 */
class BasicProduct implements Product{
    String name;
    String category;
    int quantity;
    double price;

    public BasicProduct(String name, String category, int quantity, double price) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void printProductInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Available: " + quantity);
    }

    @Override
    public String toString() {
        return name + "[" + category + "]" + ", qty: " + quantity + ", unit price: " + price;
    }
}

/**
 * Trida, ktera je vasim ukolem k implementaci.
 * Blizsi specifikace tridy se nachazi v prilozenem pdf.
 * @implSpec rozhrani Product
 */
class BundleProduct {
    List<BasicProduct> bundle;
}