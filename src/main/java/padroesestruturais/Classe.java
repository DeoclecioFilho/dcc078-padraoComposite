package padroesestruturais;

public class Classe {

    private String tipoClasse;

    public String getTipoClasse() {
        return tipoClasse;
    }

    public void setTipoClasse(String tipoClasse) {
        this.tipoClasse = tipoClasse;
    }

    public Classe(String tipoClasse) {
        this.tipoClasse = tipoClasse;
    }

    public String getConteudo() {
        return "Classe: " + this.getTipoClasse() + " - Tipo da Classe: " + this.tipoClasse + "\n";
    }

}

// Tipo da Classe: Entretenimento, Sonorização, Conforto, Praticidade, Segurança
