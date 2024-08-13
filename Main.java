import java.time.LocalDate;

class Main {
    public static void main(String[] args) {

      Book lordoftherings = new Book("Lord of the Rings", "J.R.R. Tolkien", 437);

      AudioBook harrypotter = new AudioBook("Harry Potter", "JK Rowling", 30000);

      Ebook diaryofwimpykid = new Ebook("Diary of a Wimpy Kid", "Jeff K", 144, "PDF");

      System.out.println(diaryofwimpykid.toString());
  }
}
