public class administrator {

    private Company company;

    public Company getCompany() { return company; }

    public administrator(Company company)
    {
        this.company = company;
    }
    public boolean addBranch(int branchCode)
    {
        return getCompany().getBranch().insert(new branch(getCompany(),branchCode));
    }
    public boolean removeBranch(int branchCode)
    {
        return getCompany().getBranch().erase(new branch(getCompany(),branchCode));
    }

    public boolean addBranchEmployee(int branchCode)
    {
        int index=0;


        return getCompany().getBranch().at(branchCode).getBranchEmployee().insert(new branchEmployee(getCompany().getBranch().at(index)));
    }
    public boolean removeBranchEmployee(int branchCode, String name, String surname, int id)
    {
        int index=0;

        if((index = getCompany().getBranch().contains(new branch(getCompany(),branchCode))) == -1)
            return false;

        return getCompany().getBranch().at(index).getBranchEmployee().erase(new branchEmployee(getCompany().getBranch().at(index)));
    }
}
