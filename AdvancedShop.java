package business;

public abstract class AdvancedShop implements Shop {


    public void openShop() {
        System.out.println("Open shop");
    }


    public void sell() {
        System.out.println("Sell goods");
    }

    public abstract String enterName();
}
