package Game;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class GamesComm {
    private double gameId=0;
    Map<Double,Game> ongoingGames=new HashMap<Double,Game>();
    private Socket clientSocket=new Socket();

    private static void Main(String[] args){
        while()
    }
    public GamesComm(){
//        ProcessBuilder pb = new ProcessBuilder(
//                "python",
//                "ai_server.py"
//        );
//        try {
//            pb.start();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        int port = 6000;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port);


            clientSocket = serverSocket.accept(); // waits for client
            System.out.println("Client connected!");


    }catch(IOException e){
            e.printStackTrace();
        }
    }

    public double addGame(){
        gameId+=1;
        ongoingGames.put(gameId,new Game(gameId));
        return gameId;
    }
}
