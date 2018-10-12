package modelo;

import java.util.List;

public class Carro {

    private long codigo;
    private String placa;
    private String cor;
    private String chassi;
    private double valorBaseDiaria;
    private ModeloCarro modelo;
    private List<Acessorio> acessorios;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getValorBaseDiaria() {
        return valorBaseDiaria;
    }

    public void setValorBaseDiaria(double valorBaseDiaria) {
        this.valorBaseDiaria = valorBaseDiaria;
    }
    
    public ModeloCarro getModelo() {
        return modelo;
    }

    public void setModelo(ModeloCarro modelo) {
        this.modelo = modelo;
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }
    
    public double getValorAPagar() {
    	double valor = 0.0;
    	for (Acessorio a : acessorios) {
    		valor += a.getValor();
    	}
    	return valorBaseDiaria + valor;
    }
}
