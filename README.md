# ORTify responde al enunciado:

La famosa aplicación de música online “ORTify” cuenta con un registro de artistas, de los cuales se conoce su ID, su nombre y su listado de canciones. De cada canción se conoce su ID, nombre y duración en segundos. La aplicación cuenta además con un listado de usuarios, de los que se sabe su nombre de usuario (unívoco) y su estado (habilitado, prueba gratis o suspendido). Cada canción contiene un listado con los usuarios que le dieron ‘like’ a esa canción.

Basado en el enunciado descripto, realizá:

A) El diagrama de clases que lo modelice, con sus relaciones, atributos y métodos.

B) La explotación del método mostrarDuracionPromedio que permita mostrar el promedio en minutos y segundos que duran las canciones de un artista. (Ejemplo: "3 minutos, 24 segundos", no "204 segundos").

C) La explotación del método esFanDestacado de la clase Artista que recibe como parámetro la instancia de un usuario y se devuelve si se trata de un fan destacado o no, según si el usuario ha dado ‘like’ en al menos la mitad de las canciones del artista.

D) La explotación del método primeras5Canciones que devuelva una lista con las primeras 5 canciones de un artista. Si no llega a tener 5, devolver las que tenga, siempre en una nueva lista.

E) La explotación del método borrarUsuario que reciba un nombre de usuario y lo elimine tanto de la lista de usuarios de la aplicación como en todas las canciones en donde haya dado ‘like’. El método retorna la instancia, si se logró borrar, o null en caso contrario.
