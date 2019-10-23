import java.util.Arrays;

class Show {

    private String movieName;
    private String datetime;
    private String[] seats;
    // String[] blockedSeats = new String[10];

    Show(String movieName, String datetime, String[] seats) {
        this.movieName = movieName;
        this.datetime = datetime;
        this.seats = seats;
    }

    // getters

    public String getMovieName() {
        return this.movieName;
    }

    public String getDateTime() {
        return this.datetime;
    }

    public String[] getSeats() {
        return this.seats;
    }

    // setters

    public void setMovieName(String movieName) {
        this.movieName = movieName;

    }

    public void setDateTime(String datetime) {
        this.datetime = datetime;
    }

    public void setSeats(String[] seats) {
        this.seats = Arrays.copyOf(seats, seats.length);
    }

    public void printTickets(Patron p) {
        if (p.ticket != "") {
            System.out.println("\n");
            System.out.println("Movie Tickets");
            System.out.println("Movie Name: " + getMovieName());
            System.out.println("Date and Time: " + getDateTime());
            System.out.println("Name : " + p.getName());
            System.out.println("Phone Number: " + p.getphNumber());
            System.out.println("Booked Seats: " + p.ticket);
            System.out.println("Thanks for Booking!! Enjoy your show." + "\n");
        } else {
            System.out.println("You are trying to book tickets which are occupied/not there.");
            System.out.println("Booking Failed.");
        }

    }

    public String toString() {
        String t = this.movieName + " " + this.datetime + "\n" + "Available seats";
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] != null) {
                t += seats[i] + " ";
            }
        }
        return t;
    }

    public void bookAShow(Patron p, String s[]) {
        String ticket = "";
        int c = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (seats[i] != null) {
                    if (seats[i].equals(s[j])) {
                        ticket = seats[i] + " ";
                        seats[i] = null;
                    }

                }

                else {
                    // System.out.println("Seats are already booked");
                    c += 1;
                }
            }
        }
        p.setTicket(ticket);

    }

}
