/**
 * Модель пользователя
 */

public class User {

    public User(int id, String userName, int hashPassword, long cardNumber) {
        this.id = id;
        this.userName = userName;
        this.hashPassword = hashPassword;
        this.cardNumber = cardNumber;
    }


    @Override
    public String toString() {
    }

    @Override
    public boolean equals(Object o) {
    }


    public boolean equals(User client) {
    }

    @Override
    public int hashCode() {
    }
}