public class meetable {
    private meetableModel meetableModel;
    private meetableColor meetableColor;
    public meetable(meetableModel meetableModel,meetableColor meetableColor)
    {
        this.meetableColor=meetableColor;
        this.meetableModel=meetableModel;

    }

    public meetableColor getMeetableColor() {
        return meetableColor;
    }

    public void setmeetableColor(meetableColor meetableColor) {
        this.meetableColor = meetableColor;
    }

    public meetableModel getmeetableModel() {
        return meetableModel;
    }

    public void setmeetableModel(meetableModel meetableModel) {
        this.meetableModel = meetableModel;
    }
}
