package questao2;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("pt-BR"));
        Tiquete tiquete = new Tiquete("ABC1D23", 95, new Rotativo());

        System.out.println("Tarifa de Estacionamento");
        System.out.printf("Placa: %s | Permanencia: %d minutos%n",
                tiquete.getPlaca(), tiquete.getMinutos());

        imprimir(tiquete);
        tiquete.alterarPerfil(new Mensalista());
        imprimir(tiquete);
        tiquete.alterarPerfil(new Conveniado());
        imprimir(tiquete);

        System.out.println("\nTeste dos 30 minutos gratuitos no Conveniado:");
        imprimir(new Tiquete("DEF4G56", 30, new Conveniado()));
    }

    private static void imprimir(Tiquete tiquete) {
        System.out.printf("Perfil: %-10s | Valor: R$ %.2f%n",
                tiquete.getPerfil(), tiquete.calcularValor());
    }
}
