public class Customers {
    public Products pro;

    /**
     *
     * @param pro constructuor
     */
    public Customers(Products pro)
    {
        this.pro=pro;
    }

    /**
     *
     * @param name product name
     * @return description
     */
    public String search(String name)
    {
        int a;
        a=pro.product_name.indexOf(name);
        if(a !=-1)
        {
            return pro.descripton.get(a);
        }
        else
        {
            System.out.println("Not Have");

        }
        return null;
    }
}
