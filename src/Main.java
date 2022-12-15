package src;

public class Main {
  public static void main(String[] args) throws Exception {
		HttpServer server = new HttpServer(Integer.parseInt(args[0]));
		server.start();
}
}
