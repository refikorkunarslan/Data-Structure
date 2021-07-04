public class main {

    public static void main(String[] args) {
       Company company=new Company();
       administrator admin=new administrator(company);
       company.setAdministrator(admin);
       company.getAdministrator().addBranch(0);
       company.getAdministrator().addBranch(1);
       company.getAdministrator().addBranch(2);
       company.getAdministrator().addBranch(3);

       company.getAdministrator().addBranchEmployee(0);
       company.getAdministrator().addBranchEmployee(0);
       company.getAdministrator().addBranchEmployee(1);
        company.getAdministrator().addBranchEmployee(2);
        company.getAdministrator().addBranchEmployee(2);
        company.getAdministrator().addBranchEmployee(2);
        company.getAdministrator().addBranchEmployee(3);
        company.getAdministrator().addBranchEmployee(3);



       company.getBranch().at(0).getBranchEmployee().at(0).enterShipmentInformation(officeChairModel.MODEL1,officeChairColor.color1);
       company.getBranch().at(0).getBranchEmployee().at(0).enterShipmentInformation(officeDeskModel.MODEL2,officeDeskColor.color2);
       company.getBranch().at(0).getBranchEmployee().at(1).enterShipmentInformation(meetableModel.MODEL1,meetableColor.color4);
       company.getBranch().at(0).getBranchEmployee().at(1).enterShipmentInformation(bookcaseModel.MODEL1);

        company.getBranch().at(1).getBranchEmployee().at(0).enterShipmentInformation(officeChairModel.MODEL1,officeChairColor.color1);
        company.getBranch().at(1).getBranchEmployee().at(0).enterShipmentInformation(officeDeskModel.MODEL2,officeDeskColor.color2);
        company.getBranch().at(1).getBranchEmployee().at(0).enterShipmentInformation(meetableModel.MODEL1,meetableColor.color4);
        company.getBranch().at(1).getBranchEmployee().at(0).enterShipmentInformation(bookcaseModel.MODEL1);

        company.getBranch().at(2).getBranchEmployee().at(0).enterShipmentInformation(officeChairModel.MODEL1,officeChairColor.color1);
        company.getBranch().at(2).getBranchEmployee().at(0).enterShipmentInformation(officeDeskModel.MODEL2,officeDeskColor.color2);
        company.getBranch().at(2).getBranchEmployee().at(1).enterShipmentInformation(meetableModel.MODEL1,meetableColor.color4);
        company.getBranch().at(2).getBranchEmployee().at(1).enterShipmentInformation(bookcaseModel.MODEL1);

        company.getBranch().at(3).getBranchEmployee().at(0).enterShipmentInformation(officeChairModel.MODEL1,officeChairColor.color1);
        company.getBranch().at(3).getBranchEmployee().at(0).enterShipmentInformation(officeDeskModel.MODEL2,officeDeskColor.color2);
        company.getBranch().at(3).getBranchEmployee().at(1).enterShipmentInformation(meetableModel.MODEL1,meetableColor.color4);
        company.getBranch().at(3).getBranchEmployee().at(1).enterShipmentInformation(bookcaseModel.MODEL1);





        company.getBranch().at(0).getBranchEmployee().at(0).addUser("orkun","arslan","roa@gmail.com",5858552);
        company.getBranch().at(0).getBranchEmployee().at(0).addUser("refik","arslan","roa_05@gmail.com",525254);

        company.getCustomer().at(0).searchProduct(company.getBranch(),officeChairModel.MODEL1,officeChairColor.color1);


        company.getCustomer().at(0).buy(company.getBranch(),"Adres",5355555,officeChairModel.MODEL1,officeChairColor.color1 );








    }
}
