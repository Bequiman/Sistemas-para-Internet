package funcionario;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FuncionarioTeste {
    private Funcionario funcionario;

    @Test
    public void testarConstrutorPagamentoInvalido()  {
        Assertions.assertThrows(Exception.class,()-> new Funcionario("Fulano",45,135));
    }

    @Test
    public void testarConstrutorEntradaValorHoraInvalida()  {
        Assertions.assertThrows(Exception.class,()-> new Funcionario("Fulano",40,135));
    }

    @Test
    public void testarConstrutorEntradaHorasInvalida() {
        Assertions.assertThrows(Exception.class,()-> new Funcionario("Fulano",41,132));

    }

    @Test
    public void testarConstrutorEntradasValida() {
        Assertions.assertThrows(Exception.class,()-> new Funcionario("Fulano",40,132));
    }

    @Test
    public void testarModificarHorasPagamentoInvalido() {
        Funcionario funcionario =  new Funcionario("Fulano",40,132);
        Assertions.assertThrows(IllegalArgumentException.class,()-> funcionario.setHorasTrabalhadas(42));
    }

    @Test
    public void testarModificarHorasEntradaInvalida() {
        funcionario = new Funcionario("Fulano",40,132);
        Assertions.assertThrows(IllegalArgumentException.class,()-> funcionario.setHorasTrabalhadas(50));
    }
    @Test
    public void testarModificarValorPagamentoInvalido() {
        funcionario = new Funcionario("Fulano",40,132);
        Assertions.assertThrows(IllegalArgumentException.class,()-> funcionario.setValorHora(50));
    }
    @Test
    public void testarModificarValorEntradaInvalida() {
        funcionario = new Funcionario("Fulano",40,132);
        Assertions.assertThrows(IllegalArgumentException.class,()-> funcionario.setValorHora(2));
    }

    @Test
    public void testarModificarValorEntradaValida()  {
        funcionario = new Funcionario("Fulano",40,135);
        Assertions.assertThrows(IllegalArgumentException.class,()-> funcionario.setValorHora(132));
    }


}
