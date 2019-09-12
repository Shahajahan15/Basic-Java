package basicjava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTimes {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

//        //  Current  Date to Modify
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = dateFormat.format(date);
        System.out.println(currentDate);

    }

}
