package entities;
import enums.RefeicaoEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cardapio {

    private List<Refeicao> refeicoes = new ArrayList<>();

    public Refeicao inserirRefeicao(Refeicao refeicao) {
        refeicoes.add(refeicao);
        return refeicao;
    }

    public Refeicao obterRefeicao(String nome) {
        for (int i = 0; i < refeicoes.size(); i++) {
            if (refeicoes.get(i).getNome().equals(nome) &&
                    (refeicoes.get(i).getTipoRefeicao().toString().equals("COMIDA") ||
                            refeicoes.get(i).getTipoRefeicao().toString().equals("LANCHE"))) {
                return refeicoes.get(i);
            }
        }

        Impressora.imprimirMensagemItemNaoEncontradoCardapio();
        return null;
    }

    public Refeicao obterBebida(String nome) {
        for (int i = 0; i < refeicoes.size(); i++) {
            if (refeicoes.get(i).getNome().equals(nome) && refeicoes.get(i).getTipoRefeicao().toString().equals("BEBIDA")) {
                return refeicoes.get(i);
            }
        }

        Impressora.imprimirMensagemTipoInvalidoBebida();
        return null;
    }

    public Refeicao obterEntrada(String nome) {
        for (int i = 0; i < refeicoes.size(); i++) {
            if (refeicoes.get(i).getNome().equals(nome) && refeicoes.get(i).getTipoRefeicao().toString().equals("ENTRADA")) {
                return refeicoes.get(i);
            }
        }

        Impressora.imprimirMensagemTipoInvalidoEntrada();
        return null;
    }

    public Refeicao obterSobremesa(String nome) {
        for (int i = 0; i < refeicoes.size(); i++) {
            if (refeicoes.get(i).getNome().equals(nome) && refeicoes.get(i).getTipoRefeicao().toString().equals("SOBREMESA")) {
                return refeicoes.get(i);
            }
        }

        Impressora.imprimirMensagemTipoInvalidoSobremesa();

        return null;
    }

    public static List<Refeicao> montaCardapio() {
        return Arrays.asList(
                new Refeicao(RefeicaoEnum.ENTRADA, "Carpaccio", 35.0),
                new Refeicao(RefeicaoEnum.ENTRADA, "Bruschetta", 25.0),
                new Refeicao(RefeicaoEnum.ENTRADA, "Antepasto", 20.0),

                new Refeicao(RefeicaoEnum.COMIDA, "Pasta", 30.0),
                new Refeicao(RefeicaoEnum.COMIDA, "Lasanha", 70.0),
                new Refeicao(RefeicaoEnum.COMIDA, "Polpetone", 50.0),

                new Refeicao(RefeicaoEnum.LANCHE, "Burguer", 30.0),
                new Refeicao(RefeicaoEnum.LANCHE, "Pizza", 45.0),
                new Refeicao(RefeicaoEnum.LANCHE, "Fogazza", 20.0),

                new Refeicao(RefeicaoEnum.BEBIDA, "Refrigerante", 5.0),
                new Refeicao(RefeicaoEnum.BEBIDA, "Agua", 5.0),
                new Refeicao(RefeicaoEnum.BEBIDA, "Suco", 5.0),
                new Refeicao(RefeicaoEnum.BEBIDA, "H2O", 5.0),

                new Refeicao(RefeicaoEnum.SOBREMESA, "Cannoli", 25.0),
                new Refeicao(RefeicaoEnum.SOBREMESA, "Sorvete", 15.0),
                new Refeicao(RefeicaoEnum.SOBREMESA, "Tiramisu", 30.0)
        );
    }


}
