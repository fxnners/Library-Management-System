import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
  private String name;
  private LocalDate birthDate;
  private ArrayList<Book> books = new ArrayList<Book>();

  User(String name, String birthDate) {
    this.name = name;
    this.birthDate = LocalDate.parse(birthDate);
  }

  public String getName() {
    return this.name;
  }

  public String getBirthDate() {
    return this.birthDate.toString();
  }

  public String borrowedBooks() {
    return this.books.toString();
  }
  
  public void borrow(Book book) {
    this.books.add(book);
  }

  public int age() {
    int age = Period.between(this.birthDate, LocalDate.now()).getYears();

    return age;
  }
}
