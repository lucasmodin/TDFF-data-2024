import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TDFFilereader {


    private Scanner sc;
    private File file;

    public TDFFilereader(String filename) throws FileNotFoundException {
        this.file = new File(filename);
        this.sc = new Scanner(file);
    }


    public List<Cyclist> readFile() {
        String line;
        String[] attributes;
        List<Cyclist> result = new ArrayList<>();

        while(sc.hasNext()) {
            line = sc.nextLine();
            attributes = line.split(";");

            String name = attributes[1];
            String team = attributes[2];

            result.add(new Cyclist(name, team));

        }
        sc.close();
        return result;
    }


}
