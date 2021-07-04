public class Type {
    private cont<officeChair> officeChair;
   /* private cont<officeDesk> officeDesk;
    private cont<meetingTables> meetingTables;
    private cont<bookcase> bookcase;
    private cont<officeCabinets> officeCabinets;
    */
    public Type()
    {
        officeChair = new cont<>();
    /*    officeDesk = new cont<>();
        meetingTables = new cont<>();
        bookcase = new cont<>();
        officeCabinets = new cont<>();
    */
    }

    public cont<officeChair> getOfficeChair() {
        return officeChair;
    }
}
