package Atividades.Parte2;

import Atividades.BaseQuestoes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao4 extends BaseQuestoes{
    @Override
    public void executar(){

        String texto = "Maria tem 23 anos e comprou 5 livros por 120 reais.";
        String regex = "\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        
        System.out.println("String analisada: "+texto);
        System.out.println("Numero encontrados:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        
    }    

    
}
