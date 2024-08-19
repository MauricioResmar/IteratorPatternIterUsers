public interface UsuarioIterator {

    //Obtiene el siguiente y devuelve un elemento de la Clase Usuario
    Usuario next();

    //Reinicia el contador
    void reset();

    // Hay más usuarios en el iterador
    boolean hasMore();
}
