
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> str=new ArrayList<String>();

        String fileName = "Trader.txt";
        String file = "Products.txt";
        String fil = "Customer.txt";
        try (FileWriter fw
                     = new FileWriter(new File(fileName))) {
        try (FileWriter f
                     = new FileWriter(new File(file))) {
            try (FileWriter fc
                         = new FileWriter(new File(fil))) {


        String fileToParse = "e-commerce-samples.csv";
        BufferedReader fileReader = null;
        int k=0;

        fc.write("orkun"+"00000000"+" " +"aaaaaaaa");
        fc.write("\n");
        fc.write("arslan"+"00000001"+" " +"aaaaaaab");
        fc.write("\n");
        fc.write("refik"+"00000002"+" " +"aaaaaaac");

                //Delimiter used in CSV file
        final String DELIMITER = ",";
        try
        {
            String line = "";
            fileReader = new BufferedReader(new FileReader(fileToParse));
            int i=0;
            int z=0;
            while ((line = fileReader.readLine()) != null)
            {

                //Create the file reader

                String[] tokens = line.split(DELIMITER);
                line = "";


                for(String token : tokens)
                {
                    f.write(token);

                    i=0;
                    while(i<token.length())
                    {

                        if(token.charAt(i) ==';')
                        {

                            k++;

                        }
                        if(k ==6)
                        {
                            k=0;
                            if(!str.contains(token.substring(i+1)))
                            {
                                str.add(token.substring(i+1));
                                fw.write(token.substring(i+1));
                                fw.write(" ");
                                int m = 11111111+z;
                                String s=Integer.toString(m);
                                fw.write(s);
                                fw.write(" ");
                                fw.write("aaaaaa");
                                fw.write("\n");
                                i=i+token.substring(i+1).length();
                                z++;

                            }

                        }



                        i++;
                    }

                }
                f.write("\n");
            }


                fw.write("\n");


        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }
    }
       Users user=new Users(fileName,fil);
        Products pro=new Products(file);
        Traders trader=new Traders(pro);
        Customers c=new Customers(pro);
        user.login("11111111 ","aaaaa",trader,c);





    }


}

