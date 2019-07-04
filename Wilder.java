class Wilder {
    private String firstName;
    private boolean aware;

    public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstName;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isAware() {
        return aware;
    }

    public String whoAmI () {
        if (this.isAware()) {
            return "Je m'appelle " + this.getFirstName() + " et je suis aware.";
        }
        else {
            return "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware.";
        }
    }
}