
package beans;

import Interfaces.AutomovelInterface;


public class Moto extends Automovel implements AutomovelInterface{
    
    public Moto (){
        setTipoAutomovel("Motocicleta");
    }
    
    public String getMarcaModelo(){
        return super.getTipoAutomovel() + "\nMarca: " + getMarca() + "\nModelo: " + getModelo();
    }
    
    public String getTipoRodas(){
        return "rodas de moto";
    }
    
    public void setTipoMotor(){
        this.tipoMotor = "motor 150 cilindros";
    }
}
