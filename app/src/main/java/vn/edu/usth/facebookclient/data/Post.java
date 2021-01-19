package vn.edu.usth.facebookclient.data;

public class Post {
    public Post(){}

    private int PostID;
    private String PostCaption;

    public Post(int id, String caption){
        this.PostID = id;
        this.PostCaption = caption;
    }

    public void SetID(int id){
        this.PostID = id;
    }
    public int getID(){
        return this.PostID;
    }

    public void SetCaption(String caption){
        this.PostCaption = caption;
    }
    public String getCaption(){
        return this.PostCaption;
    }
}
