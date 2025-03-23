public class Server {
    private String serverID;
    private String serverName;
    private String region ;
    private int gameToServerCount ;
    public static int servercount = 0 ;
    
    public Server(String servername ,  String region  ){
        this.serverName=servername;
        this.region = region;  
        servercount++;
        this.serverID = "S"+servercount ;// Auto-generate serverID
        this.gameToServerCount=0;// Initialize game count to 0     
    }
    
    
    public String getServerID() {
        return serverID;
    }

    public String getServerName() {
        return serverName;
    }

    public String getRegion() {
        return region;
    }

    public int getGameToServerCount() {
        return gameToServerCount;
    }

    public static int getServercount() {
        return servercount;
    }

    public void setServerID(String serverID) {
        this.serverID = serverID;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setGameToServerCount(int gameToServerCount) {
        this.gameToServerCount = gameToServerCount;
    }

    public static void setServercount(int servercount) {
        Server.servercount = servercount;
    }
    
    @Override
    public String toString(){
            return String.format("%-10s    %-15s    %-15s    %-5d", serverID, serverName, region, gameToServerCount);
    }
    
    public void updateGameCount(){
        gameToServerCount++;
    }
    
   
    
    
        
    
}
