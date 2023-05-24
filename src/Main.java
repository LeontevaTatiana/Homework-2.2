
public class Main {
    public static void main(String[] args) {
// Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int startingScore = 500;
        int replenishmentAmount = 2000;
        int bonus;

        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }
        int finalScore = startingScore + replenishmentAmount + bonus;
        System.out.println("Итоговый счёт: " + finalScore);
        System.out.println("Количество бонусов: " + bonus);
    }
}