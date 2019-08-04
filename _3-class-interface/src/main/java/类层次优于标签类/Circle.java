package 类层次优于标签类;

public class Circle extends FigureType {
    final double radius;
    Circle(double radius){
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius;
    }
}
