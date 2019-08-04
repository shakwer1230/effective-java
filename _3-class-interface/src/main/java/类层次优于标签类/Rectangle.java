package 类层次优于标签类;

public class Rectangle extends FigureType {
    final double length;
    final  double width;

    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    @Override
    double area() {
        return length*width;
    }
}
