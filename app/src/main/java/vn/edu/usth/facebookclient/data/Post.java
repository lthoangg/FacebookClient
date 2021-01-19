package vn.edu.usth.facebookclient.data;

public class Post {
    public Post(){}

    private String PostCaption;

    public Post(String caption){
        this.PostCaption = caption;
    }
    public String getCaption(){
        return this.PostCaption;
    }
}
