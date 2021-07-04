public class officeChair {
    private officeChairModel officeChairModel;
    private officeChairColor officeChairColor;

    /**
     *
     * @param officeChairModel constructor
     * @param officeChairColor constructor
     */
    public officeChair(officeChairModel officeChairModel,officeChairColor officeChairColor)
    {
        this.officeChairColor=officeChairColor;
        this.officeChairModel=officeChairModel;

    }

    /**
     * remove
     */
    public void clear()
    {
        this.officeChairColor=null;
        this.officeChairModel=null;

    }

    /**
     *
     * @return get color
     */
    public officeChairColor getOfficeChairColor() {
        return officeChairColor;
    }

    /**
     *
     * @param officeChairColor set color
     */
    public void setOfficeChairColor(officeChairColor officeChairColor) {
        this.officeChairColor = officeChairColor;
    }

    /**
     *
     * @return get model
     */
    public officeChairModel getOfficeChairModel() {
        return officeChairModel;
    }

    /**
     *
     * @param officeChairModel set model
     */
    public void setOfficeChairModel(officeChairModel officeChairModel) {
        this.officeChairModel = officeChairModel;
    }
}
