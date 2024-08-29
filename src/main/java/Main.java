import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        String filename = "tdffinishers2024.csv";
        String teamName = "TOTALENERGIES";

        try {
            TDFFilereader tdfFilereader = new TDFFilereader(filename);
            Statistics statistics = new Statistics(filename);
            System.out.println(tdfFilereader.readFile());
            System.out.println(statistics.getTeams());
            System.out.println(statistics.getTeamsWithMembers());
            System.out.println(statistics.getTeamMembers(teamName));


        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }






    }
}
