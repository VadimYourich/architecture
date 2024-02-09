/**
 * Интерфейс взаимодействия с базой банковских операций
 */
public interface ICashRepo {
    /**
     * Метод проведения транзакции
     */
    boolean transaction(int payment, long cardFrom, long cardTo);
}