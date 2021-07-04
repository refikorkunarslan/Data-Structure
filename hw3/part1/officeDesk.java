public class officeDesk {
    private officeDeskModel officeDeskModel;
    private officeDeskColor officeDeskColor;

    /**
     *
     * @param officeDeskModel constructor
     * @param officeDeskColor constructor
     */
    public officeDesk(officeDeskModel officeDeskModel,officeDeskColor officeDeskColor)
    {
        this.officeDeskColor=officeDeskColor;
        this.officeDeskModel=officeDeskModel;

    }

    /**
     *
     * @return get color
     */
    public officeDeskColor getOfficeDeskColor() {
        return officeDeskColor;
    }

    /**
     *
     * @param officeDeskColor set color
     */
    public void setofficeDeskColor(officeDeskColor officeDeskColor) {
        this.officeDeskColor = officeDeskColor;
    }

    /**
     *
     * @return get model
     */
    public officeDeskModel getofficeDeskModel() {
        return officeDeskModel;
    }

    /**
     *
     * @param officeDeskModel set model
     */
    public void setofficeDeskModel(officeDeskModel officeDeskModel) {
        this.officeDeskModel = officeDeskModel;
    }
}
