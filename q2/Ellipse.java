public class Ellipse extends Shape{
    public Ellipse(int dim1, int dim2){
        super(dim1, dim2);
    }

    public String type(){
        return "Inside Area for Ellipse.";
    }

    public double area(){
        return getPI() * getDim1() * getDim2();
    }
}
