import Beverage.Expresso;
import Beverage.Cappuccino;
import Beverage.Latte;
import Beverage.Beverage;
import Condiments.CondimentDecorator;
import Condiments.Milk;
import Condiments.WhippedCream;
import Condiments.WhiteSugar;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Coffee Mania");
        System.out.println("Choose a Coffee");
        System.out.println("1. Espresso (Tk: 220)");
        System.out.println("2. Beverage.Latte (TK: 250)");
        System.out.println("3. Beverage.Cappuccino (TK: 300)");

        int beverageChoice = scanner.nextInt();
        Beverage beverage = null;

        switch (beverageChoice) {
            case 1:
                beverage = new Expresso();
                break;

            case 2:
                beverage = new Latte();
                break;
            case 3:
                beverage = new Cappuccino();
                break;
        }

        boolean addMoreCondiments = true;

        while (addMoreCondiments) {
            System.out.println("Please choose a condiment (or type 0 to finish):");
            System.out.println("1. Condiments.Milk (TK: 50)");
            System.out.println("2. Sugar (TK: 30)");
            System.out.println("3. Whipped Cream (TK: 100)");
            System.out.println("0. Finish");

            int condimentChoice = scanner.nextInt();

            switch (condimentChoice) {
                case 1:
                    beverage = new Milk(beverage);
                    System.out.println("Added: Milk (TK: 50)");
                    break;
                case 2:
                    beverage= new WhiteSugar(beverage);
                    System.out.println("Added: Sugar (TK: 30)");
                    break;
                case 3:
                    beverage= new WhippedCream(beverage);
                    System.out.println("Added: Whipped Cream (TK: 100)");
                    break;
                case 0:
                    addMoreCondiments = false;
                    break;
            }
            if (addMoreCondiments) {
                System.out.println("Current order: " + beverage.getDescription() + " (" + beverage.cost() + ")");
            }


        }

        System.out.println("\nYour final order is: " + beverage.getDescription());
        System.out.println("Total cost: $" + beverage.cost());

        scanner.close();
    }
}