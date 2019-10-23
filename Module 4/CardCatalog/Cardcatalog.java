class Cardcatalog {

    private Card[] myCards;
    Card[] temp = new Card[10];

    private int cardCount;

    Cardcatalog() {
        final int fifty = 50;
        myCards = new Card[fifty];
        this.cardCount = 0;
    }

    public void addCard(Card card) {
        // Your code goes here....
        myCards[cardCount++] = card; // friendsCount is Zero on Creation
        // Nothing to be returned... As this method is void...
    }

    public Card searchByAuthor(String searchAuthor) {
        // Your code goes here....
        for (int i = 0; i < cardCount; i++) {
            if (myCards[i].getAuthor().equals(searchAuthor)) {
                System.out.println(myCards[i]);

                // return myCards[i];
            }
        }
        return null;
    }

    public Card searchCardByTitle(String searchTitle) {
        // Your code goes here....
        for (int i = 0; i < cardCount; i++) {
            if (myCards[i].getTitle().equals(searchTitle)) {
                System.out.println(myCards[i]);
                // return myCards[i];
            }
        }

        return null;
    }

    public Card searchCardBySubject(String search) {
        // Your code goes here....
        for (int i = 0; i < cardCount; i++) {
            if (myCards[i].getSubject().equals(search)) {
                System.out.println(myCards[i]);
                // return myCards[i];
            }
        }

        return null;
    }

    public void printCatalog() {
        for (int i = 0; i < cardCount; i++) {
            System.out.println(myCards[i]);
        }
    }

    public boolean deleteCard(String searchTitle) {
        // Your code goes here....
        for (int i = 0; i < cardCount; i++) {
            if (myCards[i].getTitle().equals(searchTitle)) {

                // i is the match index
                for (int j = i + 1; j < cardCount; j++) {
                    myCards[i] = myCards[j];
                    i++;
                }
                myCards[cardCount] = null;
                cardCount--;
                return true;
            }
        }
        return false;
    }

}
