package Week_04;

import java.util.HashMap;
import java.util.Map;

public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for ( int i = 0 ; i < bills.length ; i++) {
            if ( bills[i] == 5 ) {
                five++;
            } else if ( bills[i] == 10 ) {
                ten++;
                if (five > 0) {
                    five--;
                } else {
                    return false;
                }
            } else if ( bills[i] == 20 ){
                if (ten >  0 && five > 0 ) {
                    five--;
                    ten--;
                } else if (five > 2){
                    five = five - 3;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

}
