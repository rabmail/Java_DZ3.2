public class Main {
    public static void main(String[] args) {

        long account = 100_00;
        long remittance = 1100_00;
        long limit = 1000_00;
        long bonus = 1_00;

        if (remittance > limit) {
            //отбрасываем дробную часть
            bonus = (remittance / 100 / 100) * bonus;
            //сумма на счете если с бонусом
            account = account + remittance + bonus;
        } else {
            //сумма на счете без бонуса
            account = account + remittance;
        }
        System.out.println(account);
    }
}
