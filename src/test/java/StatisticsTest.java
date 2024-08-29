import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {

    @Test
    void getTeams() throws FileNotFoundException {
        //Act
        String expectedTeam = "TOTALENERGIES";
        String fakeTeam = "hej";
        String filename = "tdffinishers2024.csv";
        Statistics statistics = new Statistics(filename);

        //Arrange
        Set<String> actualList = statistics.getTeams();


        //Assert
        assertTrue(actualList.contains(expectedTeam));
        assertFalse(actualList.contains(fakeTeam));
    }


    @Test

    void getTeamsWithMembers() throws FileNotFoundException {
        //Arrange

        String filename = "tdffinishers2024.csv";
        Statistics statistics = new Statistics(filename);

        String exTeam = "BAHRAIN VICTORIOUS";
        Set<String> expectedSet = new HashSet<>();


        //Act
        Map<String, Set<String>> actualMap = statistics.getTeamsWithMembers();

        expectedSet.add("SANTIAGO BUITRAGO SANCHEZ");
        expectedSet.add("MATEJ MOHORIC");
        expectedSet.add("JACK HAIG");
        expectedSet.add("WOUT POELS");
        expectedSet.add("NIKIAS ARNDT");

        Set<String> actualSet = actualMap.get(exTeam);

        //Assert
        assertEquals(expectedSet, actualSet);
    }

    @Test
    void getTeamMembers() throws FileNotFoundException{

        //Arrange
        String filename = "tdffinishers2024.csv";
        String team = "TOTALENERGIES";
        Statistics statistics = new Statistics(filename);
        Set<String> expectedSet = new HashSet<>();

        //Act
        Set<String> actualSet = statistics.getTeamMembers(team);
        System.out.println();
        System.out.println(actualSet);

        expectedSet.add("THOMAS GACHIGNARD");
        expectedSet.add("ANTHONY TURGIS");
        expectedSet.add("STEFF CRAS");
        expectedSet.add("JORDAN JEGAT");
        expectedSet.add("MATHIEU BURGAUDEAU");
        expectedSet.add("FABIEN GRELLIER");
        expectedSet.add("MATTEO VERCHER");
        expectedSet.add("SANDY DUJARDIN");


        //Assert

        assertEquals(expectedSet, actualSet);
    }

}