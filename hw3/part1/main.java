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



       company.getBranch().get(0).getBranchEmployee().get(0).enterShipmentInformation(officeChairModel.MODEL1,officeChairColor.color1);
       company.getBranch().get(0).getBranchEmployee().get(0).enterShipmentInformation(officeDeskModel.MODEL2,officeDeskColor.color2);
       company.getBranch().get(0).getBranchEmployee().get(1).enterShipmentInformation(meetableModel.MODEL1,meetableColor.color4);
       company.getBranch().get(0).getBranchEmployee().get(1).enterShipmentInformation(bookcaseModel.MODEL1);

       company.getBranch().get(1).getBranchEmployee().get(0).enterShipmentInformation(officeChairModel.MODEL1,officeChairColor.color1);
       company.getBranch().get(1).getBranchEmployee().get(0).enterShipmentInformation(officeDeskModel.MODEL2,officeDeskColor.color2);
        company.getBranch().get(1).getBranchEmployee().get(0).enterShipmentInformation(meetableModel.MODEL1,meetableColor.color4);
        company.getBranch().get(1).getBranchEmployee().get(0).enterShipmentInformation(bookcaseModel.MODEL1);

        company.getBranch().get(2).getBranchEmployee().get(0).enterShipmentInformation(officeChairModel.MODEL1,officeChairColor.color1);
        company.getBranch().get(2).getBranchEmployee().get(0).enterShipmentInformation(officeDeskModel.MODEL2,officeDeskColor.color2);
        company.getBranch().get(2).getBranchEmployee().get(1).enterShipmentInformation(meetableModel.MODEL1,meetableColor.color4);
        company.getBranch().get(2).getBranchEmployee().get(1).enterShipmentInformation(bookcaseModel.MODEL1);

        company.getBranch().get(3).getBranchEmployee().get(0).enterShipmentInformation(officeChairModel.MODEL1,officeChairColor.color1);
        company.getBranch().get(3).getBranchEmployee().get(0).enterShipmentInformation(officeDeskModel.MODEL2,officeDeskColor.color2);
        company.getBranch().get(3).getBranchEmployee().get(1).enterShipmentInformation(meetableModel.MODEL1,meetableColor.color4);
        company.getBranch().get(3).getBranchEmployee().get(1).enterShipmentInformation(bookcaseModel.MODEL1);





        company.getBranch().get(0).getBranchEmployee().get(0).addUser("orkun","arslan","roa@gmail.com",5858552);
        company.getBranch().get(0).getBranchEmployee().get(0).addUser("refik","arslan","roa_05@gmail.com",525254);
        company.getBranch().get(2).getBranchEmployee().get(1).addUser("re","arsn","r_05@gmail.com",528254);

        company.login("roa@gmail.com",5858552).searchProduct(company.getBranch(),officeChairModel.MODEL1,officeChairColor.color1);


        company.login("roa@gmail.com",5858552).buy(company.getBranch(),"Adres",5355555,officeChairModel.MODEL1,officeChairColor.color1 );








    }
}
