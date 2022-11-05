import java.util.List;
import java.util.Optional;

public class Shop <T extends ShopItem> {

    public void addItem(T item){
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
