//: io/MemoryInput.java
package io;
import java.io.*;

public class MemoryInput {
  public static void main(String[] args)
  throws IOException {
    StringReader in = new StringReader(
      BufferedInputFile.read("/Users/alan/IdeaProjects/book_source_code/TIJ4/src/io/MemoryInput.java"));
//      BufferedInputFile.read("MemoryInput.java"));
    int c;
    while((c = in.read()) != -1)
      System.out.print((char)c);
  }
} /* (Execute to see output) *///:~
