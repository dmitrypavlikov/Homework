package Shapes;

public class Parallelogram extends Shape {
    private Double height;
    private Double base;
    private Double leg;

    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getBase() {
        return base;
    }
    public void setBase(Double base) {
        this.base = base;
    }

    public Double getLeg() {
        return leg;
    }
    public void setLeg(Double leg) {
        this.leg = leg;
    }

    public Parallelogram(Double height, Double base, Double leg){
        this.height = height;
        this.base = base;
        this.leg = leg;
    }
    public Double calculateArea(){
        this.area = this.height * this.base;
        return this.area;
    }
    public Double perimeter(){
        this.perimeter = (this.base * 2) + (this.leg * 2);
        return this.perimeter;
    }

}
