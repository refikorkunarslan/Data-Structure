import com.sun.source.tree.ArrayAccessTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.util.Collections.sort;

public class Users {
    public HashSet<String> trader;
    public Queue<String> Customer;

    /**
     *
     * @param file read customer file and enter data sturucture
     * @param fil read trader file and enter data sturucture
     */
    public Users(String file ,String fil)
    {
        trader=new HashSet<String>();
        Customer=new LinkedList<>();
        try {

            File myObj = new File(file);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int i=0;
                int k=0;
                int z=0;

                while(i< data.length())
                {


                    if(data.charAt(i) ==' ' || i==data.length()-1)
                    {
                        if(k==0)
                        {
                            trader.add(data.substring(0,i));
                            z=i+1;

                        }
                        if(k==1)
                        {
                            trader.add(data.substring(z,i));
                            z=i+1;

                        }
                        if(k==2)
                        {
                            trader.add(data.substring(z,i));
                            z=i+1;

                        }
                        k++;

                    }
                    i++;

                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        try {

            File myObj = new File(fil);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int i=0;
                int k=0;
                int z=0;

                while(i< data.length())
                {


                    if(data.charAt(i) ==' ')
                    {
                        if(k==0)
                        {
                            trader.add(data.substring(0,i));
                            z=i+1;

                        }
                        if(k==1)
                        {
                            trader.add(data.substring(z,i));
                            z=i+1;

                        }
                        if(k==2)
                        {
                            trader.add(data.substring(z,i));
                            z=i+1;

                        }
                        k++;

                    }
                    i++;

                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

    /**
     *
     * @param ID user Id
     * @param password user passwprd
     * @param traderr Trader class
     * @param custt Trader customer
     */
    public void login(String ID,String password,Traders traderr,Customers custt)
    {

        while(true)
        {


                menu( traderr,custt);




        }


    }

    /**
     * menu
     * @param trader trader class
     * @param cust customer class
     */
    public void menu(Traders trader,Customers cust)
    {

        Scanner in = new Scanner(System.in);
        // Display the menu
        System.out.println("1\t Traders add product");
        System.out.println("2\t Traders remove product");
        System.out.println("3\t Traders edit product");


        System.out.println("4\t Customers can search and query the products by their names. The products that contain the " +
                "search text in their name or description should be returned in the results. ");
        System.out.println("5\t Sort Price");
        System.out.println("6\t Sort Discount");
        System.out.println("7\t Sort Name");
        System.out.println("8\t Category or the prices with respect to given upper or lower (or both) thresholds.");
        System.out.println("9\t Customers can display all the products of a trader. ");

        System.out.println("Please enter your choice:");

        //Get user's choicr
        int choice=in.nextInt();

        //Display the title of the chosen module
        switch (choice) {
            case 1:

                Scanner id = new Scanner(System.in);
                Scanner product_name = new Scanner(System.in);
                Scanner product_category_tree = new Scanner(System.in);
                Scanner price = new Scanner(System.in);
                Scanner discounter = new Scanner(System.in);
                Scanner descripton = new Scanner(System.in);
                System.out.println("enter id");
                String a=id.nextLine();
                System.out.println("enter product_name");
                String b=product_name.nextLine();
                System.out.println("enter product_category_tree");
                String c=product_category_tree.nextLine();
                System.out.println("enter price");
                String d=price.nextLine();
                System.out.println("enter discounter");
                String e=discounter.nextLine();
                System.out.println("enter desription");
                String f=descripton.nextLine();
                trader.addProduct(a,b,c,d,e,f);
                break;
            case 2:
                System.out.println("Removed Id product");
                Scanner id2 = new Scanner(System.in);
                String a2=id2.nextLine();
                trader.deleteProduct(a2);
                break;
            case 3:
                Scanner id1 = new Scanner(System.in);
                Scanner product_name1 = new Scanner(System.in);
                Scanner product_category_tree1 = new Scanner(System.in);
                Scanner price1 = new Scanner(System.in);
                Scanner discounter1 = new Scanner(System.in);
                Scanner descripton1 = new Scanner(System.in);
                System.out.println("enter id");

                String a1=id1.nextLine();
                System.out.println("enter product_name");
                String b1=product_name1.nextLine();
                System.out.println("enter product_category_tree");
                String c1=product_category_tree1.nextLine();
                System.out.println("enter price");
                String d1=price1.nextLine();
                System.out.println("enter discounter");
                String e1=discounter1.nextLine();
                System.out.println("enter desription");
                String f1=descripton1.nextLine();
                trader.editProduct(a1,b1,c1,d1,e1,f1);
                break;
            case 4:
                System.out.println("enter product_name");
                Scanner name = new Scanner(System.in);
                String nam=name.nextLine();
                System.out.println(cust.search(nam));
                break;
            case 5:
                ArrayList<Integer> s=new ArrayList<Integer>();
                int i=1;
                System.out.println(cust.pro.price.get(i));
                while(i<cust.pro.price.size())
                {
                    s.add(Integer.parseInt(cust.pro.price.get(i)));
                    i++;
                }
                sort( s);
                i=0;
                while(i<s.size())
                {
                    System.out.println(s.get(i));
                    i++;
                }
                break;

            case 6:
                ArrayList<Integer> ss=new ArrayList<Integer>();
                 i=1;
                while(i<cust.pro.discounter.size())
                {
                    ss.add(Integer.parseInt(cust.pro.price.get(i)));
                    i++;
                }
                sort( ss);
                i=0;
                while(i<ss.size())
                {
                    System.out.println(ss.get(i));
                    i++;
                }
                break;

            case 7:
                ArrayList<String> sss=new ArrayList<String>();
                i=1;
                while(i<cust.pro.discounter.size())
                {
                    sss.add(cust.pro.price.get(i));
                    i++;
                }
                sort( sss);
                i=0;
                while(i<sss.size())
                {
                    System.out.println(sss.get(i));
                    i++;
                }
                break;

            case 8 :
                System.out.println("enter low");
                System.out.println("enter high");
                Scanner low = new Scanner(System.in);
                Scanner high = new Scanner(System.in);
                int cho=low.nextInt();
                int co=high.nextInt();
                ArrayList<Integer> saq=new ArrayList<Integer>();
                i=1;
                while(i<cust.pro.price.size())
                {
                    saq.add(Integer.parseInt(cust.pro.price.get(i)));
                    i++;
                }
                sort( saq);
                i=0;
                while(i< saq.size() )
                {
                    if(saq.get(i)> cho && saq.get(i)<co)
                    {
                        System.out.println(cust.pro.product_category_tree.get(i));

                    }
                      i++;
                }
                break;

            case 9 :

                System.out.println("Enter Trader");
                Scanner ow = new Scanner(System.in);
                String nm=ow.nextLine();
                i=0;
                while(i<cust.pro.sd.size())
                {

                        System.out.println(cust.pro.id.get(i)+" "+cust.pro.product_name.get(i)+" "+cust.pro.product_category_tree.get(i)+" "+cust.pro.discounter.get(i)+" "+cust.pro.descripton.get(i));

                    i++;
                }
            break;

            default: System.out.println("Invalid choice");
        }//end of switch

    }

    /**
     *
     * @param table sort array
     * @param <T> asd
     */
    public  <T extends Comparable<T>> void sortt(ArrayList<Integer> table) {
        for (int nextPos = 1; nextPos < table.size(); nextPos++) {

            insert(table, nextPos);
        } // End for.
    } // End

    /**
     *
     * @param table sort array
     * @param nextPos variable support
     * @param <T> asd
     */
    private <T extends Comparable<T>> void insert(ArrayList<Integer> table,
                                                  int nextPos) {
        Integer nextVal = table.get(nextPos);
// Element to insert.
        while (nextPos > 0 && nextVal.compareTo(table.get(nextPos)) < 0) {
            table.set(nextPos,table.get(nextPos -1));
// Shift down.
            nextPos--;
// Check next smaller element.
        }
// Insert nextVal at nextPos.

        table.set(nextPos,nextVal);
    }





}
