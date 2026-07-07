public class bid {
    private String projectName; 
    private double amount;
    private String deadline;   
    private String proposal;
    private String status;

    public bid(String projectName, double amount, String deadline, String proposal, String status) {
        this.projectName = projectName;
        this.amount = amount;
        this.deadline = deadline;
        this.proposal = proposal;
        this.status = status;
    }

    public String getProjectName() {
        return projectName;
    }

    public double getAmount() {
        return amount;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getProposal() {
        return proposal;
    }

    public String getStatus() {
        return status;
    }
    
    
    
    
}
