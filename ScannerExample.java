import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerExample {

  public static void main(String... args) {
    String wordsAndNumbers = "Longing rusted furnacedaybreak 17 benign\n9 homecoming 1\nfreight car";

    try (Scanner scanner = new Scanner(wordsAndNumbers)) {
      scanner.findAll("benign").map(MatchResult::group).forEach(System.out::println);
    }
  }
}