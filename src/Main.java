public class Main {
    public static void main(String[] args) {
        Month thisMonth = Month.JUNE;
        System.out.println("This months is: " + thisMonth);
        for (Month month : Month.values() ) {
            System.out.println(month);
        }

        Season thisSeason = Season.SUMMER;
        System.out.println("We are in the " + thisSeason + " season.");
        for (Season season: Season.values()) {
            System.out.println(season);
        }
    }
}