public class Circle extends Shape{
    public Circle(int dim1, int dim2){
        super(dim1, dim2);
    }

    public String type(){
        return "Inside Area for Circle.";
    }

    public double area(){
        return getPI() * getDim1() * getDim2();
    }
}
