public class Nurse extends HospitalEmployee {
    private int numOfPatients;

    public Nurse(String name, int number, int numOfPatients) {
        super(name, number);
        this.numOfPatients = numOfPatients;
    }

    public int getNumOfPatients() {
        return this.numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }

    public void work() {
        super.work();
        System.out.println("works for hospital. has " + this.numOfPatients + " patients.");
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " has " + this.numOfPatients + " patients.";
    }
}

