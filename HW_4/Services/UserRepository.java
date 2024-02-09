import Interfaces.IUserRepo;
import Models.User;

/**
 * Класс репозиторий для работы с базой данных
 */
public class UserRepository implements IUserRepo {
    private static UserRepository clientRepository;
    private List<User> clients;

    private UserRepository() {
        //работа базы клиентов
    }

    public static UserRepository getClientRepository() {
    }

    @Override
    public int create(String userName, int passwordHash, long cardNumber) {
    }

    @Override
    public User read(int id) {
    }

    @Override
    public User read(String userName) {
    }

    @Override
    public List<User> readAll() {
    }

    @Override
    public boolean update(User client) {
    }

    @Override
    public boolean delete(User client) {
    }
}