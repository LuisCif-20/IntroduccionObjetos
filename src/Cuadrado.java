public class Cuadrado {
    //Atributos
    private int lado;

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(30);
        cuadrado.calcularPerimetro();
        cuadrado.calcularArea();
    }

    public Cuadrado(int lado){
        this.lado = lado;
    }

    public void calcularPerimetro(){
        int perimetro = 4*lado;
        System.out.println("El perimetro es: " + perimetro);
    }

    public void calcularArea(){
        int area = lado*lado;
        System.out.println("El area es: " + area);
    }
}
