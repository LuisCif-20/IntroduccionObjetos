package src;

public class Circulo {

    private double PI;
    private double radio;
    private double perimetro;
    private double area;

    //public static void main(String[] args) {
    //    Circulo circulo = new Circulo(5);
     //   System.out.println("El radio del circulo es: " + circulo.getRadio());
     //   circulo.calcularPerimetro();
     //   System.out.println("El perimetro del circulo es: " + circulo.getPerimetro());
     //   circulo.calcularArea();
     //   System.out.println("El area del circulo es: " + circulo.getArea());
   // }

    public Circulo(int radio){
        this.radio = radio;
        this.PI = 3.1416;
    }

    public void calcularPerimetro(){
        perimetro = 2*PI*radio;
    }

    public void calcularArea(){
        area = PI*radio*radio;
    }

    public double getArea() {
        return area;
    }

    public double getPI() {
        return PI;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

}
