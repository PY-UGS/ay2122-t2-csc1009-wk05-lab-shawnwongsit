public class Triangle extends Shape{
    public Triangle(int dim1, int dim2){
        super(dim1, dim2);
    }

    public String type(){
        return "Inside Area for Triangle.";
    }

    public double area(){
        return 0.5 * getDim1() * getDim2();
    }
}
