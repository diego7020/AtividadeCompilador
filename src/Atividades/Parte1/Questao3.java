package Atividades.Parte1;

import Atividades.BaseQuestao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao3 extends BaseQuestao{
    
    @Override
    public void executar(){
        
        String texto = "10/02/2004";
        String regex = "^\\d{2}/\\d{2}/\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Strig analisada: "+texto);
        
        if(matcher.matches()){
            System.out.println("Formato de data correto!");
        }else{
            System.out.println("Formato incorreto, favor usar dd/mm/aaaa");
        }
    }   
}
