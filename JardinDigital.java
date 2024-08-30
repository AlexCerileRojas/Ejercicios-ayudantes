public class JardinDigital {

    // parametro planta = nombre de la planta
    // parametro requiere agua = determina si la planta requiere agua o no

    public void regarPlanta(String planta, boolean requiereAgua) {
        if (requiereAgua) {
            System.out.println("Regando planta  " + planta);

        } else{
            System.out.println("la planta " + planta + " no necesita agua en este momento");
        }
    }
    public static void main(String[] args) {
        JardinDigital jardin = new JardinDigital();
        // definir nombres de plantas y su estado de riego
        String planta1 = "Myosotis";
        boolean requiereAgua1 = true;

        String planta2 = "Cactus";
        boolean requiereAgua2 = false;

        // llamamos al metodo
        jardin.regarPlanta(planta1, requiereAgua1);
        jardin.regarPlanta(planta2, requiereAgua2);
    }
}
