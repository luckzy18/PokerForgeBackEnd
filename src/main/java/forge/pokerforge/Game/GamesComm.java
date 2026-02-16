package forge.pokerforge.Game;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class GamesComm {
    private double gameId=0;
    Map<Double,Game> ongoingGames=new HashMap<Double,Game>();
    private Socket clientSocket=new Socket();
    private PrintWriter out;



    public GamesComm(){
        int port = 6000;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            clientSocket = serverSocket.accept(); // waits for client
            out = new PrintWriter(clientSocket.getOutputStream(), true); // auto-flush
    }catch(IOException e){
            e.printStackTrace();
        }
    }

    public double addGame(){
        gameId+=1;
        ongoingGames.put(gameId,new Game(gameId));
        sendMessage(gameId,"create");
        return gameId;
    }
    private  void sendMessage(double id,String action){
        String json = String.format(
                "{\"action\":\"%s\",\"id\":%f}", action, id
        );
        out.println(json);
    }
}
