package map;
// Generated 22-may-2020 18:32:02 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Incidente generated by hbm2java
 */
public class Incidente  implements java.io.Serializable {


     private int codigoExpediente;
     private Expediente expediente;
     private Date fechaHora;
     private String lugar;
     private String defensa;
     private String parte;
     private String enviadoPor;
     private String fallecidos;

    public Incidente() {
    }

	
    public Incidente(Expediente expediente, Date fechaHora, String lugar, String parte, String enviadoPor, String fallecidos) {
        this.expediente = expediente;
        this.fechaHora = fechaHora;
        this.lugar = lugar;
        this.parte = parte;
        this.enviadoPor = enviadoPor;
        this.fallecidos = fallecidos;
    }
    public Incidente(Expediente expediente, Date fechaHora, String lugar, String defensa, String parte, String enviadoPor, String fallecidos) {
       this.expediente = expediente;
       this.fechaHora = fechaHora;
       this.lugar = lugar;
       this.defensa = defensa;
       this.parte = parte;
       this.enviadoPor = enviadoPor;
       this.fallecidos = fallecidos;
    }
   
    public int getCodigoExpediente() {
        return this.codigoExpediente;
    }
    
    public void setCodigoExpediente(int codigoExpediente) {
        this.codigoExpediente = codigoExpediente;
    }
    public Expediente getExpediente() {
        return this.expediente;
    }
    
    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }
    public Date getFechaHora() {
        return this.fechaHora;
    }
    
    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    public String getLugar() {
        return this.lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getDefensa() {
        return this.defensa;
    }
    
    public void setDefensa(String defensa) {
        this.defensa = defensa;
    }
    public String getParte() {
        return this.parte;
    }
    
    public void setParte(String parte) {
        this.parte = parte;
    }
    public String getEnviadoPor() {
        return this.enviadoPor;
    }
    
    public void setEnviadoPor(String enviadoPor) {
        this.enviadoPor = enviadoPor;
    }
    public String getFallecidos() {
        return this.fallecidos;
    }
    
    public void setFallecidos(String fallecidos) {
        this.fallecidos = fallecidos;
    }




}


