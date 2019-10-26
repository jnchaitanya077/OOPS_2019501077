package Hangman;

class Movie {
    private String moviename;
    private String level;
    private String hint;

    Movie(String moviename, String level, String hint) {
        this.moviename = moviename;
        this.level = level;
        this.hint = hint;
    }

    // getters

    public String getName() {
        return this.moviename;
    }

    public String getlevel() {
        return this.level;
    }

    public String gethint() {
        return this.hint;
    }

}