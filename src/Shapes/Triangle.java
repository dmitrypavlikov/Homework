package Shapes;

import Shapes.Shape;

public class Triangle extends Shape {
    private Double height;
    private Double base;
    private Double legL;
    private Double legR;

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
    public Double getLegL() {
        return legL;
    }
    public void setLegL(Double legL) {
        this.legL = legL;
    }
    public Double getLegR() {
        return legR;
    }
    public void setLegR(Double legR) {
        this.legR = legR;
    }

    public Triangle(Double height, Double base, Double legL, Double legR){
        this.height = height;
        this.base = base;
        this.legL = legL;
        this.legR = legR;
    }

    public Double calculateArea(){
        this.area = (this.base * this.height) / 2;
        return this.area;
    }
    public Double perimeter(){
        this.perimeter = this.base + this.legR + this.legL;
        return this.perimeter;
    }

}
