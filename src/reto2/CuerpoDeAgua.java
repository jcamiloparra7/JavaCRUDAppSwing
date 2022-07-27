package reto2;

public class CuerpoDeAgua extends ObjetoGeografico {

    Double id;
    String tipoCuerpo;
    String tipoAgua;
    Double irca;
    String nivel;


    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getTipoCuerpo() {
        return tipoCuerpo;
    }

    public void setTipoCuerpo(String tipoCuerpo) {
        this.tipoCuerpo = tipoCuerpo;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public Double getIrca() {
        return irca;
    }

    public void setIrca(Double irca) {
        this.irca = irca;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
    
    public String nivel() {
        
        if (irca > 80) {
            
            this.nivel = "INVIABLE SANITARIAMENTE";
            return this.nivel;
        }
        
        else if (irca > 35) {
            
            this.nivel = "ALTO";
            return this.nivel;
        }
        
        else if (irca > 14) {
            
            this.nivel = "MEDIO";
            return this.nivel;
        }
        
        else if (irca > 5) {
            
            this.nivel = "BAJO";
            return this.nivel;
        }
        
        else {
            
            this.nivel = "SIN RIESGO";
            return this.nivel;
        }
    } 
}