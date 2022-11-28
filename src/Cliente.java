public class Cliente extends Pessoa {
    private double valorDivida;
    private int anoNascimento;

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome=" + getNome() +
                "idade=" + getIdade() +
                "sexo=" + this.getSexo() +
                "valorDivida=" + this.valorDivida +
                ", anoNascimento=" + this.anoNascimento +
                '}';
    }
}