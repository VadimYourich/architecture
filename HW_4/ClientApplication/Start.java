import Core.Customer;
import Interfaces.ICustomer;
import Models.Ticket;

/**
 * Основной класс клиентского приложения.
 */
public class Start extends EnterData {
    // Связь с основной логикой осуществляется через интерфейс ICustomer.
    private ICustomer customer;
    private int ticketRouteNumber;
    private Date ticketDate;

    /**
     * Метод запуска меню входа и регистрации
     */
    public void runLoginRegisterMenu() {
    }

    /**
     * Логика ветвления запуска программы
     */
    private boolean runLoginRegisterMenuChoiceLogic(int choice) {
        return true;
    }

    /**
     * Меню входа зарегестрированного пользователя
     */
    private void login() {
    }

    /**
     * Меню регистрации нового пользователя
     */
    private void register() {
    }

    /**
     * Меню покупки билетов
     */
    private void runBuyingMenu() {
    }

    /**
     * Логика ветвления меню покупки билетов
     */
    private boolean runBuyingMenuChoiceLogic(int choice) {
    }

    /**
     * Метод ввода номера маршрута
     */
    private int runSelectRouteMenu() {
    }

    /**
     * Метод ввода даты поездки
     */
    private Date runSelectDate() {
        return date;
    }

    /**
     * Метод вывода в консоль списка билетов
     */
    private void printAllTickets(List<Ticket> ticks) {
    }

    /**
     * Метод покупки билета
     */
    private void buyTicketMenu() {
    }

    /**
     * Логика ветвления меню подтверждения покупки
     */
    private void buyTicketMenuConfirmLogic(String answer) {
    }

    /**
     * Метод вывода в консоль элемента сообщения
     */
    private void printMessageLine(String message) {
    }
}