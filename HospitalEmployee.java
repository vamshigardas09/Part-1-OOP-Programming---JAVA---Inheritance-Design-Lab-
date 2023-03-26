public class HospitalEmployee extends Hospital {
    protected String name;
    protected int number;

    public HospitalEmployee(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void work() {
        System.out.println(this.name + " works for the hospital.");
    }

    public String toString() {
        return this.name + " " + this.number;
    }
}
