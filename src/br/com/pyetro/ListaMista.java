package br.com.pyetro;

import java.util.ArrayList;
import java.util.List;


public class ListaMista {

    public static void main(String args[]){

        String lista = "Lúcia,feminino; Bob dylan,masculino; Zé Ramalho,masculino; Micheline,Feminino";

        String[] partes = lista.split(";");

        List<String> nomesFemininos = new ArrayList<>();
        List<String> nomesMasculinos= new ArrayList<>();

        for(String parte : partes){
            String[] nomeEsexo = parte.split(",");

            if (nomeEsexo.length == 2){
                String nome = nomeEsexo[0];
                String sexo = nomeEsexo[1];
                if ("feminino".equalsIgnoreCase(sexo)){
                    nomesFemininos.add(nome);
                } else if("masculino".equalsIgnoreCase(sexo)){
                    nomesMasculinos.add(nome);
                }
            }
        }

        System.out.println("Nomes Femininos: ");
        for(String nome : nomesFemininos){
            System.out.println(nome);
        }

        System.out.println("Nomes Masculinos:");
        for(String nome : nomesMasculinos){
            System.out.println(nome);
        }

    }
}
