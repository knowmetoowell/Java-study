package oop6;

public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account(10000);
        System.out.println(a1);
        Account a2 = new Account(10000);
        System.out.println(a2);
        Account a3 = new Account(10000);
        System.out.println(a3);

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());
        System.out.println(a1.money2);
        System.out.println(a2.money2);
        System.out.println(a3.money2);
    }
}
