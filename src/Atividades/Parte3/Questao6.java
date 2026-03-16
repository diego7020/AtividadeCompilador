package Atividades.Parte3;

import Atividades.BaseQuestao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao6 extends BaseQuestao {
    @Override
    public void executar(){

        String texto = "Evento: 25/10/2024";
        String regex = "(\\d{2})/(\\d{2})/(\\d{4})"; 

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("String analisada: "+texto);
        while (matcher.find()) {
            System.out.println("Dia: "+matcher.group(1));
            System.out.println("Mes: "+matcher.group(2));
            System.out.println("Ano: "+matcher.group(3));
            
        }

    }
}
