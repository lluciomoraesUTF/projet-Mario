/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.lista5.lista5;

/**
 *
 * @author LUCIO
 */
public class Passeio extends Veiculo implements Calc{
    private int qtdPassageiro;
    public Passeio(String placa, String marca, String modelo, String cor, int qtdRoda, int velocMax, Motor motor, String dataCadastro, int qtdPassageiro){
        super(placa, marca, modelo, cor, qtdRoda, velocMax, motor, dataCadastro);
        this.qtdPassageiro = qtdPassageiro;
    }
    
    public final int getQtdPassageiro() {
        return qtdPassageiro;
    }
    public final void setQtdPassageiro(int qtdPassageiro) {
        this.qtdPassageiro = qtdPassageiro;
    }
    public final int calcular() {
        int numero =0;
        numero= getPlaca().length()+getMarca().length()+getCor().length()+getModelo().length()+getDataCadastro().length();
        return 0;
    }
    public final int calcVel(int velocMax) {
        return (velocMax * 1000);
    }
}
