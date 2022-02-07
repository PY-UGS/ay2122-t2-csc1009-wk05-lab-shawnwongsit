public abstract class Shape{
    private int dim1;
    private int dim2;
    private static final double PI = 3.14;
    
    public Shape(int dim1, int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract String type();
    public abstract double area();

    public int getDim1(){
        return this.dim1;
    }

    public int getDim2(){
        return this.dim2;
    }

    public double getPI(){
        return PI;
    }
}