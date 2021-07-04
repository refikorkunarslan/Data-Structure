public class meetable {
    private meetableModel meetableModel;
    private meetableColor meetableColor;

    /**
     *
     * @param meetableModel constructor model
     * @param meetableColor constrıctor color
     */
    public meetable(meetableModel meetableModel,meetableColor meetableColor)
    {
        this.meetableColor=meetableColor;
        this.meetableModel=meetableModel;

    }

    /**
     *
     * @return get Meetable Color
     */
    public meetableColor getMeetableColor() {
        return meetableColor;
    }

    /**
     *
     * @param meetableColor set
     */
    public void setmeetableColor(meetableColor meetableColor) {
        this.meetableColor = meetableColor;
    }

    /**
     *
     * @return get meet table model
     */
    public meetableModel getmeetableModel() {
        return meetableModel;
    }

    /**
     *
     * @param meetableModel set
     */
    public void setmeetableModel(meetableModel meetableModel) {
        this.meetableModel = meetableModel;
    }
}
