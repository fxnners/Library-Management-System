import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public class User {
  public String name;
  public LocalDate birthDate;
  public ArrayList<Book> books = new ArrayList<Book>();

  public void borrow(Book book) {
    this.books.add(book);
  }

  public int age() {
    int age = Period.between(this.birthDate, LocalDate.now()).getYears();

    return age;
  }
}
