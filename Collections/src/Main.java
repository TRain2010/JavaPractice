import java.util.ArrayList;
import java.util.List;

/**
 * Created by T-RAIN on 2018/10/22.
 */
public class Main {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("AMC", 5, 11);
        //theatre.getSeat();

        List<Theatre.Seat> copy = new ArrayList<>(theatre.seats);
//        if (theatre.reserveSeat("D10")) {
//            System.out.println("Please Pay. ");
//        } else
//            System.out.println("Sorry, seat is taken. ");
//        if (theatre.reserveSeat("D10")) {
//            System.out.println("Please Pay. ");
//        } else
//            System.out.println("Sorry, seat is taken. ");

    }
}
