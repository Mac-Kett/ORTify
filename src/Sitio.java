import java.util.ArrayList;

public class Sitio {

    private ArrayList<Artista> artistas;
    private ArrayList<Usuario> usuarios;

    public Sitio(){
        this.artistas = new ArrayList<Artista>();
        this.usuarios = new ArrayList<Usuario>();
    }

    public void mostrarDuracionPromedio(Artista a){

        a.mostrarDuracionPromedio();
    }

    public Usuario borrarUsuario(String u){

        Usuario usuario = buscarUsuario(u);
        this.usuarios.remove(usuario);

        for(Artista a: this.artistas){
            a.borrarUsuario(usuario);
        }

        return usuario;
    }

    private Usuario buscarUsuario(String u){

        int i = 0;
        Usuario encontrado = null;
        Usuario aux;

        while(i < this.usuarios.size()-1 && encontrado == null){
            aux = this.usuarios.get(i);

            if(aux.getNombre().equals(u)){
                encontrado = aux;
            }
        }
        return encontrado;
    }
}
