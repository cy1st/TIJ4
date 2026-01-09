//: io/BufferedInputFile.java
package io;
import java.io.*;

public class BufferedInputFile {
  // Throw exceptions to console:
  public static String
  read(String filename) throws IOException {
    // Reading input by lines:
    BufferedReader in = new BufferedReader(
      new FileReader(filename));
    String s;
    StringBuilder sb = new StringBuilder();
    while((s = in.readLine())!= null)
      sb.append(s + "\n");
    in.close();
    return sb.toString();
  }
  public static void main(String[] args)
  throws IOException {
//      File file = new File("/Users/alan/IdeaProjects/book_source_code/TIJ4/src/io/BufferedInputFile.java");
      System.out.print(read("/Users/alan/IdeaProjects/book_source_code/TIJ4/src/io/BufferedInputFile.java"));
  }
} /* (Execute to see output) *///:~
