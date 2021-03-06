package com.shpota.chat.model.packages;

public class RegistrationClientPackage extends Package {
    private final String firstName;
    private final String lastName;
    private final String login;
    private final String password;

    public RegistrationClientPackage(
            String firstName,
            String lastName,
            String login,
            String password
    ) {
        if (firstName == null || lastName == null || login == null || password == null) {
            throw new IllegalArgumentException(
                    "First name, last name, login and password must not be null."
            );
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
