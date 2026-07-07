import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String userId;
    private String name;
    private String email;
    private String password;
    private LocalDateTime registrationDate;
    public boolean profileCompleted;
    private List<Integer>ratings;
    private List<String>reviews;
    
    public User(String name, String email, String password){
        this.userId = UUID. randomUUID().toString().substring(0,8);
        this.name = name;
        this.email = email;
        this.password = password;
        this.registrationDate = LocalDateTime.now();
        this.profileCompleted = false;
        this.ratings = new ArrayList<>();
    }
    public double getAverageRating(){
        if (ratings.isEmpty())return 0.0;
        int sum = 0;
        for(int r: ratings)sum+=r;
        return Math.round((double)sum/ratings.size()*10.0)/10.0;
    }
    
    public Boolean checkpassword(String password){
        return this.password.equals(password);
    }   
        
        
    public void addReview(int rating, String reviewText){
        if(rating>=1&&rating<=5){
            ratings.add(rating);
            reviews.add(reviewText);
        }
    }
   public String getUserId(){ 
       return userId;
   } 
   public String getname(){ 
       return name;
   } 
   public String getemail(){ 
       return email;
   }
   
   public String getpassword() {
    return password;
   }
   
   public void setname(String name){
    this.name = name;
}
   
}