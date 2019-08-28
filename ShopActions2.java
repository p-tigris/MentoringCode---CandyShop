package business;

public class ShopActions2 extends ShopActions {
    public void openShop() {
        System.out.println("Enter name and open store");
    }

    public static void main(String[] args) {
        ShopActions shopActions = new ShopActions();
        ShopActions shopActions2 = new ShopActions2();
        shopActions.openShop();
        shopActions2.openShop();

        OwnerName ownerName = new OwnerName();
        ownerName.setName("Shoumik");
        System.out.println(ownerName.getName());
    }
}
