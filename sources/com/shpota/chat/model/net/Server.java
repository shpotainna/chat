package com.shpota.chat.model.net;

import com.shpota.chat.model.jdbc.JdbcChatRepository;

import java.net.*;
import java.io.*;
import org.apache.log4j.Logger;

public class Server {
    public final static Logger LOGGER = Logger.getLogger(Server.class.getName());

    private static final int PORT = 65000;

    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.serve();
    }

    private void serve() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            LOGGER.info("Waiting for a client...");

            while (true) {
                Socket socket = serverSocket.accept();

                ClientHandler clientHandler = new ClientHandler(
                        socket,
                        new JdbcChatRepository()
                );
                clientHandler.setDaemon(true);
                clientHandler.start();
            }
        }
    }
}
