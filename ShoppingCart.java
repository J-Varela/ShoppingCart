import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();

    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double getTotalCost() {
        double total = 0;
        for(Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

}

/*
    This example defines a 'ShoppingCart' class that stores  a list of 'Item' objects, and it provides methods
    for adding and removing items from the cart, as well as for calculating the total cost of all of the items
    in the cart.
 */
