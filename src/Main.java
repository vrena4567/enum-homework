public class Main {
    public static void main(String[] args) {
        Month thisMonth = Month.JUNE;
        System.out.println("This months is: " + thisMonth);
        for (Month month : Month.values() ) {
            System.out.println(month);
        }
    }
}