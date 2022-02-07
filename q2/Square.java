public class Square extends Shape{
    public Square(int dim1, int dim2){
        super(dim1, dim2);
    }

    public String type(){
        return "Inside Area for Square.";
    }
    
    public double area(){
        return getDim1() * getDim2();
    }
}
