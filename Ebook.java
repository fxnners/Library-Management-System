public class Ebook extends Book {
  private String format;

  Ebook(String title, String writer, int pageCount, String format) {
    super(title, writer, pageCount);

    this.format = format;
  }
  
}
