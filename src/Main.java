public class Main {
    public static void main(String[] args) {

        long Account = 100_00;
        long Remittance = 1100_00;
        long Limit = 1000_00;
        long Bonus = 1_00;

        if (Remittance > Limit) {
            //отбрасываем дробную часть
           Bonus =  (Remittance / 100 /100)*Bonus;
           //сумма на счете если с бонусом
            Account = Account + Remittance + Bonus;
        } else {
            //сумма на счете без бонуса
            Account = Account + Remittance;
        }
        System.out.println(Account);
    }
}
