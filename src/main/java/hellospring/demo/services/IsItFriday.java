package hellospring.demo.services;

import java.util.Calendar;

public class IsItFriday {
    public static boolean get() {
        Calendar c = Calendar.getInstance();
        //the retarded way
        //int q = c.get(Calendar.DAY_OF_MONTH);
        //int m = c.get(Calendar.MONTH);
        //double j = c.get(Calendar.YEAR)/100;
        //int k = c.get(Calendar.YEAR)%100;
        //#can't be arsed

        //the easy way
        int day = c.get(Calendar.DAY_OF_WEEK);

        if (day == 6) {
            return true;
        }
        return false;
    }

}
