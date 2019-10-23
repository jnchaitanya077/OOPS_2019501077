public class BookYourShow {

    public Show myShow[];

    public int count;

    BookYourShow() {
        final int ten = 10;
        this.myShow = new Show[ten];
        this.count = 0;
    }

    public void addAShow(Show show) {
        myShow[count] = show;
        count++;
    }

    public void printShow() {
        for (int i = 0; i < count; i++) {
            System.out.println(myShow[i].toString());
        }
    }

    public Show getAShow(String a, String b) {
        for (int i = 0; i < count; i++) {
            if (myShow[i].getMovieName().equals(a) && myShow[i].getDateTime().equals(b)) {
                return myShow[i];
            }
        }
        return null;
    }

    public boolean removeAMovie(String a) {
        for (int i = 0; i < count; i++) {
            if (myShow[i].getMovieName() == a) {

                for (int j = i + 1; j < count; j++) {
                    myShow[i] = myShow[j];
                    i++;
                }
                myShow[count] = null;
                count--;
                return true;
            }
        }
        return false;
    }

}
