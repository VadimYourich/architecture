import Core.UserProvider;
import Models.Ticket;
import Models.User;

/**
 * Интерфейс взаимодействия с клиентским приложением
 */
public interface ICustomer {
    List<Ticket> getSelectedTickets();

    void setSelectedTickets(List<Ticket> selectedTickets);

    User getUser();

    void setUser(User client);

    UserProvider getUserProvider();

    /**
     * Метод покупки билета
     */
    boolean buyTicket(Ticket ticket);

    /**
     * Метод поиска билетов по дате и номеру маршрута
     */
    List<Ticket> searchTicket(Date date, int route);
}