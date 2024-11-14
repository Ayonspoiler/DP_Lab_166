package Adapter_factory_class;

public class Notification {
    private String id;
    private String content;
    private boolean isRead;

    public Notification(String id, String content) {
        this.id = id;
        this.content = content;
        this.isRead = false;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }
}
