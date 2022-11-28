public class Gerente extends Empregado {

    private String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    @Override
    public String toString() {
        return "Empregado={" +
                "nome=" + getNome() +
                "idade=" + getIdade() +
                "matricula=" + getMatricula() +
                "departamento=" + getNomeGerencia() +
                "valorInss=" + getInss(.11);
    }
}
