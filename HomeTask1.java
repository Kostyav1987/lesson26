package by.overone.lesson26;

import java.io.*;

public class HomeTask1 {
   public static void main(String[] args) throws IOException {
       FileInputStream fileInputStream = new FileInputStream("E://Text.txt");
       System.out.printf("File size: %d bytes \n", fileInputStream.available());
       int i = -1;
       StringBuilder result = new StringBuilder();
       while ((i = fileInputStream.read()) != -1) {
           result.append((char) i);
       }
       fileInputStream.close();
       System.out.println(result);
   }
}

