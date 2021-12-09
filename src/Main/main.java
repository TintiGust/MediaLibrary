package Main;


public class main {
    public static void main(String[] args) {

    DVD dvd1 = new DVD("Boris", "la fête");
    CD cd1 = new CD("steven", "le samoyède perdu");
    Book book1 = new Book("Manon", "maman pour les nuls");

        dvd1.zone = 3;
        int[] test = {1, 2};
        System.out.println(dvd1.readable(test));
    }
}
