import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            out.write(name);
            out.newLine();
            out.write(email);
            out.newLine();
            out.flush();

            System.out.println("Details sent to the server.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
