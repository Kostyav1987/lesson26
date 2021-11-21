package by.overone.lesson26;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HomeTask2 {
    public static void main(String[] args) throws IOException {

        File file = new File("E://Text.txt");
        Scanner sc = new Scanner(file);
        String line;
        while (sc.hasNext()) {
            Pattern pattern = Pattern.compile("\\b([aeiouyAEIOUY]\\w*)");
            Matcher matcher = pattern.matcher(sc.nextLine());
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }


    }
}

