package org.example;

package interpreter;

public class InterpretadorPedido {

    public double interpretar(String pedido) {

        double total = 0;

        String[] itens = pedido.split(" ");

        for (String item : itens) {

            Expressao expressao = null;

            if (item.equalsIgnoreCase("XBURGER")) {
                expressao = new XBurger();
            }

            else if (item.equalsIgnoreCase("BATATA")) {
                expressao = new Batata();
            }

            else if (item.equalsIgnoreCase("REFRIGERANTE")) {
                expressao = new Refrigerante();
            }

            if (expressao != null) {
                total += expressao.interpretar();
            }
        }

        return total;
    }
}