public class player {
    private String playerID;
    private String playerName;
    private game lastgameplayed;
    private player  lastCompetitor ;
    private char lastCompetitionResult ;// 'W', 'L', 'T'
    public static int playerCount =0;
    
    
    public player(String playername) {
       
       this.playerName = playername ;
       playerCount++ ;
       this.playerID = "P" +playerCount ;
       this.lastCompetitionResult ='?';// Default value
       this.lastCompetitor = null ;// Default value
       this.lastgameplayed =null ; // Default value       
    }
    

    public String getPlayerID() {
        return playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public game getLastgameplayed() {
        return lastgameplayed;
    }

    public player getlastCompetitor() {
        return lastCompetitor;
    }

    public char getLastCompetitionResult() {
        return lastCompetitionResult;
    }

    public static int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setLastgameplayed(game lastgameplayed) {
        this.lastgameplayed = lastgameplayed;
    }

    public void setlastCompetitor(player lastGamePlayed) {
        this.lastCompetitor = lastGamePlayed;
    }

    public void setLastCompetitionResult(char lastCompetitionResult) {
        this.lastCompetitionResult = lastCompetitionResult;
    }

    public static void setPlayerCount(int playerCount) {
        player.playerCount = playerCount;
    }
    
    @Override
    public String toString() {
        String result ;
        switch (lastCompetitionResult){
            case 'W':
                result = "Win";
                break;
            case 'L':
                result = "Loss";
                break;
            case 'T':
                result = "Tie";
                break;
            default:
                result = "Unknown";
        
        }
        return String.format("%-10s    %-20s    %-20s    %-20s    %-5s",playerID ,  playerName ,(lastgameplayed != null ? lastgameplayed.getGamrtitle() : "None") ,(lastCompetitor != null ? lastCompetitor.playerName : "None") , result);
    }
    
   
    public void recordCompetition(game lastGamePlayed , player  lastCompetitor ,char lastCompetitionResult   )    {
        this.lastgameplayed=  lastGamePlayed ;
        this.lastCompetitor  =  lastCompetitor ;
        this.lastCompetitionResult = lastCompetitionResult ;
        lastgameplayed.playToGamecount();
        
    }
}
