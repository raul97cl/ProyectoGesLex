package map;
// Generated 26-may-2020 18:05:19 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private String dni;
     private String nombre;
     private String apellidos;
     private Date fechaNacimiento;
     private String sexo;
     private String situacionFamiliar;
     private String situacionLaboral;
     private Set expedientes = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String dni, String nombre, String apellidos, Date fechaNacimiento, String sexo, String situacionFamiliar, String situacionLaboral) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.situacionFamiliar = situacionFamiliar;
        this.situacionLaboral = situacionLaboral;
    }
    public Cliente(String dni, String nombre, String apellidos, Date fechaNacimiento, String sexo, String situacionFamiliar, String situacionLaboral, Set expedientes) {
       this.dni = dni;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.fechaNacimiento = fechaNacimiento;
       this.sexo = sexo;
       this.situacionFamiliar = situacionFamiliar;
       this.situacionLaboral = situacionLaboral;
       this.expedientes = expedientes;
    }
   
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSituacionFamiliar() {
        return this.situacionFamiliar;
    }
    
    public void setSituacionFamiliar(String situacionFamiliar) {
        this.situacionFamiliar = situacionFamiliar;
    }
    public String getSituacionLaboral() {
        return this.situacionLaboral;
    }
    
    public void setSituacionLaboral(String situacionLaboral) {
        this.situacionLaboral = situacionLaboral;
    }
    public Set getExpedientes() {
        return this.expedientes;
    }
    
    public void setExpedientes(Set expedientes) {
        this.expedientes = expedientes;
    }

    @Override
    public String toString() {
        return dni;
    }
}


