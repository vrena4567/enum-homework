public enum Month {
    JANUARY("Január"),
    FEBRUARY("Február"),
    MARCH("Március"),
    APRIL("Április"),
    MAY("Május"),
    JUNE("Június"),
    JULY("Július"),
    AUGUST("Augusztus"),
    SEPTERMBER("Szeptember"),
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


}
