package map;
// Generated 30-abr-2020 16:47:02 by Hibernate Tools 4.3.1



/**
 * HojaEncargo generated by hbm2java
 */
public class HojaEncargo  implements java.io.Serializable {


     private int codExpediente;
     private Expediente expediente;
     private byte[] hoja;

    public HojaEncargo() {
    }

    public HojaEncargo(Expediente expediente, byte[] hoja) {
       this.expediente = expediente;
       this.hoja = hoja;
    }
   
    public int getCodExpediente() {
        return this.codExpediente;
    }
    
    public void setCodExpediente(int codExpediente) {
        this.codExpediente = codExpediente;
    }
    public Expediente getExpediente() {
        return this.expediente;
    }
    
    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }
    public byte[] getHoja() {
        return this.hoja;
    }
    
    public void setHoja(byte[] hoja) {
        this.hoja = hoja;
    }




}


