import java.util.ArrayList;

public class Cancion {

    private String ID;
    private String nombre;
    private double duracion;
    private ArrayList<Usuario> likes;

    public Cancion(String id, String n, double d){
        setID(id);
        setNombre(n);
        setDuracion(d);
        this.likes = new ArrayList<Usuario>();
    }

    public String getID() {
        return ID;
    }

    private void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    private void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public  boolean buscarFanExiste(Usuario u){

        int i = 0;
        Usuario encontrado = null;
        Usuario buscado;
        boolean loEncontro = false;

        while(i < this.likes.size()-1 && encontrado == null){
            buscado = this.likes.get(i);

            if(buscado == u){
                encontrado = buscado;
                loEncontro = true;
            }

            i++;
        }

        return loEncontro;
    }

    public boolean borrarFan(Usuario u){

        boolean pudo = false;

        if(this.likes.remove(u)){
            pudo = true;
        }
        return pudo;
    }
}
