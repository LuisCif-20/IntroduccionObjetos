package src;
public class Cuadrado {
    //Atributos
    private int lado;
    private int perimetro;
    private int area;

    //public static void main(String[] args) {
    //    Cuadrado cuadrado = new Cuadrado(30);
    //    cuadrado.calcularArea();
    //}

    public Cuadrado(int lado){
        this.lado = lado;
    }

    public void calcularPerimetro(){
        perimetro = 4*lado;
        System.out.println("El perimetro es: " + perimetro);
    }

    public void calcularArea(){
        area = lado*lado;
        System.out.println("El area es: " + area);
    }

    public int getArea() {
        return area;
    }

    public int getLado() {
        return lado;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
