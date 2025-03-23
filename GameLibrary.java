public class GameLibrary {

    public static void main(String[] args) {
        // TODO code application logic here
        Server S1 = new Server("Game Zone ","Middle East ");
        Server S2 = new Server("Wonder World  ","South Africa ");
        Server S3 = new Server("Action Zone  ","Europe  ");
        Server S4 = new Server("Fun Server  ","United State ");
        
        game G1 = new game("Fire Ball ",S1);
        game G2 = new game("Best Shooter ",S1);
        game G3 = new game("Time for Race ",S4);
        game G4= new game("Age of Sword ",S3);
        
        player P1=new player("CR7");
        player P2=new player("Super Racer");
        player P3=new player("Thor");
        player P4=new player("Hulk");
        player P5=new player("The Legend ");
        
        
        // Recording Competitions 
       P1.recordCompetition(G1, P5, 'T');
       P3.recordCompetition(G4, P4, 'W');
       P4.recordCompetition(G4, P3, 'L');
       P5.recordCompetition(G1, P1, 'T');
       
       
       
        // Printing Data
        System.out.println("====================");
        System.out.println("Server Details:");
        System.out.printf("%-10s    %-15s    %-15s    %-5s%n", "serverID", "serverName", "region", "Games Hosted");
        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        System.out.println(S4);
        
        System.out.println("====================");
        System.out.println("Game Details:");
        System.out.printf("%-10s    %-15s    %-15s    %-5s%n", "Game ID", "Hosted on", "playerCount","Player Count");
        System.out.println(G1);
        System.out.println(G2);
        System.out.println(G3);
        System.out.println(G4);
        
        System.out.println("====================");
        System.out.println("Player Details:");
        System.out.printf("%-10s    %-20s    %-20s    %-20s    %-5s%n", "Player ID", "Name","Last Game Played","last Competitor","Last Competition Result");
        System.out.println(P1);
        System.out.println(P2);
        System.out.println(P3);
        System.out.println(P4);
        System.out.println(P5);     
    }
    
}
