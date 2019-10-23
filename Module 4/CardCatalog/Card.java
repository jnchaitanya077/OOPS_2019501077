class Card {

    private String title;
    private String author;
    private String subject;

    Card(final String title, final String author, final String subject) {
        this.title = title;
        this.author = author;
        this.subject = subject;
    }

    public String getTitle() {
        return this.title; // obj.getName();
    }

    public String getAuthor() {
        return this.author;
    }

    public String getSubject() {
        return this.subject;
    }

    public String toString() {
        return "Title = " + this.title + "\n" + "Author = " + this.author + "\n" + "Subject = " + this.subject + "\n";
    }

    public void setTitle(final String toSet) {
        this.title = toSet;

    }

    public void setAuthor(final String toSet) {
        this.author = toSet;
    }

    public void setSubject(final String toSet) {
        this.subject = toSet;
    }

}
