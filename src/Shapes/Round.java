package Shapes;

public class Round extends Shape {
    private Double radius;
    private Double diameter;
    private Double length;


    public Double getRadius(){
        return radius;
    }
    public void setRadius(Double radius){
        this.radius = radius;
    }

    public Round(Double radius) {
        this.radius = radius;
        this.diameter = radius * 2;
        this.length = 2 * 3.14 * radius;
    }
    public Double calculateArea(){
        this.area = 3.14 * (this.radius * this.radius);
        return this.area;
    }
    public Double perimeter(){
        this.perimeter = this.length;
        return this.perimeter;
    }
}
