import java.util.*;

public class changer {
    public static void main(String[] args){
    }


    public static List<Integer> changed(int amount){
        List<Integer> change = new ArrayList<>();

        int[]Coins = {50,20,10,5,2,1};

        for (int Coin : Coins) {
            while (amount >= Coin) {
                change.add(Coin);
                amount -= Coin;
            }
        }
        return change;
        }

}



