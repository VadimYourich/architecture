import Interfaces.ICarrierRepo;
import Models.Carrier;

/**
 * Класс репозиторий для имитации работы с базой данных перевозчиков
 */

public class CarrierRepository implements ICarrierRepo {
    private static CarrierRepository carrierRepository;
    private List<Carrier> carriers;

    private CarrierRepository() {
        // Заполняем базу данных
    }

    public static CarrierRepository getCarrierRepository() {
    }

    @Override
    public Carrier read(int id) {
    }
}