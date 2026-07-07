public class Job {

    private int jobId;
    private String title;
    private String description;
    private double budget;
    private String clientName;   
    private boolean isCompleted;
    private String deadline;
    

    public Job(int jobId, String title, String description, double budget, String clientName , String deadline) {

        this.jobId = jobId;
        this.title = title;
        this.description = description;
        this.budget = budget;
        this.clientName = clientName;
        this.isCompleted = false;
        this.deadline = deadline;
    }
    
    public String getDeadline() {
        return deadline;
    }

    public void markCompleted() {
        isCompleted = true;
    }

    public int getJobId() {
        return jobId;
    }

    public double getBudget() {
        return budget;
    }

    public String getClientName() {
        return clientName;
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }

     public String getJobInfo() {
    return jobId + "," +
           title + "," +
           description + "," +
           budget + "," +
           clientName + "," +
           deadline + "," +
           "Open";
}
}
