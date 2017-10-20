public class Triangle {

    private int a, b, c;

    //constructs a triangle based on parameters
    public Triangle (int a, int b, int c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }

    public boolean isValid() {

        return a > 0&& b > 0 && c > 0;
    }
}
