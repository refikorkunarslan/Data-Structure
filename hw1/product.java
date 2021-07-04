public class product {
    private cont<officeChair> officeChair;
    Type type;
    /* private cont<officeDesk> officeDesk;
     private cont<meetingTables> meetingTables;
     private cont<bookcase> bookcase;
     private cont<officeCabinets> officeCabinets;
     */
    public product(Type type)
    {
        officeChair = new cont<>();
    /*    this.officeChair=officeChair;
        meetingTables = new cont<>();
        bookcase = new cont<>();
        officeCabinets = new cont<>();
    */
    }

    public cont<officeChair> getOfficeChair() {
        return officeChair;
    }
    /*
    private Type type;

    public product(Type type)
    {
        this.type=type;

    }

    public Type getType() {
        return type;
    }

     */
}
