public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int amount = 1100;
        int amountBalance = balance + amount;

        if (amountBalance < 1000) {
            int allBalance = balance + amount;
            System.out.println(" Баланс: " + allBalance);
            System.out.println(" Кол-во бонусных рублей: 0");
        }
        else {
                int bonus = 100;
                int allBonus = amount / bonus;
                int allBalance2 = balance + amount + allBonus;
            System.out.println(" Баланс: " + allBalance2);
            System.out.println(" Кол-во бонусных рублей: " + allBonus);
            }
        }
    }