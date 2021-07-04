public class branch {
    private int branchCode;
    private KWLinkedList<branchEmployee> branchEmployee;
    private HybridList<officeChair> officeChair;
    private HybridList<officeDesk> officeDesk;
    private HybridList<meetable> meetable;
    private HybridList<bookcase> bookcase;
    private HybridList<officeCabinet> officeCabinet;

    private Company company;

    /**
     *
     * @param company whick comapny owned
     * @param branchCode attend branchcode
     */
    public branch(Company company,int branchCode)
    {
        this.company = company;
        setBranchCode(branchCode);
        branchEmployee = new KWLinkedList<>();
        officeChair = new HybridList<>();
        officeDesk = new HybridList<>();
        meetable = new HybridList<>();
        bookcase = new HybridList<>();
        officeCabinet= new HybridList<>();
    }

    /**
     *
     * @return get office cabinet
     */
    public HybridList<officeCabinet> getOfficeCabinet() {
        return officeCabinet;
    }

    /**
     *
     * @return get bookcase
     */
    public HybridList<bookcase> getBookcase() {
        return bookcase;
    }

    /**
     *
     * @return get meet table
     */
    public HybridList<meetable> getMeetable() {
        return meetable;
    }

    /**
     * ge
     * @return get office chair
     */
    public HybridList<officeChair> getOfficeChair() {
        return officeChair;
    }

    /**
     *
     * @return get office desk
     */
    public HybridList<officeDesk> getOfficeDesk() {
        return officeDesk;
    }

    /**
     *
     * @return get company
     */
    public Company getCompany() {
        return company;
    }

    /**
     *
     * @return get Branch Employee
     */

    public KWLinkedList<branchEmployee> getBranchEmployee() { return branchEmployee; }



    /**
     *
     * @return get Branch code
     */
    public int getBranchCode() { return branchCode; }

    /**
     *
     * @param branchCode set branchcode
     */

    public void setBranchCode(int branchCode) { this.branchCode = branchCode; }

}
