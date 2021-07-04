public class bookcase {
    private bookcaseModel bookcaseModel;

    /**
     *  constructor
     * @param bookcaseModel whic model
     */
    public bookcase(bookcaseModel bookcaseModel)
    {
        this.bookcaseModel=bookcaseModel;

    }

    /**
     *
     * @return get model
     */
    public bookcaseModel getBookcaseModel() {
        return bookcaseModel;
    }

    /**
     *
     * @param bookcaseModel set model
     */
    public void setBookcaseModel(bookcaseModel bookcaseModel) {
        this.bookcaseModel = bookcaseModel;
    }
}
