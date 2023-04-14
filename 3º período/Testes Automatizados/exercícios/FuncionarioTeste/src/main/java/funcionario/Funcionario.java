package funcionario;

public class Funcionario {
    private String nome;
    private int horasTrabalhadas;

    private double valorHora;

    public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
        this.valorHora = validaValorHorasTrabalhadas(valorHora);
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = validaValorHorasTrabalhadas(valorHora);
    }

    private int validaHorasTrabalhadas(int horasTrabalhadas) throws IllegalArgumentException {
        if (horasTrabalhadas > 40 || horasTrabalhadas <= 0) {
            throw new IllegalArgumentException("O número de horas trabalhadas próprios deve ser menor ou igual a 40.");
        }
        return horasTrabalhadas;
    }

    private double validaValorHorasTrabalhadas(double valorHora) throws IllegalArgumentException {
        double salarioMinimo = 1320.00;
        double valorMinimoHora = 0.04 * salarioMinimo;
        double valorMaximoHora = 0.10 * salarioMinimo;

        if (valorHora < valorMinimoHora || valorHora > valorMaximoHora) {
            throw new IllegalArgumentException("O valor por hora precisa estar entre 4% e 10% do salário mínimo.");
        }
        return valorHora;
    }

    public double calcularPagamento() {
        double salario = horasTrabalhadas * valorHora;
        double salarioMinimo = 1320.00;
        if (salario < salarioMinimo) {
            return salarioMinimo;
        }
        return salario;
    }
}
