import java.io.FileNotFoundException;
import java.util.*;

public class Statistics {

    private List<Cyclist> cyclists;


    public Statistics(String filename) throws FileNotFoundException {
        this.cyclists = new TDFFilereader(filename).readFile();
    }

    public Set<String> getTeams() {
        Set<String> teams = new HashSet<>();
        for (Cyclist c : cyclists) {
            teams.add(c.getTeam());
        }
        return teams;
    }

    public Map<String, Set<String>> getTeamsWithMembers() {
        Map<String, Set<String>> teamsWithMembers = new HashMap<>();

        for (Cyclist c : cyclists) {
            String team = c.getTeam();
            String name = c.getName();

            if (!teamsWithMembers.containsKey(team)) {
                teamsWithMembers.put(team, new HashSet<>());
            }
            teamsWithMembers.get(team).add(name);

        }

        return teamsWithMembers;

    }


    public Set<String> getTeamMembers(String team) {
        Map<String, Set<String>> getTeamsWithMembers = getTeamsWithMembers();
        return getTeamsWithMembers.get(team);
    }





}
