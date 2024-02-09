/**
 * Модель билета
 */

public class Ticket{

    public Ticket(int routeNumber, int place, int price, Date date, boolean isValid) {
        this.routeNumber = routeNumber;
        this.place = place;
        this.price = price;
        this.date = date;
        this.isValid = isValid;
    }


    @Override
    public String toString() {
    }


    public String toPrint() {
    }

    @Override
    public int hashCode() {
    }

    @Override
    public boolean equals(Object obj) {
    }


    public boolean equals(Ticket ticket) {
    }
}