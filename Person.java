package Java_RoadMap;

public class Person {

    /* private Person personName; /*  This is an Instance of Class 'Name' */ 

    private String name;
    private static int personCounter=0;

    //Parametrized Constructor
    public Person( String personName){
        this.name=personName;
        personCounter++;
    }

    //Default Constructor
    public Person(){
        personCounter++;
    }

    //To check How many number of people have entered
    public int numOfPerson(){
        return personCounter;
    }

    //Name of the person Is?
    public String pName() {return "Name of the person is: "+ name; }

    //Hello NAME!!!
    public String hello(){
        return "Hello "+ name;
    }
    
}
