import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TaskListClient {
    public static void main(String[] args) throws Exception {
        Socket clientSocket = new Socket("127.0.0.1", 4242);
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out.println("Q");
        String response = in.readLine();
        System.out.println(response);
        in.close();
        out.close();
        clientSocket.close();
    }
}
