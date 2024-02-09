import Interfaces.ICashRepo;
import Models.BankAccount;

/**
 * Класс репозиторий для имитации работы с базой данных банка
 */

public class CashRepository implements ICashRepo {
    private static CashRepository cashRepository;

    private List<BankAccount> clients;

    public List<BankAccount> getClients() {
        return clients;
    }

    private CashRepository() {
        // работа банка
    }

    public static CashRepository getCashRepository() {
    }

    @Override
    public boolean transaction(int payment, long cardFrom, long carrierСard){
        // Проводим валидацию аккаунтов
        
        // Проверяем наличие банковских карт продавца и покупателя
        
        // Проверяем баланс средств на картах
    }
}