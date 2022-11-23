package padroesestruturais;

public class Carro {

    private Acessorio item;

    public void setItem(Acessorio item) {
        this.item = item;
    }

    public Carro(Acessorio item) {
        this.item = item;
    }

    public String getItem() {
        if (this.item == null) {
            throw new NullPointerException("Carro sem acessório.");
        }
        return this.item.getAcessorio();
    }
}
