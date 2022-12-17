package factory;

public class Principal {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica(1, "Whalyson", 8000, 3, 500, 600);
        PessoaJuridica pessoaJuridica = new PessoaJuridica(1, "Renato Andrade da Fonseca - ME", 30000);
        CalcularImposto calcularImposto = new CalcularImposto();
        calcularImposto.calcular(pessoaFisica);
    }
}
