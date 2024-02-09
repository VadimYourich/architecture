
/**
 * Абстрактный класс валидации вводимых данных
 */
public abstract class EnterData {
    /**
     * Метод ввода и валидации целого числа в диапазоне
     */
    protected int inputInt(int minVariant, int maxVariant) throws RuntimeException {
        return num;
    }

    /**
     * Метод ввода и валидации целого числа в диапазоне
     */
    protected long inputLong(long minVariant, long maxVariant) throws RuntimeException {
        return num;
    }

    /**
     * Meтод ввода даты и ее валидация
     */
    protected Date inputDate() throws RuntimeException {
        return date;
    }
}