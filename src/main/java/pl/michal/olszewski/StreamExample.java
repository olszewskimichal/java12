package pl.michal.olszewski;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingDouble;
import static java.util.stream.Collectors.teeing;

import java.util.stream.Stream;

public class StreamExample {

  public static void main(String[] args) {
    Double ev = Stream.of(1, 2, 3, 4, 5, 6) // dice roll
        .collect(teeing(
            summingDouble(i -> i),
            counting(),
            (sum, n) -> sum / n));
  }

}
