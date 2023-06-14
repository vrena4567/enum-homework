public enum Month {
    JANUARY("Január"),
    FEBRUARY("Február"),
    MARCH("Március"),
    APRIL("Április"),
    MAY("Május"),
    JUNE("Június"),
    JULY("Július"),
    AUGUST("Augusztus"),
    SEPTEMBER("Szeptember"),
    OCTOBER("Október"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String hungarianName;

    Month(String hungarianName) {
        this.hungarianName = hungarianName;
    }
    public String getHungarianName() {
        return this.hungarianName;
    }

    public boolean isSummerMonth() {
        return this == JUNE || this == JULY || this == AUGUST;
    }public boolean isAutumnMonth() {
        return this == SEPTEMBER || this == OCTOBER || this == NOVEMBER;
    }public boolean isWinterMonth() {
        return this == DECEMBER || this == JANUARY || this == FEBRUARY;
    }public boolean isSpringMonth() {
        return this == MARCH || this == APRIL || this == MAY;
    }

    public int getMonthNumber() {
        return this.ordinal() + 1;
    }

}
