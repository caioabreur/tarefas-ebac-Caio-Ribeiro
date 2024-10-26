package fabricas;

public class Customer {

    private String gradeRequest;
    private Boolean hasCompanyContract;

    public Customer(String gradeRequest, Boolean hasCompanyContract) {
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }

    public String getGradeRequest() {
        return gradeRequest;
    }

    public Boolean HasCompanyContract() {
        return hasCompanyContract;
    }
}
