package pl.michal.olszewski;

public class StringExample {

  public static void main(String[] args) {
    String result = "foo\nbar\nbar2".indent(4);
    System.out.println(result);


    var result2 = "foo"
        .transform(input -> input + " bar")
        .transform(String::toUpperCase);
    System.out.println(result2); // FOO BAR
  }

}
