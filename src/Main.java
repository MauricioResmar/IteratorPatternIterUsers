public class Main {
    public static void main(String[] args) {

        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("uno", 5));
        usuarios.crear(new Usuario("dos", 25));
        usuarios.crear(new Usuario("tres", 10));
        usuarios.crear(new Usuario("cuatro", 8));
        usuarios.crear(new Usuario("cinco", 12));


    while (usuarios.hasMore()){
        Usuario usuario = usuarios.next();
        System.out.println("Usuario es: " + usuario.getNombre() + " Y su edad es: " + usuario.getEdad());
        }

    usuarios.crear(new Usuario("seis", 18));
    Usuario usuario = usuarios.next();
    System.out.println("Usuario es: " + usuario.getNombre() + " Y su edad es: " + usuario.getEdad());

    usuarios.reset();
    while (usuarios.hasMore()){
         usuario = usuarios.next();
         System.out.println("Usuario es: " + usuario.getNombre() + " Y su edad es: " + usuario.getEdad());
        }
    }
}