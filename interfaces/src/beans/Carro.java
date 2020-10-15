
package beans;

import Interfaces.AutomovelInterface;

public class Carro extends Automovel implements AutomovelInterface {
    
    public Carro(){
        setTipoAutomovel("Carro \n");
    }
    
    public String getMarcaModelo(){
        return super.getTipoAutomovel() + "Marca: " + getMarca() + "\nModelo: " + getModelo();
    }
    
    public String getTipoRodas(){
        return "rodas de liga leve";
    }
    
    public void setTipoMotor(){
        this.tipoMotor = "motor 700 cavalos, turbo";
    }
    
}
