public class Employee extends Person{
    private String sector;
    private Boolean working;

    // Methods

    public void changeJob() {

    }

    // Special methods

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Boolean isWorking() {
        return this.working;
    }

    public void setWorking(Boolean working) {
        this.working = working;
    }

}
