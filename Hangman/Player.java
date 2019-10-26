package Hangman;

class Player {
    String name;
    int score;
    String level;

    Player(String name) {
        this.name = name;
        this.level = level;
        this.score = score;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // getters

    public String getname() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public String getLevel() {
        return this.level;
    }

}