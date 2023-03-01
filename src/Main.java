public class Main {
    public static void main(String[] args) {
        int initialbalance = 1000;
        int addent = 350;
        int bonus = 0;
        if (addent > 1000) {
            bonus = addent / 100;}
        int finalbalance = initialbalance + addent + bonus;
        System.out.println("Итог: " + finalbalance);
        System.out.println("Бонус: " + bonus);

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран


    }
}