package tsi.builder;

public class Carro {
    Integer bancos;
    String motor;
    String cor;
    String gps;
    String farois;
    String vidros;
    Double volumePortaMalas;

    @Override
    public String toString() {
        return  "Carro {\n"
                +"\t bancos: " + bancos + ",\n"
                +"\t motor: " + motor + ",\n"
                +"\t cor: " + cor + ",\n"
                +"\t gps: " + gps + ",\n"
                +"\t farois: " + farois + ",\n"
                +"\t vidros: " + vidros + ",\n"
                +"\t volumePortaMalas: " + volumePortaMalas + "\n}" ;
    }
}
