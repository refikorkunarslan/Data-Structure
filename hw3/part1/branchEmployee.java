public class branchEmployee {
    private branch branch;

    /**
     *
     * @param branch constructor
     */
    public branchEmployee(branch branch)
    {
        this.branch = branch;
    }

    /**
     *
     * @return get brach
     */
    public branch getBranch() { return branch; }

    /**
     *
     * @param name user
     * @param surname user
     * @param email user
     * @param password user
     * @return  add user correctly
     */
    public boolean addUser(String name, String surname, String email,int password)
    {
        return getBranch().getCompany().getCustomer().add(new person(name,surname,email,password));
    }

    /**
     *
     * @param name user
     * @param surname user
     * @param email user
     * @param password user
     * @return remove user corrently
     */
    public boolean removeUser(String name, String surname,String email,int password)
    {
        return getBranch().getCompany().getCustomer().remove(new person(name,surname,email,password));
    }

    /**
     *
     * @param a officeChairModel
     * @param c officeChairColor
     * @return add shipment correncly
     */
    public boolean enterShipmentInformation(officeChairModel a,officeChairColor c)
    {
        return getBranch().getOfficeChair().add(new officeChair(a,c));
    }

    /**
     *
     * @param a (officeDeskModel
     * @param c officeDeskColor
     * @return add shipment correncly
     */
    public boolean enterShipmentInformation(officeDeskModel a,officeDeskColor c)
    {
        return getBranch().getOfficeDesk().add(new officeDesk(a,c));
    }

    /**
     *
     * @param a meetableModel
     * @param c meetableColor
     * @return add shipment correncly
     */
    public boolean enterShipmentInformation(meetableModel a,meetableColor c)
    {
        return getBranch().getMeetable().add(new meetable(a,c));
    }

    /**
     *
     * @param a bookcaseModel
     * @return add shipment corrently
     */
    public boolean enterShipmentInformation(bookcaseModel a)
    {
        return getBranch().getBookcase().add(new bookcase(a));
    }

    /**
     *
     * @param a officeCabinetModel
     * @return add shipment corrently
     */
    public boolean enterShipmentInformation(officeCabinetModel a)
    {
        return getBranch().getOfficeCabinet().add(new officeCabinet(a));
    }


    /**
     *
     * @param a officeChairModel
     * @param c officeChairColor
     */
    public void removeShipmentInformation(officeChairModel a,officeChairColor c)
    {
        int j;

        for( j=0 ; j < getBranch().getOfficeChair().size() ; ++j)
        {

            if(getBranch().getOfficeChair().get(j).getOfficeChairModel()== a && getBranch().getOfficeChair().get(j).getOfficeChairColor()== c )
            {
                getBranch().getOfficeChair().get(j).clear();
            }
        }
    }


}
