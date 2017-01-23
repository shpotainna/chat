package com.shpota.chat.model;

import com.shpota.chat.model.jdbc.JdbcChatRepository;

public class Application {

    public static void main(String[] arg) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        JdbcChatRepository jdbcChatRepository = new JdbcChatRepository();
        System.out.println(
                jdbcChatRepository.addUser(new User("User", "User", "user", "1"))
        );
        //jdbcChatRepository.deleteUser(7);
    }
}
