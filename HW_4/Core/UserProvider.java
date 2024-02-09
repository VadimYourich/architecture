import Interfaces.IUserRepo;
import Models.User;
import Services.UserRepository;

/**
 * Класс - провайдер для работы с базой данных клиентов
 */
public class UserProvider {
    private IUserRepo clientRepository;

    public UserProvider() {
        this.clientRepository = UserRepository.getClientRepository();
    }

    /**
     * Метод создания нового клиента
     */
    public int createClient(String userName, int passwordHash, long cardNumber) {
        int id = clientRepository.create(userName, passwordHash, cardNumber);
        return id;
    }

    /**
     * Метод поиска клиента из базы по имени
     */
    public User getClientByName(String userName) {
        return client;
    }
}