import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class System {
    static String inputFileName = "input.txt";
    static InputStream in;

    static String outputFileName = "output.txt";
    static PrintStream out;

    static {
        try {
            in = new FileInputStream(inputFileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static {
        try {
            out = new PrintStream(new FileOutputStream(outputFileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
