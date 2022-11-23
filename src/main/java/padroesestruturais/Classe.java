package padroesestruturais;

public class Classe extends Acessorio {

    private String tipoClasse;

    public String getTipoClasse() {
        return tipoClasse;
    }

    public void setTipoClasse(String tipoClasse) {
        this.tipoClasse = tipoClasse;
    }

    public Classe(String descricao, String tipoClasse) {
        super(descricao);
        this.tipoClasse = tipoClasse;
    }

    @Override
    public String getAcessorio() {
        return "Classe: " + this.getTipoClasse() + " - Tipo da Classe: " + this.tipoClasse + "\n";
    }


}

// Tipo da Classe: Entretenimento, Sonorização, Conforto, Praticidade, Segurança
