class Patron {
    private String name;
    private String phNumber;
    public String ticket;

    Patron(String name, String phNumber) {
        this.name = name;
        this.phNumber = phNumber;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String toString() {
        return this.ticket;
    }

    // getters

    String getName() {
        return this.name;
    }

    String getphNumber() {
        return this.phNumber;
    }

}
