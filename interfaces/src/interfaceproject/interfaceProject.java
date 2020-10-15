package interfaceproject;

import Interfaces.AutomovelInterface;
import beans.Carro;
import beans.Moto;

public class interfaceProject {

    public static void main(String[] args) {

        Carro carroSedan = new Carro();

        Moto motoPasseio = new Moto();

        carroSedan.setMarca("Citroen");
        carroSedan.setModelo("c3");
        carroSedan.setQuantidade(4);

        getAutomovelInfos(carroSedan);

        motoPasseio.setMarca("Honda");
        motoPasseio.setModelo("Xre");
        motoPasseio.setQuantidade(2);

        getAutomovelInfos(motoPasseio);
        
}
    
    

    public static void getAutomovelInfos(AutomovelInterface auto) {
        System.out.println("\ninformações: " + auto.getMarcaModelo());
        System.out.println("tipo de roda: " + auto.getTipoRodas());

    }

}
