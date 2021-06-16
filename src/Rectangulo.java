package src;
public class Rectangulo {
    
    //Atributos
    private double ancho;
    private double altura;
    private double perimetro;
    private double area;

    //public static void main(String[] args) {
        //Rectangulo rectangulo = new Rectangulo(20, 30);
        //if (rectangulo.verificarIgualdad()) {
        //    System.out.println("Los lados son iguales");
       // } else {
       //     System.out.println("El ancho del rectangulo es: " + rectangulo.getAncho());
       //     System.out.println("El largo del rectangulo es: " + rectangulo.getAltura());
       //     rectangulo.calcularArea();
       //     System.out.println("El area del rectangulo es: " + rectangulo.getArea());
      //      rectangulo.calcularPerimetro();
      //      System.out.println("El perimetro del rectagulo es: " + rectangulo.getPerimetro());
      //  }
   // }

    public Rectangulo(int ancho, int altura){
        this.ancho = ancho;
        this.altura = altura;
    }

    public boolean verificarIgualdad(){
        boolean soniguales = true;
        if (ancho == altura) {
            return soniguales;
        } else {
            soniguales = false;
            return soniguales;
        }
    }

    public void calcularPerimetro(){
        perimetro = 2*altura + 2*ancho;
    }

    public void calcularArea(){
        area = ancho*altura;
    }

    public double getAltura() {
        return altura;
    }
    public double getAncho() {
        return ancho;
    }
    public double getArea() {
        return area;
    }
    public double getPerimetro() {
        return perimetro;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
