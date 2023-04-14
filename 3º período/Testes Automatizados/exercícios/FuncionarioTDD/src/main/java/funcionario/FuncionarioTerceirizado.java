package funcionario;

public class FuncionarioTerceirizado extends Funcionario{
    private double despesaAdicional;

    public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double valorHora, double despesaAdicional) {
        super(nome, horasTrabalhadas, valorHora);
        this.despesaAdicional = validaDespesaAdicional(despesaAdicional);
    }

    public FuncionarioTerceirizado() {
    }

    public double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(double despesaAdicional) {
        this.despesaAdicional = validaDespesaAdicional(despesaAdicional);
    }

    public double validaDespesaAdicional(double despesaAdicional) throws IllegalArgumentException {
        if (despesaAdicional > 1000){
            throw new IllegalArgumentException("O valor das despesas adicionais não pode ultrapassar R$ 1000.00.");
        }
        return despesaAdicional;
    }
    @Override
    public double calcularPagamento() {
        double bonus = despesaAdicional * 1.1;
        return super.calcularPagamento() + bonus;
    }
}
