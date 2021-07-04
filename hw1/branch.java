public class branch {
    private int branchCode;
    private cont<branchEmployee> branchEmployee;
    private cont<product> product;
    private cont<officeChair> officeChair;
    private cont<officeDesk> officeDesk;
    private cont<meetable> meetable;
    private cont<bookcase> bookcase;
    private cont<officeCabinet> officeCabinet;

    private Company company;

    public branch(Company company,int branchCode)
    {
        this.company = company;
        setBranchCode(branchCode);
        branchEmployee = new cont<>();
        product = new cont<>();
        officeChair = new cont<>();
        officeDesk = new cont<>();
        meetable = new cont<>();
        bookcase = new cont<>();
        officeCabinet= new cont<>();
    }

    public cont<officeCabinet> getOfficeCabinet() {
        return officeCabinet;
    }

    public cont<bookcase> getBookcase() {
        return bookcase;
    }

    public cont<meetable> getMeetable() {
        return meetable;
    }

    public cont<officeChair> getOfficeChair() {
        return officeChair;
    }

    public cont<officeDesk> getOfficeDesk() {
        return officeDesk;
    }

    public Company getCompany() {
        return company;
    }

    public cont<branchEmployee> getBranchEmployee() { return branchEmployee; }

    public cont<product> getProduct() { return product; }

    public int getBranchCode() { return branchCode; }

    public void setBranchCode(int branchCode) { this.branchCode = branchCode; }

}
