package np.com.pantbinod.springbootfinaldemo.common.enumlist;

public enum  StatusList {
    PUBLISH("PUBLISH"),
    TRASH("TRASH"),
    DRAFTR("DRAFT");

    private String status;

    StatusList(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
