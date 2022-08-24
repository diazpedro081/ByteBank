package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        //Conta cc1 = new ContaCorrente(11, 7275);
        //Conta cc2 = new ContaCorrente(11, 6324);

        //boolean igual = cc1.ehIgual(cc2);
        //System.out.println(igual);

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(013, 260);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(013, 102);
        lista.add(cc2);
         
        Conta cc3 = new ContaCorrente(013, 142);
        //lista.add(cc3);

        boolean existe = lista.contains(cc3);

        System.out.println("Ja existe? " + existe);

        

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }

}
