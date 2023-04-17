import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class SalaryServer {
    private static final int PORT = 12345;
    private static Map<String, Double> salaryMap = new HashMap<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected");

                new Thread(() -> {
                    try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

                        String request;
                        while ((request = in.readLine()) != null) {
                            String[] parts = request.split(" ");
                            String command = parts[0];

                            if (command.equals("get")) {
                                String employeeName = parts[1];
                                Double salary = salaryMap.get(employeeName);
                                if (salary != null) {
                                    out.println("Salary for " + employeeName + ": $" + salary);
                                } else {
                                    out.println("Employee " + employeeName + " not found");
                                }
                            } else if (command.equals("set")) {
                                String employeeName = parts[1];
                                Double salary = Double.parseDouble(parts[2]);
                                salaryMap.put(employeeName, salary);
                                out.println("Salary for " + employeeName + " set to $" + salary);
                            } else {
                                out.println("Invalid command");
                            }
                        }

                        System.out.println("Client disconnected");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}