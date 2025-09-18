package pcmania;

import pcmania.cliente.Cliente;
import pcmania.pc.Computador;
import pcmania.pc.HardwareBasico;
import pcmania.pc.MemoriaUSB;
import pcmania.pc.SistemaOperacional;
import pcmania.util.ProcessarPedido;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int matricula = 2102;

        Cliente cliente = new Cliente("Tales", "06523132301");

        HardwareBasico[] hardware1 = {
                new HardwareBasico("Pentium Core i3", 2200),
                new HardwareBasico("Memória RAM", 8),
                new HardwareBasico("HD", 500)
        };
        SistemaOperacional so1 = new SistemaOperacional("macOS Sequoia", 64);
        Computador promo1 = new Computador("Apple", matricula, so1, hardware1);
        MemoriaUSB musb1 = new MemoriaUSB("Pen-drive", 16);
        promo1.addMemoriaUSB(musb1);

        HardwareBasico[] hardware2 = {
                new HardwareBasico("Pentium Core i5", 3370),
                new HardwareBasico("Memória RAM", 16),
                new HardwareBasico("HD", 1000)
        };
        SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);
        Computador promo2 = new Computador("Samsung", matricula + 1234, so2, hardware2);
        MemoriaUSB musb2 = new MemoriaUSB("Pen-drive", 32);
        promo2.addMemoriaUSB(musb2);

        HardwareBasico[] hardware3 = {
                new HardwareBasico("Pentium Core i7", 4500),
                new HardwareBasico("Memória RAM", 32),
                new HardwareBasico("HD", 2000)
        };
        SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);
        Computador promo3 = new Computador("Dell", matricula + 5678, so3, hardware3);
        MemoriaUSB musb3 = new MemoriaUSB("HD Externo", 1000);
        promo3.addMemoriaUSB(musb3);

        Scanner entrada = new Scanner(System.in);
        int leitor;
        int i = 0;

        do {
            System.out.println("Bem-vindo à PCMania!");
            System.out.println("Digite o código da promoção que deseja comprar:");
            System.out.println("1 - Promoção 1 (Apple)");
            System.out.println("2 - Promoção 2 (Samsung)");
            System.out.println("3 - Promoção 3 (Dell)");
            System.out.println("0 - Finalizar Compra");
            System.out.print("Sua opção: ");
            leitor = entrada.nextInt();

            switch (leitor) {
                case 1:
                    if (i < cliente.computadores.length) {
                        cliente.computadores[i++] = promo1;
                        System.out.println("Promoção 1 adicionada ao carrinho!");
                    }
                    break;
                case 2:
                    if (i < cliente.computadores.length) {
                        cliente.computadores[i++] = promo2;
                        System.out.println("Promoção 2 adicionada ao carrinho!");
                    }
                    break;
                case 3:
                    if (i < cliente.computadores.length) {
                        cliente.computadores[i++] = promo3;
                        System.out.println("Promoção 3 adicionada ao carrinho!");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando sua compra...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (leitor != 0);

        System.out.println("==================================");
        System.out.println("       RESUMO DA COMPRA");
        System.out.println("==================================");
        System.out.println("Cliente: " + cliente.GetNome());
        System.out.println("CPF: " + cliente.GetCpf());
        System.out.println("Computadores Adquiridos:");

        for (Computador pc : cliente.computadores) {
            if (pc != null) {
                pc.mostraPCConfigs();
            }
        }

        System.out.println("TOTAL DA COMPRA: R$" + cliente.calculaTotalCompra());
        System.out.println("==================================");

        ProcessarPedido.processar(cliente.computadores);

        entrada.close();
    }
}