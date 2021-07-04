

public class Company
{
    private administrator administrator;
    private KWLinkedList<branch> branch;
    private KWArrayList<person> customer;

    /**
     * comapany constructor
     */
    public Company( )
    {
        branch = new KWLinkedList<>();
        customer = new KWArrayList<>();
    }

    /**
     *
     * @param administrator set
     */
    public void setAdministrator(administrator administrator) {
        this.administrator = administrator;
    }

    /**
     *
     * @return get administrator
     */
    public administrator getAdministrator() { return administrator; }

    /**
     *
     * @return get branch
     */
    public KWLinkedList<branch> getBranch() { return branch; }

    /**
     *
     * @return get customer
     */

    public KWArrayList<person> getCustomer() { return customer; }

    /**
     *
     * @param email customer
     * @param password customer
     * @return customer account control
     */

    public person login(String email,int password)
    {
        for(int i=0;i<customer.size();i++)
        {
            if(customer.get(i).getEmail()==email && customer.get(i).getPassword()==password)
            {
                return customer.get(i);
            }

        }
        System.out.println("Not member account");

        return null;


    }

}