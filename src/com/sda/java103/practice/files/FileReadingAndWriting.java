package com.sda.java103.practice.files;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileReadingAndWriting {

  public static void main(String[] args) throws IOException {
    Path path = Path.of("file.txt");
    boolean fileAlreadyCreated = Files.exists(path);
    if(!fileAlreadyCreated){
      Files.createFile(path);
    }
    fileReading(path);
    fileWriting(path);
    fileReading(path);
  }

  public static void fileReading(Path path) throws IOException {
    Scanner scanner = new Scanner(path);
    while (scanner.hasNext()){
      System.out.println(scanner.nextLine());
    }
    scanner.close();
  }

  public static void fileWriting(Path path) throws IOException {
    FileWriter printWriter = new FileWriter(path.toFile(), false);
    printWriter.write("Ale co teraz\n");
    printWriter.close();
  }

}
