/* Class: CSE 1322L
Section: WJ1
Term: Fall 2021
Instructor: Leul Endashaw
Name: Lauren Bailey
Assignment#: 11
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Assignment11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BufferedReader reader = null;
        System.out.println("Enter a filename: ");
        String filename;
        filename = scan.nextLine();
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        try{
            reader = new BufferedReader(new FileReader(filename));
            String currentLine = reader.readLine();
            while(currentLine != null){
                lineCount++;
                String[] words = currentLine.split(" ");
                wordCount = wordCount + words.length;
                for(String word : words) {
                    charCount = charCount + word.length();
                }
                currentLine = reader.readLine();
            }
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + charCount);
            System.out.println("Chars: " + wordCount);
        }
        catch (IOException e){
            System.out.println("File error: " + filename + " (No such file or directory)");
        }
    }
}

