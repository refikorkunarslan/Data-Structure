public class person {

    private cont<branch> branch;

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
    public cont<branch> getBranch() {
        return branch;
    }

    /**
     *
     * @param branch which
     * @param model product model
     * @param color product color
     * @return
     */
    public officeChair searchProduct(cont<branch> branch,officeChairModel model, officeChairColor color)
    {

         for(int i=0 ; i < branch.size() ; ++i)
        {

            for(int j=0 ; j < branch.at(i).getOfficeChair().size() ; ++j)
            {
                if(branch.at(i).getOfficeChair().at(j).getOfficeChairModel()== model && branch.at(i).getOfficeChair().at(j).getOfficeChairColor()== color )
                {
                    System.out.println("Found it");
                    System.out.println("Branch :" + branch.at(i).getBranchCode());
                    return  branch.at(i).getOfficeChair().at(j);
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
     * @param branch
     * @param model
     * @param color
     * @return
     */
    public officeDesk searchProduct(cont<branch> branch,officeDeskModel model, officeDeskColor color)
    {

        for(int i=0 ; i < branch.size() ; ++i)
        {

            for(int j=0 ; j < branch.at(i).getOfficeDesk().size() ; ++j)
            {
                if(branch.at(i).getOfficeDesk().at(j).getofficeDeskModel()== model && branch.at(i).getOfficeDesk().at(j).getOfficeDeskColor()== color )
                {
                    System.out.println("Found it");
                    System.out.println("Branch :" + branch.at(i).getBranchCode());
                    return  branch.at(i).getOfficeDesk().at(j);
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
     * @param branch
     * @param model
     * @param color
     * @return
     */
    public meetable searchProduct(cont<branch> branch,meetableModel model,meetableColor color)
    {

        for(int i=0 ; i < branch.size() ; ++i)
        {

            for(int j=0 ; j < branch.at(i).getMeetable().size() ; ++j)
            {
                if(branch.at(i).getMeetable().at(j).getmeetableModel()== model && branch.at(i).getMeetable().at(j).getMeetableColor()== color )
                {
                    System.out.println("Found it");
                    System.out.println("Branch :" + branch.at(i).getBranchCode());
                    return  branch.at(i).getMeetable().at(j);
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
     * @param branch
     * @param model
     * @return
     */
    public bookcase searchProduct(cont<branch> branch,bookcaseModel model)
    {

        for(int i=0 ; i < branch.size() ; ++i)
        {

            for(int j=0 ; j < branch.at(i).getBookcase().size() ; ++j)
            {
                if(branch.at(i).getBookcase().at(j).getBookcaseModel()== model )
                {
                    System.out.println("Found it");
                    System.out.println("Branch :" + branch.at(i).getBranchCode());
                    return  branch.at(i).getBookcase().at(j);
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
     * @param branch
     * @param model
     * @return
     */
    public officeCabinet searchProduct(cont<branch> branch,officeCabinetModel model)
    {

        for(int i=0 ; i < branch.size() ; ++i)
        {

            for(int j=0 ; j < branch.at(i).getOfficeCabinet().size() ; ++j)
            {
                if(branch.at(i).getOfficeCabinet().at(j).getOfficeCabinetModel()== model )
                {
                    System.out.println("Found it");
                    System.out.println("Branch :" + branch.at(i).getBranchCode());
                    return  branch.at(i).getOfficeCabinet().at(j);
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
   public void buy(cont<branch> ranch,String Adres,int phone,officeChairModel a,officeChairColor c)
    {
       officeChair b=searchProduct(ranch,a,c);
        b.setOfficeChairModel(null);
        b.setOfficeChairColor(null);

    }

    /**
     *
     * @param ranch
     * @param Adres
     * @param phone
     * @param a
     * @param c
     */
    public void buy(cont<branch> ranch,String Adres,int phone,officeDeskModel a,officeDeskColor c)
    {
        officeDesk b=searchProduct(ranch,a,c);
        b.setofficeDeskModel(null);
        b.setofficeDeskColor(null);
    }

    /**
     *
     * @param ranch
     * @param Adres
     * @param phone
     * @param a
     * @param c
     */
    public void buy(cont<branch> ranch,String Adres,int phone,meetableModel a,meetableColor c)
    {
        meetable b=searchProduct(ranch,a,c);
        b.setmeetableModel(null);
        b.setmeetableColor(null);
    }

    /**
     *
     * @param ranch
     * @param Adres
     * @param phone
     * @param a
     */
    public void buy(cont<branch> ranch,String Adres,int phone,bookcaseModel a)
    {
        bookcase b=searchProduct(ranch,a);
        b.setBookcaseModel(null);
        b.setBookcaseModel(null);
    }

    /**
     *
     * @param ranch
     * @param Adres
     * @param phone
     * @param a
     */
    public void buy(cont<branch> ranch,String Adres,int phone,officeCabinetModel a)
    {
        officeCabinet b=searchProduct(ranch,a);
        b.setOfficeCabinetModel(null);
        b.setOfficeCabinetModel(null);
    }

    /**
     *
     * @param name
     * @param surname
     * @param email
     * @param password
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
     * @return
     */
    public int getCustomerNo() {
        return customerNo;
    }

    /**
     *
     * @param customerNo
     */
    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }
  
    public String getName()
    {
        return name;
    }

    public String getSurname() {
        return surname;
    }

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
