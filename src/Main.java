import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Month thisMonth = Month.JUNE;
        System.out.println("This months is: " + thisMonth.getHungarianName());
        for (Month month : Month.values() ) {
            System.out.println(month.getHungarianName());
        }

        Season thisSeason = Season.SUMMER;
        System.out.println("We are in the " + thisSeason + " season.");
        for (Season season: Season.values()) {
            System.out.println(season);
        }

        System.out.println(thisMonth.isSummerMonth());
        System.out.println(thisMonth.isAutumnMonth());
        System.out.println(thisMonth.isWinterMonth());
        System.out.println(thisMonth.isSpringMonth());

        System.out.println(thisMonth.getMonthNumber());

        for (Month month : Month.values()) {
            System.out.println(month.getMonthNumber() + ". hónap: " + month.getHungarianName());
        }

        System.out.println(thisSeason.getHungarianName());
    }
}