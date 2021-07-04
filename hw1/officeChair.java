public class officeChair {
    private officeChairModel officeChairModel;
    private officeChairColor officeChairColor;
    public officeChair(officeChairModel officeChairModel,officeChairColor officeChairColor)
    {
        this.officeChairColor=officeChairColor;
        this.officeChairModel=officeChairModel;

    }
    public void clear()
    {
        this.officeChairColor=null;
        this.officeChairModel=null;

    }


    public officeChairColor getOfficeChairColor() {
        return officeChairColor;
    }

    public void setOfficeChairColor(officeChairColor officeChairColor) {
        this.officeChairColor = officeChairColor;
    }

    public officeChairModel getOfficeChairModel() {
        return officeChairModel;
    }

    public void setOfficeChairModel(officeChairModel officeChairModel) {
        this.officeChairModel = officeChairModel;
    }
}
