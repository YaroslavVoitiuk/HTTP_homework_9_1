package ru.netology;

public class CatsData {

    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes;

//    public CatsData(String id, String text, String type, String user, Integer upvotes) {
//        this.id = id;
//        this.text = text;
//        this.type = type;
//        this.user = user;
//        this.upvotes = upvotes;
//    }

    public CatsData() {
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "CatsData{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes='" + upvotes + '\'' +
                '}';
    }
}
