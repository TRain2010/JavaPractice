import java.util.*;

/**
 * Created by T-RAIN on 2018/10/22.
 */
public class Theatre {
    private final String theatreName;
    public  List<Seat> seats = new ArrayList<>();


    public Theatre(String theatreName, int numRows, int seatPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row ++) {
            for (int seatNum = 1; seatNum <= seatPerRow; seatNum ++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }

    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestSeat = new Seat(seatNumber);
        int found = Collections.binarySearch(seats, requestSeat,null);

//        for ( Seat seat:seats) {
//            if (seat.getSeatNumber().equals(seatNumber)) {
//                requestSeat = seat;
//                break;
//            }
//        }
        if (found >= 0) {
            return seats.get(found).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

    }

    public void getSeat() {
        for (Seat seat:seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    static final Comparator<Seat> PRICE_ORDER =  new Comparator<Seat>() {
      @Override
        public int compare(Seat s1, Seat s2) {}
    };

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;



        private   Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }
        @Override
        public int compareTo(Seat o) {
            return this.seatNumber.compareToIgnoreCase(o.getSeatNumber());
        }
        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            }
            else
                return false;
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled. ");
                return true;
            } else
                return false;

        }
    }


}
