package adapter;

public class Principal {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica(1, "Renato Andrade da Fonseca", 8000, 3, 500, 600);
        PessoaJuridica pessoaJuridica = new PessoaJuridica(1, "Renato Andrade da Fonseca - ME", 1200000);
        ImpostoDeRenda imposto = new PessoaFisicaAdapter();
        imposto.calcularImpostoDeRenda(pessoaFisica);

        imposto = new PessoaJuridicaAdapter();
        imposto.calcularImpostoDeRenda(pessoaJuridica);


    }
}
