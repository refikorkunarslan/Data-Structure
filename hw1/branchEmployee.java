public class branchEmployee {
    private branch branch;
    private Type type;


    public branchEmployee(branch branch)
    {
        this.branch = branch;
    }


    public branch getBranch() { return branch; }

    public boolean addUser(String name, String surname, String email,int password)
    {
        return getBranch().getCompany().getCustomer().insert(new person(name,surname,email,password));
    }


    public boolean removeUser(String name, String surname,String email,int password)
    {
        return getBranch().getCompany().getCustomer().erase(new person(name,surname,email,password));
    }


    public boolean enterShipmentInformation(officeChairModel a,officeChairColor c)
    {
        return getBranch().getOfficeChair().insert(new officeChair(a,c));
    }
    public boolean enterShipmentInformation(officeDeskModel a,officeDeskColor c)
    {
        return getBranch().getOfficeDesk().insert(new officeDesk(a,c));
    }
    public boolean enterShipmentInformation(meetableModel a,meetableColor c)
    {
        return getBranch().getMeetable().insert(new meetable(a,c));
    }
    public boolean enterShipmentInformation(bookcaseModel a)
    {
        return getBranch().getBookcase().insert(new bookcase(a));
    }
    public boolean enterShipmentInformation(officeCabinetModel a)
    {
        return getBranch().getOfficeCabinet().insert(new officeCabinet(a));
    }





    public void removeShipmentInformation(officeChairModel a,officeChairColor c)
    {
        int j;

        for( j=0 ; j < getBranch().getOfficeChair().size() ; ++j)
        {

            if(getBranch().getOfficeChair().at(j).getOfficeChairModel()== a && getBranch().getOfficeChair().at(j).getOfficeChairColor()== c )
            {
                getBranch().getOfficeChair().at(j).clear();
            }
        }
    }

/*
    public boolean updateShipmentInformation(int trackingNumber,Status status)
    {
        Shipment ship = getBranch().getCompany().queryShipment(trackingNumber);

        if(ship == null)
            return false;

        ship.setStatus(status);
        return true;
    }

*/
}
