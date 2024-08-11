import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
      User user = new User();

      user.name = "Jose";
      user.birthDate = LocalDate.parse("2005-01-31");

      Book book = new Book();

      book.title = "Lord of the Rings";
      book.writer = "J.R.R. Tolkien";

      user.borrow(book);

      System.out.printf("%s was born in %s and he is now %d years old. \n", user.name, user.birthDate.toString(), user.age());

      System.out.printf("%s has borrowed these books: %s \n", user.name, user.books.toString());
  }
}
