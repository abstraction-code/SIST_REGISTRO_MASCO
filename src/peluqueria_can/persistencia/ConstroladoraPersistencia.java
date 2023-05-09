//CONTROLADORA DE LA PERSISTENCIA 

package peluqueria_can.persistencia;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.List;
import peluqueria_can.logic.Dueno;
import peluqueria_can.logic.Mascota;
import peluqueria_can.persistencia.exceptions.NonexistentEntityException;


public class ConstroladoraPersistencia {
    
    
    //11- A través de su instancia de los JPA controler que ya tiene los metodos
    //de alta baja , modificación y lectura de BD crea el dueño(12) y la mascota(13)
    
    DuenoJpaController duenoJpa = new DuenoJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController ();

    
    //10- Esta capa recibe los objetos de dueño y mascota
    public void guardar(Dueno duenio, Mascota masco) {
        
    
    //12- Crear en la BD el dueño
    
    duenoJpa.create(duenio);
    
  
    //13- Crear en la BD la mascota
    
    mascoJpa.create(masco);
    
    }

    public List<Mascota> traerMascotas() {
        //Busca todos los registros y asigna lo que hay que hacer
        return mascoJpa.findMascotaEntities();
    }

    public void borrarMascotas(int num_cliente) {
        try {
            mascoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            java.util.logging.Logger.getLogger(ConstroladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

    //Metodo traer Mascota
    public Mascota traerMascotas(int num_cliente) {
       return mascoJpa .findMascota(num_cliente);
    }

    
    //Metodo modificar mascotas
    public void modificarMascota(Mascota masco) {
        try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ConstroladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    
    
    //Metodo traer dueño
    public Dueno traerDueno(int Id_Dueno) {
        return duenoJpa.findDueno(Id_Dueno);
    }

    
    //Metodo Modificar Dueño / Lo encapsula en un Catch
    public void modificarDuenio(Dueno duenos) {
        try {
            duenoJpa.edit(duenos);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ConstroladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
   
}
