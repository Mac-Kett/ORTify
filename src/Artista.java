import java.util.ArrayList;

public class Artista {

    private String ID;
    private String nombre;
    private ArrayList<Cancion> canciones;

    public Artista(String id, String n){
        setID(id);
        setNombre(n);
        this.canciones = new ArrayList<Cancion>();
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

    public void mostrarDuracionPromedio(){
        double duracion;
        double contadorSegundos = 0;
        double minutos;
        double segundos;

        for(Cancion c: this.canciones){
            duracion = c.getDuracion();
            contadorSegundos = contadorSegundos + duracion;
        }

        minutos = contadorSegundos % 60;
        segundos = contadorSegundos / 60;


        System.out.println("Los mimnutos fueron: " + minutos + " y los segundos: " + segundos);
    }

    public boolean esFanDestacado(Usuario u){
        int contador = 0;
        boolean destacado = false;

        for(Cancion c: this.canciones){
            if(c.buscarFanExiste(u)){
                contador++;
            }
        }

        if(contador >= this.canciones.size()-1 / 2){
            destacado = true;
        }

        return destacado;
    }

    public  ArrayList<Cancion> primeras5canciones(){
        ArrayList<Cancion> aux = new ArrayList<Cancion>();
        int i;

        for(i = 0; i = 4; i++){
            if(this.canciones.get(i) != null) {
                aux.add(this.canciones.get(i));
            }
        }

        return aux;
    }

    public void borrarUsuario(Usuario u){
        for(Cancion c: this.canciones){
            if(buscarUsuarioExiste(u)) {
                c.borrarFan(u);
            }
        }
    }

    private boolean buscarUsuarioExiste(Usuario u){

        int i = 0;
        Cancion encontrado = null;
        Cancion aux;
        boolean loEncontro = false;

        while (i < this.canciones.size()-1 && encontrado == null) {
            aux = this.canciones.get(i);

            if(aux == u){
                aux = encontrado;
                loEncontro = true;
            }
        }
        return loEncontro;
        }
    }
}
