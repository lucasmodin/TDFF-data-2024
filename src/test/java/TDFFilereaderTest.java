import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TDFFilereaderTest {

    @org.junit.jupiter.api.Test
    void readFile() throws FileNotFoundException {
        //Arrange
        String filename = "tdffinishers2024.csv";

        Cyclist expectedCyclist = new Cyclist("SIMON YATES", "TEAM JAYCO ALULA");
        TDFFilereader filereader = new TDFFilereader(filename);


        //Act
        List<Cyclist> readList = filereader.readFile();
        Cyclist actualCyclist = readList.get(11);
        Cyclist notEqualTest = readList.get(12);

        //Assert
        assertEquals(expectedCyclist.toString(), actualCyclist.toString());
        assertNotEquals(expectedCyclist.toString(), notEqualTest.toString());





    }
}