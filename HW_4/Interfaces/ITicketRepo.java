import Models.Ticket;

/**
 * Интерфейс взаимодействия с базой билетов
 */
public interface ITicketRepo {
    boolean create(Ticket ticket);

    /**
     * Получить список билетов по номеру маршрута
     */
    List<Ticket> readAll(int routeNumber);

    /**
     * Обновить билет
     */
    boolean update(Ticket ticket);

    /**
     * Удалить билет
     */
    boolean delete(Ticket ticket);
}