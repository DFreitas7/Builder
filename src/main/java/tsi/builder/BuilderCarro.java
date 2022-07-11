package tsi.builder;

public class BuilderCarro implements InterfaceBuilder {
    private Carro carro;

    public BuilderCarro() {
        this.carro = new Carro();
    }
    
    BuilderCarro setBancos(Integer bancos) {
        carro.bancos = bancos;
        return this;
    }
    
    BuilderCarro setMotor(String motor) {
        carro.motor = motor;
        return this;
    }
    
    BuilderCarro setCor(String cor) {
        carro.cor = cor;
        return this;
    }
    
    BuilderCarro setGps(String gps) {
        carro.gps = gps;
        return this;
    }
    
    BuilderCarro setFarois(String farois) {
        carro.farois = farois;
        return this;
    }
    
    BuilderCarro setVidros(String vidros) {
        carro.vidros = vidros;
        return this;
    }
    
    BuilderCarro setVolumePortaMalas(Double volumePortaMalas) {
        carro.volumePortaMalas = volumePortaMalas;
        return this;
    }
    
    @Override
    public void reset() {
        carro = new Carro();
    }
    
    @Override
    public Carro build() {
        return carro;
    }
}
