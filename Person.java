package Java_RoadMap;

public class Person {

    /* private Person personName; /*  This is an Instance of Class 'Name' */ 

    private String name;
    private static int personCounter=0;

    public Person( String personName){
        this.name=personName;
        personCounter++;
    }

    public int numOfPerson(){
        return personCounter;
    }

    public String hello(){
        return "Hello "+ name;
    }
    
}
