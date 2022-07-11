package tsi.builder;

import java.util.Scanner;

public class Builder {

    public static void main(String[] args) {
        BuilderCarro builderCarro = new BuilderCarro();
        
        Integer comando;
        System.out.println("Builder inicializado!");
        
        String parametro;
        
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite um parametro para analisar ou 0 para finalizar:");
            System.out.println("1 - bancos");
            System.out.println("2 - motor");
            System.out.println("3 - cor");
            System.out.println("4 - gps");
            System.out.println("5 - farois");
            System.out.println("6 - vidros");
            System.out.println("7 - volumePortaMalas");
            System.out.println("8 - reiniciar builder");
            
            comando = Integer.parseInt(scanner.nextLine());
            if (comando == 0) break;
            
            System.out.println("Entre com o valor do parametro:");
            parametro = scanner.nextLine();
            switch (comando) {
                case 1:
                    builderCarro.setBancos(Integer.parseInt(parametro));
                    break;
                case 2:
                    builderCarro.setMotor(parametro);
                    break;
                case 3:
                    builderCarro.setCor(parametro);
                    break;
                case 4:
                    builderCarro.setGps(parametro);
                    break;
                case 5:
                    builderCarro.setFarois(parametro);
                    break;
                case 6:
                    builderCarro.setVidros(parametro);
                    break;
                case 7:
                    builderCarro.setVolumePortaMalas(Double.parseDouble(parametro));
                    break;
                case 8:
                    builderCarro.reset();
                    break;
                default:
                    break;
            }
        } while(comando != 0);
        
        Carro carroConstruido = builderCarro.build();
        
        System.out.println("Novo carro finalizado: " + carroConstruido);
    }
}
