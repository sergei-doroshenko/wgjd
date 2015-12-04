package org.sergei.chapter2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Code for Listing 2_3 - You'll need to change the hardcoded path.
 */
public class Listing_2_3 {

  public static void main(String[] args) throws IOException {
    Path startingDir = Paths
        .get("/Users/karianna/Documents/workspace/java7developer_code_trunk");
    Files.walkFileTree(startingDir, new FindJavaVisitor());
  }

  private static class FindJavaVisitor extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

      if (file.toString().endsWith(".java")) {
        System.out.println(file.getFileName());
      }
      return FileVisitResult.CONTINUE;
    }
  }
}