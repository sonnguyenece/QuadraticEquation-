public class QuadraticEquation {
    private float a,b,c;

    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float getA(){
        return this.a;
    }
    public float getB(){
        return this.a;
    }
    public float getC(){
        return this.a;
    }
    public float getDiscriminant(){
        return this.b*this.b - 4*this.a*this.c;
    }
    public double getRoot1(){
        return (-this.b+Math.sqrt(this.b*this.b-4*this.a*this.c))/(2*a);
    }
    public double getRoot2(){
        return (-this.b-Math.sqrt(this.b*this.b-4*this.a*this.c))/(2*a);
    }
}
