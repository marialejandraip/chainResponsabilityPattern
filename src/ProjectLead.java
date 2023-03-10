//Concrete handler
public class ProjectLead extends Employee {

    public ProjectLead (LeaveApprover successor) {
        super("Project Lead", successor);
    }
    @Override
    protected boolean processRequest(LeaveApplication application) {
        // type of leave sick leave and duration is less than or equal 2 days
        if(application.getType() == LeaveApplication.Type.Sick) {
            if(application.getNoOfDays() <=2 ) {
                application.approve(getApporverRole());
                return true;
            }
        }
        return false;
    }
}
