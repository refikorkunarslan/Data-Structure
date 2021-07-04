public class officeCabinet {
    private officeCabinetModel officeCabinetModel;

    /**
     *
     * @param officeCabinetModel constructor
     */
    public officeCabinet(officeCabinetModel officeCabinetModel)
    {
        this.officeCabinetModel=officeCabinetModel;

    }

    /**
     *
     * @return get office cabinet model
     */
    public officeCabinetModel getOfficeCabinetModel() {
        return officeCabinetModel;
    }

    /**
     *
     * @param officeCabinetModel set office cabinet model
     */
    public void setOfficeCabinetModel(officeCabinetModel officeCabinetModel) {
        this.officeCabinetModel = officeCabinetModel;
    }
}
