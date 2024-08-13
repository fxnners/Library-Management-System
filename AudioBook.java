public class AudioBook extends Book {
  private int runTime;

  AudioBook(String title, String writer, int runTime) {
    super(title, writer, 0);

    this.runTime = runTime;
  }
}
