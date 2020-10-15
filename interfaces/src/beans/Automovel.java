
package beans;

public abstract class Automovel {
    
    private String tipoAutomovel;
    private String modelo;
    private String marca;
    private int quantidade;
    protected String tipoMotor;

    public String getTipoAutomovel() {
        return tipoAutomovel;
    }

    public void setTipoAutomovel(String tipoAutomovel) {
        this.tipoAutomovel = tipoAutomovel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    
    
    
}
