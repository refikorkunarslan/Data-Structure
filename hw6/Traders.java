import java.util.ArrayList;

public class Traders {
    private Products pro;

    /**
     *
     * @param pro constructor
     */
    public Traders(Products pro)
    {
        this.pro=pro;
    }

    /**
     *
     * @param id entered id
     * @param product_name entered prduct name
     * @param product_category_tree entered catafory
     * @param price entered price
     * @param discounter entered discountrer
     * @param descripton entred descripyion
     */
    public void addProduct(String id,String product_name,String product_category_tree,String price,String discounter,String descripton)
    {
         pro.id.add(id);
         pro.product_name.add(product_name);
         pro.product_category_tree.add(product_category_tree);
         pro.price.add(price);
         pro.discounter.add(discounter);
         pro.descripton.add(descripton);

    }

    /**
     *
     * @param id delete product id
     */
    public void deleteProduct(String id)
    {
        int a;
        a=pro.id.indexOf(id);
        if(a !=-1)
        {
            pro.id.remove(a);
            pro.product_name.remove(a);
            pro.product_category_tree.remove(a);
            pro.price.remove(a);
            pro.discounter.remove(a);
            pro.descripton.remove(a);
            System.out.println("Removed");
        }
        else
        {
            System.out.println("Wrong id product");
        }


    }

    /**
     *
     * @param id edited id
     * @param product_name edited prdocut name
     * @param product_category_tree edited category
     * @param price edited price
     * @param discounter edited discounter
     * @param descripton edited descriptiob
     */
    public void editProduct(String id,String product_name,String product_category_tree,String price,String discounter,String descripton)
    {
        int a;
        a=pro.id.indexOf(id);
        if(a !=-1)
        {
            pro.product_name.set(a,product_name);
            pro.product_category_tree.add(a,product_category_tree);
            pro.price.add(a,price);
            pro.discounter.add(a,discounter);
            pro.descripton.add(a,descripton);

        }


    }
}
