/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluqueria_can.logic;

import java.util.List;
import peluqueria_can.persistencia.ConstroladoraPersistencia;


public class Controlador {
    
    //9- Evidentemente tenemos que instanciar la capa de Controladora de persistencia 
    ConstroladoraPersistencia controlPersi = new ConstroladoraPersistencia();

    //5-Recibe los datos de la interfaz gráfica 
    public void guardar(String nombre, String raza, String dueno, String celDueno, String observaciones, String alergico, String atencion) {
      
    
    //6 - Vamos a Crear el dueño asignamos los valores    
    Dueno duenio=new Dueno();
    duenio.setNombre(dueno);
    duenio.setCelDueno(celDueno);
    
     
    //7- Vamos a Creamos la mascota y le damos los valores
    Mascota masco = new Mascota();
    masco.setNombre(nombre);
    masco.setRaza(raza);
    masco.setAlergico(alergico);
    masco.setAtencion_especial(atencion);
    masco.setObservaciones(observaciones);
    masco.setUnDueno(duenio);
    
    
    //8- Vamos a llamar a la persistencia para que lo guarde en la BD
    //(La capa logica no guarda nada se lava las manos xD )
    controlPersi.guardar(duenio,masco);
    
  
    }    

    public List<Mascota> traerMascotas() {
       return controlPersi.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersi.borrarMascotas(num_cliente);
    }

    public Mascota traerMascotas(int num_cliente) {
        return controlPersi.traerMascotas(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombre, String raza, String dueno, String celDueno, String observaciones, String alergico, String atencion) {
        masco.setNombre(nombre);
        masco.setRaza(raza);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atencion);
        
        
        //modifico la mascota
        controlPersi.modificarMascota(masco);
        Dueno duenos=this.buscarDueno(masco.getUnDueno().getId_Dueno());
        duenos.setCelDueno(celDueno);
        duenos.setNombre(nombre);
        
        //Llamar al modificar Dueño
        this.modificarDuenio(duenos);
        
    }

    private Dueno buscarDueno(int Id_Dueno) {
        return controlPersi.traerDueno(Id_Dueno);
    }

    private void modificarDuenio(Dueno duenos) {
        controlPersi.modificarDuenio(duenos);
    }

}
