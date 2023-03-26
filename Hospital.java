public class Hospital {
    public Hospital() {
    }

    public static void main(String[] args) {
        HospitalEmployee vito = new HospitalEmployee("Vito", 123);
        Doctor michael = new Doctor("Michael", 234, "Heart");
        Surgeon vincent = new Surgeon("Vincent", 645, "Brain", true);
        Nurse sonny = new Nurse("Sonny", 789, 6);
        System.out.println(vito.toString());
        System.out.println(michael.toString());
        System.out.println(vincent.toString());
        System.out.println(sonny.toString());
        vito.work();
        michael.work();
        vincent.work();
        sonny.work();
    }
}