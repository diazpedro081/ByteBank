package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;


public class Teste {
    
    public static void main(String[] args) {
        //Especifica que essa lista é esclusiva para itens do tipo Conta
        ArrayList<Conta> lista = new ArrayList<Conta>();
        
        Conta cc = new ContaCorrente(013, 260);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(013, 102);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());
        Conta ref = (Conta) lista.get(0);
        System.out.println("Numero: " + ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(013, 164);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(013, 934);
        lista.add(cc4);

        for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        //Nova forma de aplicar for
        for(Object oRef : lista) {
            System.out.println(oRef);
        }

    }
}
