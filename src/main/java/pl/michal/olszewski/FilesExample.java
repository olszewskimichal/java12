package pl.michal.olszewski;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesExample {

  /**
   * Files Relationship	  Files.isSameFile(Path,Path)	  Files.mismatch(Path,Path)
   * Same File	          "Same" (true)	                "Same" (-1)
   * Copied File	        "Not Same" (false)	          "Same" (-1)
   */
  public static void main(String[] args) throws IOException {
    final Path file1Path = Path.of("test.txt");
    final Path file2Path = Path.of("test2.txt");

    System.out.println(Files.isSameFile(file1Path, file2Path));
    System.out.println(Files.mismatch(file1Path, file2Path));
  }

}
