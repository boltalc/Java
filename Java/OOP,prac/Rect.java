public class Rect{

    private double width;
    private double height;

    public Rect(){
	this(25.0, 50.0);
    }

    public Rect(double width, double height){
	this.width = width;
	this.height = height;
    }

    public double getArea(){
	return this.width * this.height;
    }

    public double getPerimeter(){
	return (this.width * 2) + (this.height * 2);
    }

    public double getWidth(){
	return width;
    }

    public double setWidth(double width){
	this.width = width;
    }

    public double getHeight(){
	return height;
    }

    public double setHeight(double height){
	this.height = width;
    }
}
