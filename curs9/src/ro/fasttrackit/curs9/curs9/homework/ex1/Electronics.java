package ro.fasttrackit.curs9.curs9.homework.ex1;

public class Electronics extends Product {


    private String type;
    private int length;
    private int width;
    private int height;
    private int wheight;

    public Electronics(){

    }
    public Electronics(String type){
        this.type=type;
    }
    public Electronics(int length, int width){
        this.length=length;
        this.width=width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWheight() {
        return wheight;
    }

    public void setWheight(int wheight) {
        this.wheight = wheight;
    }
}
