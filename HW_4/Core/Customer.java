import Interfaces.ICustomer;
import Models.Ticket;
import Models.User;

/**
 * Класс, содержащий основную логику покупки билетов
 */
public class Customer implements ICustomer {
    private TicketProvider ticketProvider;
    private CashProvider cashProvider;
    private UserProvider userProvider;
    private User client;
    private List<Ticket> selectedTickets;

    public Customer() {
        //Здесь создаются экземпляры классов работы с базами данных

        this.cashProvider = new CashProvider();
        this.ticketProvider = new TicketProvider();
        this.userProvider = new UserProvider();
    }

    @Override
    public List<Ticket> getSelectedTickets() {
        return selectedTickets;
    }

    @Override
    public void setSelectedTickets(List<Ticket> selectedTickets) {
        this.selectedTickets = selectedTickets;
    }

    @Override
    public UserProvider getUserProvider() {
        return userProvider;
    }

    @Override
    public User getUser() {
        return client;
    }

    @Override
    public void setUser(User client) {
        this.client = client;
    }

    @Override
    public boolean buyTicket(Ticket ticket) {
        
    }

    @Override
    public List<Ticket> searchTicket(Date date, int route) {
    }
}