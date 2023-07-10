public class Main {
    public static void main(String[] args) {
        int bill = 100;
        int refill = 1000;
        int bonus = refill > 1000 ?
                refill / 100 :
                0;
        int totalAmount = bill + refill + bonus;

        System.out.println("Итоговый сумма на счету клиента: " + totalAmount);
    }
}
