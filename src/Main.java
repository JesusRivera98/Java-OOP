import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatric");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        int i = 0;
        int b = 2;
        b = i;
        String name = "Ann";

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient.name);
        System.out.println(patient.email);

        patient.weight = 60.5; //kg
        patient.height = 01.65; //Mts.

        System.out.println(patient.weight);
        System.out.println(patient.height);

        patient.weight = 54.5;
        patient.name = "Juan";
        /*Patient patient2 = new Patient("Anahí", "anahi@mail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());*/

        /*patient.setWeight(54.6);
        System.out.println(patient.getName());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());*/
    }
}
