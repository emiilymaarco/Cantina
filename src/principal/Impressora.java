package principal;

import entities.Pedido;
import entities.Refeicao;

public class Impressora {
    public static void imprimirMensagemTipoRefeicao() {
        System.out.println("Insira o tipo de Refeição - COMIDA ou LANCHE: ");
    }

    public static void imprimirMensagemNome() {
        System.out.println("Insira o nome do prato: ");
    }

    public static void imprimirMensagemValor() {
        System.out.println("Insira o valor do prato: ");
    }

    public static void imprimirCardapio(Refeicao refeicao) {
        System.out.println(refeicao.getTipoRefeicao());
        System.out.println(refeicao.getNome());
        System.out.println(refeicao.getPreco());
        System.out.println("=======================");
    }

    public static void imprimirMenuPrincipal() {
        System.out.println("**** Seja bem-vindo ao Gio's Cantina ****");
        System.out.println("Selecione a opção desejada:");
        System.out.println("0 - Cadastrar Refeição");
        System.out.println("1 - Consultar Cardápio");
        System.out.println("2 - Realizar Pedido");
        System.out.println("9 - Sair");
    }

    public static void imprimirMensagemContinuacao() {
        System.out.println("Deseja realizar um novo pedido?  (S / N): ");
    }

    public static void imprimirMensagemItemNaoEncontradoCardapio() {
        System.out.println("Item não encontrado no cardápio ou tipo de item diferente de COMIDA ou LANCHE! ");
    }

    public static void imprimirMensagemConclusaoPedido(Pedido pedido) {
        System.out.println("Pedido realizado com sucesso!");

        System.out.println("Itens:");
        System.out.println("=======================");
        for (int i = 0; i < pedido.getItens().size(); i++) {
            System.out.println(pedido.getItens().get(i).getTipoRefeicao());
            System.out.println(pedido.getItens().get(i).getNome());
            System.out.println(pedido.getItens().get(i).getPreco());
            System.out.println("=======================");
        }

        System.out.println("Valor Total: " + pedido.getValorTotal());
    }

    public static void imprimirMensagemTipoInvalidoBebida() {
        System.out.println("Valor inválido! Favor solicitar uma bebida!");
    }

    public static void imprimirMensagemDesejoBebida() {
        System.out.println("Deseja pedir uma bebida? (S / N): ");
    }

    public static void imprimirMensagemBebida() {
        System.out.println("Insira o nome da bebida: ");
    }

    public static void imprimirMensagemDesejoEntrada() {
        System.out.println("Deseja pedir uma entrada? (S / N): ");
    }

    public static void imprimirMensagemEntrada() {
        System.out.println("Digite o nome da entrada: ");
    }

    public static void imprimirMensagemSobremesa() {
        System.out.println("Digite o nome da sobremesa: ");
    }

    public static void imprimirMensagemTipoInvalidoEntrada() {
        System.out.println("Valor inválido! Favor solicitar uma entrada!");
    }

    public static void imprimirMensagemTipoInvalidoSobremesa() {
        System.out.println("Valor inválido! Favor solicitar uma sobremesa!");
    }

    public static void imprimirMensagemDesejoSobremesa() {
        System.out.println("Deseja pedir uma sobremesa? (S / N): ");
    }

    public static void imprimirMensagemPedidoExpirado() {
        System.out.println("Limite de tentativas excedido!!! Você será direcionado(a) novamente ao Menu Principal e pode recomeçar seu pedido");
    }

    public static void imprimirMensagemUltimaTentativaPedido() {
        System.out.println("Atenção!!! Você já inseriu valores inválidos por duas tentativas. Caso insira novamente um valor inválido, o pedido será anulado e você será direcionado(a) de volta ao Menu Principal!");
    }

    public static void imprimirMensagemValorInvalidoMenu() {
        System.out.println("Valor inválido! Digitar somente números condizentes com as opções!!!");
    }
}
