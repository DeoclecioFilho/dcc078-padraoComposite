package padroesestruturais;

import java.util.ArrayList;
import java.util.List;

public class Basico extends Acessorio{

    private List<Acessorio> acessorios;

    public Basico(String descricao) {
        super(descricao);
        this.acessorios = new ArrayList<Acessorio>();
    }

    public void addAcessorio(Acessorio acessorio) {
        this.acessorios.add(acessorio);
    }
    @Override
    public String getAcessorio() {
        String saida = "";
        saida = "Acessório: " + this.getDescricao() + "\n";
        for (Acessorio acessorio : acessorios) {
            saida += acessorio.getAcessorio();
        }
        return saida;
    }
}
