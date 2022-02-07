public class Rectangle extends Shape {
    public Rectangle(int dim1, int dim2){
        super(dim1, dim2);
    }

    public String type(){
        return "Inside Area for Rectangle.";
    }

    public double area(){
        return getDim1() * getDim2();
    }
}
