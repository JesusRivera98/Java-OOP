public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Constructing Doctor");
        id++;
    }
    Doctor(String name){
        id++;
        System.out.println("The Doctor's name is: " + name);
        //this.name = name;
    }

    //Behaviors
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
