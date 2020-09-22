package TugasPraktikum3No1;

public class Rectangle {
    private float width;
    private float length;
    public float area;
    public float perimeter;

    public Rectangle(){
        width=1.0f;
        length=1.0f;
    }
    public Rectangle(float width, float length){
        this.width=width;
        this.length=length;
    }

    public void setWidth(float width){
        this.width=width;
    }
    public void setLength(float length){
        this.length=length;
    }
    public float getWidth(){
        return width;
    }
    public float getLength(){
        return length;
    }

    public void countArea(){
        area = width * length;
    }
    public void countPerimeter(){
        perimeter = 2*width + 2*length;
    }

    public String toString(){ 
        return "Rectangle [length = " + length + ", width = " + width + "]";
    }
}
