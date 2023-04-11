public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    String whoAmI(){
        if (aware) {
            return "Je m'appelle " + this.firstname + " et je suis aware comme JCVD";
            // ou 
            // return "Je m'appelle " + this.getFirstname() + " et je suis aware comme JCVD";
        } else {
            return "Je m'appelle " + this.firstname + " et je ne suis pas aware";
        }
    }
}
