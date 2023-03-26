public class Doctor extends HospitalEmployee {
    private String specialty;

    public Doctor(String name, int number, String specialty) {
        super(name, number);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void work() {
        super.work();
        System.out.println(this.name + " is a(n) " + this.specialty + " doctor.");
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " " + this.specialty;
    }
}