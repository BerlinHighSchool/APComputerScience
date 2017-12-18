import java.net.Socket;
import java.io.PrintWriter;
public class Client
{
	private static Socket socket;
	private static PrintWriter printWriter;
	public static void main(String[] args)
	{
		try
		{
			//change "localhost" to the ip address that the client is on, and this number to the port
			socket = new Socket("10.243.72.75",63400);
			printWriter = new PrintWriter(socket.getOutputStream(),true);
			printWriter.println("Hello Socket");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}