import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Electronics implements ShopItem {
    String name;

    int price;

    Category category;

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int price() {
        return this.price;
    }

    @Override
    public Category category() {
        return this.category;
    }
}
