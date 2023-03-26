public class Surgeon extends Doctor {
    private boolean operating;

    public Surgeon(String name, int number, String specialty, boolean operating) {
        super(name, number, specialty);
        this.operating = operating;
    }

    public boolean isOperating() {
        return this.operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }

    public void work() {
        super.work();
        if (this.operating) {
            System.out.println(this.name + " is operating now.");
        }

    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " Operating: " + this.operating;
    }
}
