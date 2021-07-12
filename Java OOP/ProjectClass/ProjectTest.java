public class ProjectTest{
    public static void main (String[] args){
        Project project1 = new Project();
        project1.setName("Workshop1");
        project1.setDescription("This is my first workshop");
        String project1Name = project1.getName();
        String project1Description = project1.getDescription();
        System.out.println("This is the name : " + project1Name + " This is the Description : " + project1Description);

    }
}