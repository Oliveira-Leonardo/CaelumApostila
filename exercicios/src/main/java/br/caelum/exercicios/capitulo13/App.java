package br.caelum.exercicios.capitulo13;

public class App {
    public static void main(String[] args) {

        String s = "fj11 aa bb";
        String sWithSpaces = "        fj11 aa bb!      ";
        String empty = "";
        s = s.replace('1', '2');
        
        if(s.contains("aa")){
            System.out.println("tem aa");
        }else{
            System.out.println("nao tem aa");
        }

        sWithSpaces = sWithSpaces.trim();
        System.out.println(sWithSpaces);
        
        if(empty.isEmpty()){
            System.out.println("ish ta vazia memo");
        }
        else{
            System.out.println("uai sô tem coisa");
        }
        
        int tamanho = sWithSpaces.length();
        System.out.println("tem o tamanho de " + tamanho + " bois");


        for (int i = 0; i < tamanho; i++) {
            char c = sWithSpaces.charAt(i);
            System.out.println(c); 
        }
    }
}