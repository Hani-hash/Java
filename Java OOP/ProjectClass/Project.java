public class Project {
    private String name;
    private String description;

    public String elevatorPitch(){
        return (name + " , " + description) ;
    }

    public Project(){
    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name , String description){
        this.description = description;
    }
    //Getter for the name 
    public String getName(){
        return name;
    }
    //Setter for the name 
    public void setName(String name){
        this.name = name;
    }
    //Getter for the description
    public String getDescription(){
        return description;
    }
    // Setter for the description
    public void setDescription(String description){
        this.description = description;
    }
}