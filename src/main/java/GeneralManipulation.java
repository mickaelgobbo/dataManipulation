import java.io.*;
import java.util.Scanner;

public class GeneralManipulation {

    /**
     * This method returns the first line of a file
     * @param pathFile
     * @return
     * @throws IOException
     */
    public String getFirstLine(String pathFile) throws IOException {
        FileReader file = new FileReader(pathFile);
        BufferedReader buffer = new BufferedReader(file);
        String line = buffer.readLine();
        return line;
    }

    public String getSeparator(String stringValue)


    {
        Scanner sc = new Scanner(stringValue);
        String delimiter = sc.delimiter().toString();
        return "test";
    }

    /**
     * This method returns the ascii code of a character
     * @param stringValue
     * @return
     */
    public int getAsciiCode(String stringValue)
    {
        char c = stringValue.charAt(0);
        return (int) c;
    }

}
