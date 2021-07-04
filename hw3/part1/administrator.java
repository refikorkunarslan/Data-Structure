public class administrator {

    private Company company;

    public Company getCompany() { return company; }

    /**
     *
     * @param company which company owned
     */
    public administrator(Company company)
    {
        this.company = company;
    }

    /**
     *
     * @param branchCode add branch with branchcode
     * @return true if succesfull add
     */
    public boolean addBranch(int branchCode)
    {
        return getCompany().getBranch().add(new branch(getCompany(),branchCode));
    }

    /**
     *
     * @param branchCode remove which branch
     * @return true if succesfull remove
     */
    public boolean removeBranch(int branchCode)
    {
        return getCompany().getBranch().remove(new branch(getCompany(),branchCode));
    }

    /**
     *
     * @param branchCode which add bracnch employee at branch
     * @return true if succesfull remove
     */
    public boolean addBranchEmployee(int branchCode)
    {
        int index=0;
        return getCompany().getBranch().get(branchCode).getBranchEmployee().add(new branchEmployee(getCompany().getBranch().get(index)));
    }

    /**
     *
     * @param branchCode which employee branch
     * @param name which  removed employee
     * @param surname which removed employee
     * @param id which  removed employee
     * @return true if succesfull remove operation
     */
    public boolean removeBranchEmployee(int branchCode, String name, String surname, int id)
    {
        int index=0;
        if((index = getCompany().getBranch().indexOf(new branch(getCompany(),branchCode))) == -1)
            return false;
        return getCompany().getBranch().get(index).getBranchEmployee().remove(new branchEmployee(getCompany().getBranch().get(index)));
    }


}
