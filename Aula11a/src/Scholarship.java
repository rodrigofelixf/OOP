public class Scholarship extends Student {
    private int scholar;


    public void renewScholar() {

    }

    public int getScholar() {
        return scholar;
    }

    public void setScholar(int scholar) {
        this.scholar = scholar;
    }

    @Override
    public void payMonth() {
        System.out.println("Pagando mensalidade de " + this.getName());
    }
}
