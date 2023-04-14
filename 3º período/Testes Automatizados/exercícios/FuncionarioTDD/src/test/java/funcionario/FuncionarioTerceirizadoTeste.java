package funcionario;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FuncionarioTerceirizadoTeste {
    private FuncionarioTerceirizado ft;

    @Test
    public void testarConstrutorEntradaDespesasInvalida()  {
        Assertions.assertThrows(IllegalArgumentException.class,()-> new FuncionarioTerceirizado("Fulano",40,132,1200));
    }

    @Test
    public void testarConstrutorEntradasValida() {
        Assertions.assertThrows(IllegalArgumentException.class,()-> new FuncionarioTerceirizado("Fulano",40,132,1000));

    }

    @Test
    public void testarModificarDespesasEntradaInvalida() throws IllegalArgumentException {
        FuncionarioTerceirizado ft = new FuncionarioTerceirizado("Fulano",40,132,1000);
        Assertions.assertThrows(IllegalArgumentException.class,()-> ft.setDespesaAdicional(1200));
    }

    @Test
    public void testarModificarDespesasEntradaValida() {
        FuncionarioTerceirizado ft = new FuncionarioTerceirizado("Fulano",40,132,1200);
        Assertions.assertThrows(IllegalArgumentException.class,()-> ft.setDespesaAdicional(1000));
    }
}
