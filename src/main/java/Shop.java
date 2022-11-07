import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Getter


public class Shop <T extends ShopItem> {
    private T item;
    private static ShopItem Clothes;
    private static ShopItem Electronics;
    private static ShopItem Fruits;
    private static List products = new ArrayList<>();

    public static void main(String[] args) {
        Shop shop = new Shop<>();
        shop.addItem(Clothes);
        shop.addItem(Electronics);
        shop.addItem(Fruits);
    }
    
    public void addItem(T item){
        products.add(new Clothes("dd",34, Category.ON_SALE));

    }

    public List<T> findByCategory (Category cat){
    }

    public List<T> findWithLowerPrice(int maxPrice){
    }

    public Optional<T> findByName(String name){
    }

    public Optional<T> removeItem(String name){
    }

}
