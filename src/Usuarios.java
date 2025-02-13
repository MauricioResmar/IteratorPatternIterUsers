import java.util.ArrayList;

public class Usuarios implements UsuarioIterator {

    private ArrayList<Usuario> usuarios = new ArrayList();
    private int posicion = 0;
    public void crear(Usuario usuario){
        usuarios.add(usuario);
    }
    @Override
    public Usuario next() {
        Usuario usuario = usuarios.get(posicion);
        posicion = posicion + 1;
        return usuario;
    }

    @Override
    public void reset() {
        posicion = 0;
    }

    @Override
    public boolean hasMore() {
        return posicion < usuarios.size();
    }
}
