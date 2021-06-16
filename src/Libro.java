public class Libro {

    private String libro = "El Principito";
    private boolean prestado = false;

    //public static void main(String[] args) {
        //Libro libro = new Libro();
        //System.out.println("Constructor por defecto");
        //System.out.println("El libro es: " + libro.getLibro() );
        //libro.prestarLibro();
        //if (libro.isPrestado()) {
            //System.out.println("El libro fue prestado");
        //}
        //libro.devolverLibro();
        //if (!libro.isPrestado()) {
            //System.out.println("El libro fue devuelto");
        //}
        //System.out.println("\nContructor con parametros");
        //Libro libro1 = new Libro();
        //System.out.println("Constructor por defecto");
        //System.out.println("El libro es: " + libro1.getLibro() );
        //libro1.prestarLibro();
        //if (libro1.isPrestado()) {
            //System.out.println("El libro fue prestado");
       // }
        //libro1.devolverLibro();
        //if (!libro1.isPrestado()) {
        //    System.out.println("El libro fue devuelto");
        //}
    //}

    public Libro() {

    }

    public Libro(String libro) {
        this.libro = libro;
    }

    public void prestarLibro() {
        prestado = true;
    }

    public void devolverLibro() {
        prestado = false;
    }

    public String getLibro() {
        return libro;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

}
