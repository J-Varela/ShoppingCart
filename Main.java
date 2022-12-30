public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("shirt", 29.99));
        cart.addItem(new Item("pants", 39.99));

        double totalCost = cart.getTotalCost();

        System.out.println(cart.getTotalCost());



    }
}
