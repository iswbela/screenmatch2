package br.com.alura.screenmatch.principal;

import java.util.Scanner;

import br.com.alura.screenmatch.service.ConsumoApi;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=5b224e19";

    public void exibMenu(){
        System.out.println("Digite o nome da série para a busca");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace("", "+") + API_KEY);
        
        //"https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c"
}
}
