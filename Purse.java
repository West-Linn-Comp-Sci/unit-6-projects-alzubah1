// A Purse holds a collection of Coins 
import java.util.ArrayList;
public class Purse { 
    private ArrayList<Coin> coins; 
    public Purse() { 
        coins = new ArrayList<Coin>(); 
    }
    // adds aCoin to the purse 
    public void add(Coin aCoin) { 
        coins.add(aCoin); 
    } 
    // returns total value of all coins in purse 
    public double getTotal() { 
        double total = 0;
        for (int i = 0; i < coins.size(); i++) {
            total += coins.get(i).getValue();
        }
        return total;
    } 
    // returns the number of coins in the Purse that matches aCoin 
    // (both myName & myValue) 
    public int count(Coin aCoin) {
        int num = 0;
        for (int i = 0; i < coins.size(); i++) {
            if (coins.get(i).equals(aCoin)) {
                num++;
            }
        }
        return num;
    } 
    // returns the name of the Coin in the Purse that has the smallest value 
    public String findSmallest() {
        String name = "";
        double min = 1.0;
        for (int i = 0; i < coins.size(); i++) {
            if (coins.get(i).getValue() < min) {
                min = coins.get(i).getValue();
                name = coins.get(i).getName();
            }
        }
        return name;
    }
    public String toString() {
        String temp = "";
        for (int i = 0; i < coins.size(); i++) {
            temp += ("(" + coins.get(i).getName() + ": " + coins.get(i).getValue() + ") ");
        }
        return temp;
    }
}

