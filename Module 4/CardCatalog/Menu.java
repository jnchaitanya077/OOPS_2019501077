class Menu {
    public static void main(String[] args) {
        Cardcatalog obj = new Cardcatalog();
        Card one = new Card("Half GirlFriend", "Chetan Bagath", "Love");
        Card two = new Card("Life Is What You Make It.", "Preethi Shenoy", "Love");
        Card three = new Card("Power Of subconscious Mind", "Joseph Murphy", "self Development");
        Card four = new Card("Five Point Someone", "Chetan Bagath", "fiction");
        Card five = new Card("3 Mistakes of My Life", "Chetan Bagath", "fiction");
        obj.addCard(one);
        obj.addCard(two);
        obj.addCard(three);
        obj.addCard(four);
        obj.addCard(five);
        // obj.printCatalog();

        obj.searchByAuthor("Chetan Bagath");
        obj.searchCardByTitle("Life Is What You Make It.");
        obj.searchCardBySubject("Love");
        obj.printCatalog();
        obj.deleteCard("3 Mistakes of My Life");
        obj.printCatalog();

    }
}