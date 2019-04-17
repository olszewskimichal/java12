package pl.michal.olszewski;

public class SwitchExample {

  public static void main(String[] args) {

    int errorCode=404;

    switch (errorCode) {
      case 400, 404, 405 -> System.out.println("Something is wrong with the request!");
      case 500, 501, 505 -> System.out.println("Something is wrong with the server!");
    }

  }

}
