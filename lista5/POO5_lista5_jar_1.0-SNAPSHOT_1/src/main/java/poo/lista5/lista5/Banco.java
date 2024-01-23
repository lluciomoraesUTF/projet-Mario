/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.lista5.lista5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LUCIO
 */
public class Banco {
    
    private static Banco bd;
    
    private Banco(){}
    
    public static Banco getBanco(){
        if(bd == null){
            bd=new Banco();
        }
        return bd;   
    }
    static List<Passeio> passeioList = new ArrayList<>();
    static List<Carga> cargaList = new ArrayList<>();


    public List<Passeio> getBdPasseio(){
            return passeioList;
    }
    
    public List<Carga> getBdCarga(){
            return cargaList;
    }
    public static Passeio adicionarPasseio(Passeio p){
        if(pesquisaPasseio(p)==null){
            passeioList.add(p);
            return p;
    }
        return null;
    }

    public static Carga adicionarCarga(Carga c){
        if(pesquisaCarga(c) == null){
            cargaList.add(c);
            return c;
    }
        return null;
    }

    public static Passeio pesquisaPasseio(Passeio p){
        for (Passeio passeio : passeioList) {
            if (p.getPlaca().equalsIgnoreCase(passeio.getPlaca())) {
                return passeio;
            }
        }
        return null;
    }
    public static Carga pesquisaCarga(Carga c){
        for(int i=0; i<cargaList.size(); i++){
            if(c.getPlaca().equalsIgnoreCase(cargaList.get(i).getPlaca())){
                return cargaList.get(i);
            }
        }
        return null;
    }
    public static void exibirCarga(){
        for(int i=0;i<cargaList.size();i++){
                System.out.println("\nModeleto: "+cargaList.get(i).getModelo());
                System.out.println("\nMarca: "+cargaList.get(i).getMarca());
                System.out.println("\nCor: "+cargaList.get(i).getCor());
                System.out.println("\nPlaca: "+cargaList.get(i).getPlaca());
                System.out.println("\nPotência do Motor: "+cargaList.get(i).getMotor().getPotencia());
                System.out.println("\nQuantidade de Pistões do Motor: "+cargaList.get(i).getMotor().getQtdPistoes());
                System.out.println("\nQuantidade de Rodas: "+cargaList.get(i).getQtdRoda());
                System.out.println("\nVelocidade Máxima (Cm/h): "+cargaList.get(i).calcVel(cargaList.get(1).getVelocMax()));
                System.out.println("\nData de Cadastro: "+cargaList.get(i).getDataCadastro());
                System.out.println("\nTara: "+cargaList.get(i).getTara());
                System.out.println("\nPeso Máximo: "+cargaList.get(i).getCargaMax());
                cargaList.get(i).calcular();
        }
    }
    public static void exibirPasseio(){
        for(int i=0;i<passeioList.size();i++){
                System.out.println("\nModeleto: "+passeioList.get(1).getModelo());
                System.out.println("\nMarca: "+passeioList.get(1).getMarca());
                System.out.println("\nCor: "+passeioList.get(1).getCor());
                System.out.println("\nPlaca: "+passeioList.get(1).getPlaca());
                System.out.println("\nPotência do Motor: "+passeioList.get(1).getMotor().getPotencia());
                System.out.println("\nQuantidade de Pistões do Motor: "+passeioList.get(1).getMotor().getQtdPistoes());
                System.out.println("\nQuantidade de Rodas: "+passeioList.get(1).getQtdRoda());
                System.out.println("\nVelocidade Máxima (Cm/h): "+passeioList.get(1).calcVel(passeioList.get(1).getVelocMax()));
                System.out.println("\nData de Cadastro: "+passeioList.get(1).getDataCadastro());
                System.out.println("\nTara: "+passeioList.get(1).getQtdPassageiro());   
                passeioList.get(1).calcular();
        }
    }
    public static Carga deletCarga(Carga c){
        for(int i=0;i<cargaList.size();i++){
            if(c.getPlaca().equalsIgnoreCase(cargaList.get(i).getPlaca())){
                cargaList.remove(cargaList.get(i));
                return null;
            }
        }
        return c; 
    }

    public static Passeio deletPasseio(Passeio p) {
        for (int i = 0; i < passeioList.size(); i++) {
            if (p.getPlaca().equalsIgnoreCase(passeioList.get(i).getPlaca())) {
                passeioList.remove(passeioList.get(i));
                return null;
            }
        }
        return p;
    }

    public static Carga AlterarCarga(Carga c){
        deletCarga(c);
        c=adicionarCarga(c);
        return c;
    }

    public static Passeio AlterarCarga(Passeio p){
        deletPasseio(p);
        p=adicionarPasseio(p);
        return p;
    }

}
