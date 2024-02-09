import Interfaces.ITicketRepo;
import Models.Ticket;

/**
 * Класс репозиторий для имитации работы с базой данных
 */

public class TicketRepository implements ITicketRepo {
    private static TicketRepository ticketRepository;
    private List<Ticket> tickets;

    private TicketRepository() {
        // работа с БД
    }

    public static TicketRepository getTicketRepository() {
    }

    @Override
    public boolean create(Ticket ticket) {
    }

    @Override
    public List<Ticket> readAll(int routeNumber) {
    }

    @Override
    public boolean update(Ticket ticket) {
    }

    @Override
    public boolean delete(Ticket ticket) {
    }

    private void generateTickets(int roureNumber, int countPlaces, int price, Date date) {
    }
}