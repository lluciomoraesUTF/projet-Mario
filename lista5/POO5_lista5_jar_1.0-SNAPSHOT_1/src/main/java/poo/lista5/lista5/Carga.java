/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.lista5.lista5;

/**
 *
 * @author LUCIO
 */
public class Carga extends Veiculo implements Calc{
    private int tara;
    private int cargaMax;
    public Carga(String placa, String marca, String modelo, String cor, int qtdRoda, int velocMax, Motor motor, String dataCadastro, int tara, int cargaMax){
        super(placa, marca, modelo, cor, qtdRoda, velocMax, motor, dataCadastro);
        this.tara=tara;
        this.cargaMax=cargaMax;
    }
    public int getTara() {
        return tara;
    }
    public int getCargaMax() {
        return cargaMax;
    }
    public final void setTara(int tara) {
        this.tara = tara;
    }
    public final void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }
    public int calcular() {
        long valor = (getQtdRoda()+getVelocMax()+getTara()+getCargaMax());
        return (int)valor;
    }
    public final int calcVel(int velocMax) {
        return (velocMax * 10000);
    }
}

