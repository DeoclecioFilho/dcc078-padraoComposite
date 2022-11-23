package padroesestruturais;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarItensAceessorioCarro() {

        Basico basico1 = new Basico("Modelo Pulse Abarth");
        Classe classe11 = new Classe("Cabide de Banco", "Conforto");
        Classe classe12 = new Classe("Estribo Lateral", "Segurança");
        Classe classe13 = new Classe("Adesivo de Capô", "Esportividade");
        Classe classe14 = new Classe("Suporte de Bicicleta", "Transporte");
        basico1.addAcessorio(classe11);
        basico1.addAcessorio(classe12);
        basico1.addAcessorio(classe13);
        basico1.addAcessorio(classe14);

        Basico basico2 = new Basico("Modelo Toro");
        Classe classe21 = new Classe("Calha de chuva", "Segurança");
        Classe classe22 = new Classe("Estribo Lateral", "Segurança");
        basico2.addAcessorio(classe21);
        basico2.addAcessorio(classe22);

        Basico basico3 = new Basico("Modelo Argo");
        Classe classe31 = new Classe("Calha de chuva", "Segurança");
        Classe classe32 = new Classe("Adaptador USB", "Sonorização");
        Classe classe33 = new Classe("Bagageiro Tubular", "Transpote");
        basico3.addAcessorio(classe31);
        basico3.addAcessorio(classe32);
        basico3.addAcessorio(classe33);

        Basico item = new Basico("Acessorios Carros Fiat");
        item.addAcessorio(basico1);
        item.addAcessorio(basico2);
        item.addAcessorio(basico3);

        Carro carro = new Carro();
        carro.setItem(item);

        assertEquals(
                "Acessório: Acessorios Carros Fiat\n" +
                        "Acessório: Modelo Pulse Abarth\n" +
                        "Classe: Conforto - Tipo da Classe: Conforto\n" +
                        "Classe: Segurança - Tipo da Classe: Segurança\n" +
                        "Classe: Esportividade - Tipo da Classe: Esportividade\n" +
                        "Classe: Transporte - Tipo da Classe: Transporte\n" +
                        "Acessório: Modelo Toro\n" +
                        "Classe: Segurança - Tipo da Classe: Segurança\n" +
                        "Classe: Segurança - Tipo da Classe: Segurança\n" +
                        "Acessório: Modelo Argo\n" +
                        "Classe: Segurança - Tipo da Classe: Segurança\n" +
                        "Classe: Sonorização - Tipo da Classe: Sonorização\n" +
                        "Classe: Transpote - Tipo da Classe: Transpote\n",
                item.getAcessorio()
        );

    }

}