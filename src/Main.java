public class Main {
    public static void main(String[] args) {
        int startScore = 50;
        int refill = 1200;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }


        int finishScore = startScore + refill + bonus;
        System.out.println("У вас на счету " + finishScore + " рублей, из них бонусных " + bonus + " рублей.");
    }
}