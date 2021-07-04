import java.util.LinkedList;

public class person {

    private KWLinkedList<branch> branch;

    private String name;
    private String surname;
    private String email;
    private int password;
    private int customerNo;


    /**
     *
     *
     * @return branch
     */
    public KWLinkedList<branch> getBranch() {
        return branch;
    }

    /**
     *
     * @param branch which
     * @param model product model
     * @param color product color
     * @return product
     */
    public officeChair searchProduct(KWLinkedList<branch> branch,officeChairModel model, officeChairColor color)
    {

         for(int i=0 ; i < branch.getSize() ; ++i)
        {

            for(int j=0 ; j < branch.get(i).getOfficeChair().size() ; ++j)
            {
                if(branch.get(i).getOfficeChair().get(j).getOfficeChairModel()== model && branch.get(i).getOfficeChair().get(j).getOfficeChairColor()== color )
                {
                    System.out.println("Found it");
                    System.out.println("Branch :" + branch.get(i).getBranchCode());
                    return  branch.get(i).getOfficeChair().get(j);
                }
                else
                {
                    System.out.println(" NOT Found ");



                }

            }
        }

        return null;
    }

    /**
     *
     * @param branch search in
     * @param model type searching
     * @param color searching
     * @return searhing prodcut
     */
    public officeDesk searchProduct(KWLinkedList<branch> branch,officeDeskModel model, officeDeskColor color)
    {

        for(int i=0 ; i < branch.getSize() ; ++i)
        {

            for(int j=0 ; j < branch.get(i).getOfficeDesk().size() ; ++j)
            {
                if(branch.get(i).getOfficeDesk().get(j).getofficeDeskModel()== model && branch.get(i).getOfficeDesk().get(j).getOfficeDeskColor()== color )
                {
                    System.out.println("Found it");
                    System.out.println("Branch :" + branch.get(i).getBranchCode());
                    return  branch.get(i).getOfficeDesk().get(j);
                }
                else
                {
                    System.out.println(" NOT Found ");



                }

            }
        }

        return null;
    }

    /**
     *
     * @param branch search in
     * @param model type searching
     * @param color searching
     * @return searhing prodcut
     */
    public meetable searchProduct(KWLinkedList<branch> branch,meetableModel model,meetableColor color)
    {

        for(int i=0 ; i < branch.getSize() ; ++i)
        {

            for(int j=0 ; j < branch.get(i).getMeetable().size() ; ++j)
            {
                if(branch.get(i).getMeetable().get(j).getmeetableModel()== model && branch.get(i).getMeetable().get(j).getMeetableColor()== color )
                {
                    System.out.println("Found it");
                    System.out.println("Branch :" + branch.get(i).getBranchCode());
                    return  branch.get(i).getMeetable().get(j);
                }
                else
                {
                    System.out.println(" NOT Found ");



                }

            }
        }

        return null;
    }

    /**
     *
     * @param branch search in
     * @param model type searching
     * @return searhing prodcut
     */
    public bookcase searchProduct(KWLinkedList<branch> branch,bookcaseModel model)
    {

        for(int i=0 ; i < branch.getSize() ; ++i)
        {

            for(int j=0 ; j < branch.get(i).getBookcase().size() ; ++j)
            {
                if(branch.get(i).getBookcase().get(j).getBookcaseModel()== model )
                {
                    System.out.println("Found it");
                    System.out.println("Branch :" + branch.get(i).getBranchCode());
                    return  branch.get(i).getBookcase().get(j);
                }
                else
                {
                    System.out.println(" NOT Found ");



                }

            }
        }

        return null;
    }

    /**
     *
     * @param branch search in
     * @param model type searching
     * @return searhing prodcut
     */
    public officeCabinet searchProduct(KWLinkedList<branch> branch,officeCabinetModel model)
    {

        for(int i=0 ; i < branch.getSize() ; ++i)
        {

            for(int j=0 ; j < branch.get(i).getOfficeCabinet().size() ; ++j)
            {
                if(branch.get(i).getOfficeCabinet().get(j).getOfficeCabinetModel()== model )
                {
                    System.out.println("Found it");
                    System.out.println("Branch :" + branch.get(i).getBranchCode());
                    return  branch.get(i).getOfficeCabinet().get(j);
                }
                else
                {
                    System.out.println(" NOT Found ");



                }

            }
        }

        return null;
    }

    /**
     *
     * @param ranch ds
     * @param Adres adress
     * @param phone pgone
     * @param a    model
     * @param c   color
     */
   public void buy(KWLinkedList<branch> ranch,String Adres,int phone,officeChairModel a,officeChairColor c)
    {
       officeChair b=searchProduct(ranch,a,c);
        b.setOfficeChairModel(null);
        b.setOfficeChairColor(null);
        System.out.println("Buy it");

    }

    /**
     *
     * @param ranch ds
     * @param Adres adress
     * @param phone pgone
     * @param a    model
     * @param c   color
     */
    public void buy(KWLinkedList<branch> ranch,String Adres,int phone,officeDeskModel a,officeDeskColor c)
    {
        officeDesk b=searchProduct(ranch,a,c);
        b.setofficeDeskModel(null);
        b.setofficeDeskColor(null);
        System.out.println("Buy it");
    }

    /**
     *
     * @param ranch ds
     * @param Adres adress
     * @param phone pgone
     * @param a    model
     * @param c   color
     */
    public void buy(KWLinkedList<branch> ranch,String Adres,int phone,meetableModel a,meetableColor c)
    {
        meetable b=searchProduct(ranch,a,c);
        b.setmeetableModel(null);
        b.setmeetableColor(null);
        System.out.println("Buy it");
    }

    /**
     *
     * @param ranch ds
     * @param Adres adress
     * @param phone pgone
     * @param a    model
     */
    public void buy(KWLinkedList<branch> ranch,String Adres,int phone,bookcaseModel a)
    {
        bookcase b=searchProduct(ranch,a);
        b.setBookcaseModel(null);
        b.setBookcaseModel(null);
        System.out.println("Buy it");
    }

    /**
     *
     * @param ranch ds
     * @param Adres adress
     * @param phone pgone
     * @param a    model
     */
    public void buy(KWLinkedList<branch> ranch,String Adres,int phone,officeCabinetModel a)
    {
        officeCabinet b=searchProduct(ranch,a);
        b.setOfficeCabinetModel(null);
        b.setOfficeCabinetModel(null);
        System.out.println("Buy it");
    }

    /**
     *
     * @param name person
     * @param surname person
     * @param email person
     * @param password person
     */
    public person(String name, String surname, String email, int password)
    {
        setName(name);
        setSurname(surname);
        setEmail(email);
        setPassword(password);
        setCustomerNo(password % 1000);


    }

    /**
     *
     * @return customer no
     */
    public int getCustomerNo() {
        return customerNo;
    }

    /**
     *
     * @param customerNo set
     */
    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    /**
     *
     * @return get name
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * @return get surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     *
     * @return get email
     */
    public String getEmail() {
        return email;
    }

    public int getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
