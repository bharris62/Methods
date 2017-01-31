import java.util.Arrays;

/**
 * Created by BHarris on 1/30/17.
 *
 * This is a basketball player class, it will keep up with some team stats, and has a max limit of 5
 * players per team.
 *
 */
public class BasketballTeam {
    private String[] players; //Needs to be set through .setPlayers() not constructor.
    private String teamName;
    private int totalPoints; //required to be set in the constructor.
    private int totalAssists;
    private int countOfPlayers;

    public BasketballTeam(String teamName) {
        this.players = new String[5];
        this.teamName = teamName;
    }

    //overloaded, if you have stats already
    public BasketballTeam(String teamName, int totalPoints, int totalAssists) {
        this.players = new String[5]; // team is always going to be 5 players.
        this.teamName = teamName;
        this.totalAssists = totalAssists;
        this.totalPoints = totalPoints;
    }

    public String getTeamName(){
        return this.teamName;
    }

    public void addPoints(int points) {
        this.totalPoints += points;
    }

    public void addAssists(int assists) {
        this.totalAssists += assists;
    }

    public void setPlayer(String playerName) {

        if (countOfPlayers <= 4) {
            players[this.countOfPlayers] = playerName;
        }

        this.countOfPlayers++;
    }

    public int getPoints(){
        return this.totalPoints;
    }

    public int getAssists(){
        return this.totalAssists;
    }

    //returns in the form of [0,1,2,3,4] -more for testing purposes than pretty output
    public String getPlayer() {
        return Arrays.toString(players);
    }
}
