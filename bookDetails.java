// 1
class book {
    String title;
    String author;
    int price;

    public void title(String title) {
        this.title = title;
    }

    public void author(String author) {
        this.author = author;
    }

    public void price(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void bookDetails() {
        System.out.println(
                "Book Title : " + title +
                        "\nAuthor : " + author +
                        "\nPrice : " + price);
    }
}

public class bookDetails {
    public static void main(String[] args) {
        System.out.println("Here are book details : ");
        book book = new book();
        book.title("Java");
        book.author("James Gosling");
        book.price(1449);
        book.bookDetails();
    }
}
