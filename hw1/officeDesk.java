public class officeDesk {
    private officeDeskModel officeDeskModel;
    private officeDeskColor officeDeskColor;
    public officeDesk(officeDeskModel officeDeskModel,officeDeskColor officeDeskColor)
    {
        this.officeDeskColor=officeDeskColor;
        this.officeDeskModel=officeDeskModel;

    }

    public officeDeskColor getOfficeDeskColor() {
        return officeDeskColor;
    }

    public void setofficeDeskColor(officeDeskColor officeDeskColor) {
        this.officeDeskColor = officeDeskColor;
    }

    public officeDeskModel getofficeDeskModel() {
        return officeDeskModel;
    }

    public void setofficeDeskModel(officeDeskModel officeDeskModel) {
        this.officeDeskModel = officeDeskModel;
    }
}
