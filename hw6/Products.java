

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Products {
    ArrayList<String> id;
    ArrayList<String> product_name;
    ArrayList<String> product_category_tree;
    ArrayList<String> price;
    ArrayList<String> discounter;
    LinkedList<String> descripton;
   TreeSet<String> sd;


    /**
     *
     * @param file given file parse and distrubition data stryctyre
     */
    public Products(String file)
    {
        id=new  ArrayList<>();
        product_name=new ArrayList<>();
        product_category_tree=new  ArrayList<>() ;
        price=new ArrayList<>();
        discounter=new ArrayList<>();
        descripton=new LinkedList<>();
        sd=new TreeSet<>();
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


                    if(data.charAt(i) ==';')
                    {
                        if(k==0)
                        {
                            id.add(data.substring(0,i));
                            z=i+1;

                        }
                        if(k==1)
                        {
                            product_name.add(data.substring(z,i));
                            z=i+1;

                        }
                        if(k==2)
                        {
                            product_category_tree.add(data.substring(z,i));
                            z=i+1;

                        }
                        if(k==3)
                        {
                            price.add(data.substring(z,i));
                            z=i+1;

                        }
                        if(k==4)
                        {
                            discounter.add(data.substring(z,i));
                            z=i+1;

                        }
                        if(k==5)
                        {
                            descripton.add(data.substring(z,i));
                            z=i+1;

                        }
                        if(k==6)
                        {
                            //sd.add(data.substring(z,i));
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

}
