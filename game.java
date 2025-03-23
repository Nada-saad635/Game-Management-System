public class game {
    private String gameID ;
    private String  gametitle;
    private Server server;
    private int playToGamecount ;
    public static int GameCount =0;
    

    
    public game( String gametitle ,Server server ){
       
        this.gametitle=gametitle ;
        this.server =server ;   
        GameCount++;
        this.gameID="G"+GameCount;
        this.playToGamecount = 0 ;
        server.updateGameCount();
    }
    

    
    public String getGameID() {
        return gameID;
    }

    public String getGamrtitle() {
        return gametitle;
    }

    public Server getServer() {
        return server;
    }

    public int getPlayToGamecount() {
        return playToGamecount;
    }

    public static int getGameCount() {
        return GameCount;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public void setGamrtitle(String gametitle) {
        this.gametitle = gametitle;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public void setPlayToGamecount(int playToGamecount) {
        this.playToGamecount = playToGamecount;
    }

    public static void setGameCount(int GameCount) {
        game.GameCount = GameCount;
    }
    
    @Override
    public String toString(){
        return String.format("%-10s    %-15s    %-15s    %-5d",gameID,gametitle,server.getServerName(), playToGamecount);
    }
    
    public void playToGamecount(){
    playToGamecount++ ;    
    }
    
    
    
    
    
    
}
