package org.example.ex7;

public class RelatorioService {
    public void gerarRelatorio(String tipo) {
        RelatorioFactory relatorioFactory;
        switch (tipo) {
            case "PDF":
                relatorioFactory = new PdfRelatorioFactory();
                break;
            case "CSV":
                relatorioFactory = new CsvRelatorioFactory();
                break;
            case "JSON":
                relatorioFactory = new JsonRelatorioFactory();
                break;
            default:
                System.out.println("Tipo de relatório desconhecido!");
                return;
        }
        System.out.println("Gerando relatório em " + tipo + "...");
        relatorioFactory.gerarCabecalho();
        relatorioFactory.gerarCorpo();
        relatorioFactory.gerarRodape();
    }
}
