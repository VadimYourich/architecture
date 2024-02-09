import Models.User;

/**
 * Интерфейс взаимодействия с базой клиентов
 */
public interface IUserRepo {
    /**
     * Создать нового пользователя
     */
    int create(String userName, int passwordHash, long cardNumber);

    /**
     * получить пользователя по ID (для тестов, в приложении не используется)
     */
    User read(int id);

    /**
     * Получить пользователя по имени
     */
    User read(String userName);

    /**
     * Получить список пользователей (для тестов, в приложении не используется)
     */
    List<User> readAll();

    /**
     * Обновить пользователя (для тестов, в приложении не используется)
     */
    boolean update(User client);

    /**
     * Удалить пользователя (для тестов, в приложении не используется)
     */
    boolean delete(User client);
}