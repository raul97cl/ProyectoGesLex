package map;
// Generated 22-may-2020 18:32:02 by Hibernate Tools 4.3.1



/**
 * SentenciaId generated by hbm2java
 */
public class SentenciaId  implements java.io.Serializable {


     private int codExpediente;
     private String titulo;

    public SentenciaId() {
    }

    public SentenciaId(int codExpediente, String titulo) {
       this.codExpediente = codExpediente;
       this.titulo = titulo;
    }
   
    public int getCodExpediente() {
        return this.codExpediente;
    }
    
    public void setCodExpediente(int codExpediente) {
        this.codExpediente = codExpediente;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SentenciaId) ) return false;
		 SentenciaId castOther = ( SentenciaId ) other; 
         
		 return (this.getCodExpediente()==castOther.getCodExpediente())
 && ( (this.getTitulo()==castOther.getTitulo()) || ( this.getTitulo()!=null && castOther.getTitulo()!=null && this.getTitulo().equals(castOther.getTitulo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodExpediente();
         result = 37 * result + ( getTitulo() == null ? 0 : this.getTitulo().hashCode() );
         return result;
   }   


}


