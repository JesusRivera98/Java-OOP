public class Doctor {
    int id;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Constructing Doctor");
    }
    Doctor(String name){
        System.out.println("The Doctor's name is: " + name);
        //this.name = name;
    }

    //Behaviors
    public void showName(){
        System.out.println(name);
    }
}
