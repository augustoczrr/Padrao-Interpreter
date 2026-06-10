package interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void deveInterpretarPedidoCompleto() {

        InterpretadorPedido interpretador =
                new InterpretadorPedido();

        double valor = interpretador.interpretar(
                "XBURGER BATATA REFRIGERANTE"
        );

        assertEquals(29.0, valor);
    }

    @Test
    void deveInterpretarPedidoSimples() {

        InterpretadorPedido interpretador =
                new InterpretadorPedido();

        double valor = interpretador.interpretar(
                "XBURGER"
        );

        assertEquals(15.0, valor);
    }
}