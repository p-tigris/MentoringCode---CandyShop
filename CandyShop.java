package business;

import java.util.Scanner;
import java.util.Random;

public class CandyShop extends AdvancedShop {

    public boolean isOpen;

    public String enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        OwnerName ownerName = new OwnerName();
        ownerName.setName(name);
        return ownerName.getName();
    }

    public void openShop() {
        Scanner scanner = new Scanner(System.in);
        String enteredName = enterName();
        while (true) {
            System.out.print("Welcome to " + enteredName + "'s Candy Shop. Would you like to open? Yes/No ");
            String openYesNo = scanner.nextLine();
            if (openYesNo.equals("Yes") || openYesNo.equals("yes")) {
                System.out.println(enteredName + "'s Candy Shop is now open for business!");
                isOpen = true;
                break;
            } else if (openYesNo.equals("No") || openYesNo.equals("no")) {
                System.out.println(enteredName + "'s Candy Shop is closed");
                break;
            } else {
                System.out.println("Invalid answer");
            }
        }
    }

    public void closeShop() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Would you like to close the shop? Yes/No ");
            String closeYesNo = scanner.nextLine();
            if (closeYesNo.equals("Yes") || closeYesNo.equals("yes")) {
                System.out.println("The Candy Shop is now closed");
                isOpen = false;
                break;
            } else if (closeYesNo.equals("No") || closeYesNo.equals("no")) {
                System.out.println("Okay, keep selling!");
                break;
            } else {
                System.out.println("Invalid answer");
            }
        }
    }

    public void sell() {
        String[] candies = {"Skittles", "M&Ms", "Jolly Ranchers", "Snickers"};
        int sales = 0;
        int customer = 1;
        while (isOpen) {
            Scanner scanner = new Scanner(System.in);
            int randomCandies = new Random().nextInt(candies.length);
            double randomPrice = Math.random() * 10;
            randomPrice = randomPrice * 100;
            randomPrice = Math.floor(randomPrice) / 100;
            System.out.print("Customer #" + customer + " wants to buy " + candies[randomCandies] + " for $" + randomPrice + ". Deal? Yes/No ");
            String dealYesNo = scanner.nextLine();
            if (dealYesNo.equals("Yes") || dealYesNo.equals("yes")) {
                System.out.println("Sold!");
                sales++;
                customer++;
            } else if (dealYesNo.equals("No") || dealYesNo.equals("no")) {
                System.out.println("Customer #" + customer + " has left the shop");
                customer++;
            } else {
                System.out.println("Customer is confused and wants to buy something else");
            }
            if (sales % 3 == 0 && sales > 0) {
                closeShop();
            }
        }
    }
}

