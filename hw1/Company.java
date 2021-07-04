public class Company
{
    private administrator administrator;
    private cont<branch> branch;
    private cont<person> customer;

    public Company( )
    {
        branch = new cont<>();
        customer = new cont<>();
    }

/*    public Shipment queryShipment(int trackingNumber)
    {
        for(int i=0 ; i < getBranch().size() ; ++i)
            for(int j=0 ; j < getBranch().at(i).getShipment().size() ; ++j)
                if(getBranch().at(i).getShipment().at(j).getTrackingNumber() == trackingNumber)
                    return getBranch().at(i).getShipment().at(j);
        return null;
    }
*/

    public void setAdministrator(administrator administrator) {
        this.administrator = administrator;
    }

    public administrator getAdministrator() { return administrator; }

    public cont<branch> getBranch() { return branch; }

    public cont<person> getCustomer() { return customer; }
/*
    @Override
    public boolean equals(Object o)
    {
        if(o == null)
            return false;
        if(!(o instanceof Company))
            return false;

        return getCompanyName().equals(((CargoCompany)o).companyName);
    }


    @Override
    public String toString()
    {
        String str = "";

        str += getCompanyName() + "\n";
        str += "Administrator : " + getAdministrator().getName() + "  " + getAdministrator().getSurname() + "\n";

        return str;
    }
    */
}