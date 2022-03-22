package principal;

import entities.Refeicao;
import enums.RefeicaoEnum;

import java.util.Scanner;


public class Leitor {
    public Refeicao lerDadosRefeicao() {
        Scanner scanTipo = new Scanner(System.in);
        Scanner scanNome = new Scanner(System.in);
        Scanner scanPreco = new Scanner(System.in);

        Impressora.imprimirMensagemTipoRefeicao();
        String tipoRefeicao = scanTipo.next();
        RefeicaoEnum RefeicaoEnum = RefeicaoEnum.valueOf(tipoRefeicao);

        Impressora.imprimirMensagemNome();
        String nome = scanNome.next();

        Impressora.imprimirMensagemValor();
        double preco = scanPreco.nextDouble();

        Refeicao refeicaoRetorno = new Refeicao(tipoRefeicao, nome, preco);

        return refeicaoRetorno;
    }

    public int inserirOpcaoMenu() {
        Scanner scanOpcao = new Scanner(System.in);
        int opcao = scanOpcao.nextInt();

        return opcao;
    }

    public String lerRefeicao(RefeicaoEnum tipoRefeicaoEnum) {
        Scanner scanRefeicao = new Scanner(System.in);

        switch (tipoRefeicaoEnum) {
            case ENTRADA:
                Impressora.imprimirMensagemEntrada();
                break;
            case COMIDA:
            case LANCHE:
                Impressora.imprimirMensagemNome();
                break;
            case BEBIDA:
                Impressora.imprimirMensagemBebida();
                break;
            case SOBREMESA:
                Impressora.imprimirMensagemSobremesa();
                break;
        }

        String nome = scanRefeicao.next();
        return nome;
    }

    public String lerContinuacao() {
        Scanner scanContinuacao = new Scanner(System.in);
        String continuacao = "";

        while (!validarInputCondicionais(continuacao)) {
            Impressora.imprimirMensagemContinuacao();
            continuacao = scanContinuacao.next();
        }

        return continuacao;
    }

    public String lerDesejo(RefeicaoEnum tipoRefeicaoEnum) {
        Scanner scanDesejo = new Scanner(System.in);
        String desejo = "";

        while (!validarInputCondicionais(desejo)) {
            switch (tipoRefeicaoEnum) {
                case ENTRADA:
                    Impressora.imprimirMensagemDesejoEntrada();
                    break;
                case BEBIDA:
                    Impressora.imprimirMensagemDesejoBebida();
                    break;
                case SOBREMESA:
                    Impressora.imprimirMensagemDesejoSobremesa();
                    break;
            }

            desejo = scanDesejo.next();
        }

        return desejo;
    }

    public boolean validarInputCondicionais(String opcaoDigitada) {

        return opcaoDigitada.equalsIgnoreCase("S") || opcaoDigitada.equalsIgnoreCase("N");
    }
}
