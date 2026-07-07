import java.util.ArrayList;
import java.util.List;
class Freelancer extends User {
       private List<String>skills;
       private double hourlyRate;
       public int experienceYears;
       private int completedProjects;
       private List<String>portfolioLinks;
       private boolean availability;
       private String  specialization;
       private List<String> appliedJobs = new ArrayList<>();
       public Freelancer(String name,String email,String password,
               List <String>skills,double hourlyRate){
           super(name,email,password);
           this.skills = skills!= null? skills : new ArrayList<>();
                      this.hourlyRate = hourlyRate ;
                      this.experienceYears = 0;
                      this.completedProjects = 0;
                      this.portfolioLinks = new ArrayList<>();
                      this.availability = true;
                      this.specialization = " ";
                      this.appliedJobs = new ArrayList<>();
       }
   public void addSkill(String skill){
       if(!skills.contains(skill)){
           skills.add(skill);
       }    
   
   
   }
   
    public void updateProfile(int experienceYears,String specialization){
        this.experienceYears = experienceYears;
        this.specialization = specialization;
        this.profileCompleted = true;
    }
    public void showProfile(){
        System.out.println("\n======Freelancer Profile=======");
    
    System.out.println("ID: " + getUserId());
    System.out.println("Name: " + getname());
    System.out.println("Skills: " + String.join(",",skills) );
   System.out.println("Hourly Rate:$" + hourlyRate);
System.out.println(experienceYears + "Experience:" + "years");
System.out.println ("Completed Projects: "+ completedProjects);
System.out.println("Rating:" +getAverageRating()+"/5");
    }
    
    
    
    public double getHourlyRate(){
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    public List<String>getSkills(){
        return skills;
    }
    
    
    public List<String> getAppliedJobs(){

    return appliedJobs;

}
    public void addAppliedJob(String job) {

    appliedJobs.add(job);

}
    public void applyJob(String jobId){

    appliedJobs.add(jobId + " - Pending");

}
   

}