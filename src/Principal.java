package src;
public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();

    }

    Contador cont = new Contador(30);
    Contador cont1 = cont;
    Cuadrado cuadrado = new Cuadrado(50);
    Cuadrado cuadrado1 = cuadrado;
    Circulo circulo = new Circulo(10);
    Circulo circulo1 = circulo;
    Rectangulo rec = new Rectangulo(20, 30);
    Rectangulo rec1 = rec;
    Libro libro = new Libro("Soñar es gratis");
    Libro libro1 = libro;
    Fraccion frac = new Fraccion(1, 2, 1, 5);
    Fraccion frac1 = frac;

    public Principal() {
        System.out.println("El valor del contador es: " + cont.getContador());
        cont1.setContador(50);
        System.out.println("El nuevo valor del contador es " + cont.getContador());
        System.out.println("El lado del cuadrado es " + cuadrado.getLado());
        cuadrado1.setLado(7);
        System.out.println("El nuevo lado del cuadrado es " + cuadrado.getLado());
        System.out.println("El radio del circulo es " + circulo.getRadio());
        circulo1.setRadio(7.5);
        System.out.println("El nuevo radio del circulo es " + circulo.getRadio());
        System.out.println("El ancho y largo del rectagulo son " + rec.getAncho() + " y " + rec.getAltura());
        rec1.setAncho(8);
        rec1.setAltura(12);
        System.out.println("El nuevo ancho y largo del rectangulo son " + rec.getAncho() + " y " + rec.getAltura());
        System.out.println("El titulo del libro es " + libro.getLibro());
        libro1.setLibro("Soñar no cuesta nada");
        System.out.println("El nuevo titulo del libro es " + libro.getLibro());
        System.out.println("La primer fraccion es " + frac.getNumerador1() + "/" + frac.getDenominador1());
        System.out.println("La segunda  fraccion es " + frac.getNumerador2() + "/" + frac.getDenominador2());
        frac1.setResultado("No hay operacion disponible");
        frac1.setNumerador1(10);
        frac1.setDenominador2(5);
        System.out.println("La nueva primer fraccion es " + frac.getNumerador1() + "/" + frac.getDenominador1());
        System.out.println("La nueva segunda  fraccion es " + frac.getNumerador2() + "/" + frac.getDenominador2());
        System.out.println("El resultado editado es " + frac.getResultado());

    }

}
