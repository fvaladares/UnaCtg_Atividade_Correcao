public class Gerente extends Empregado {

    private String nomeGerencia;

    public Gerente(String nome,
                   int idade,
                   String sexo,
                   double salario,
                   String matricula,
                   String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    @Override
    public String toString() {
        return "Empregado={" + " \n\t" +
                "nome=" + getNome() +  " \n\t" +
                "idade=" + getIdade() +  " \n\t" +
                "matricula=" + getMatricula() +  " \n\t" +
                "departamento=" + getNomeGerencia() +  " \n\t" +
                "valorInss=" + getInss(.11)+  " \n" +
                "}";
    }
}
