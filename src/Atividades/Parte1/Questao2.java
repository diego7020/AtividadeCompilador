package Atividades.Parte1;


import Atividades.BaseQuestao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 extends BaseQuestao{
    @Override
    public void executar() {

        String texto = "10.45";
        String regex = "\\d+\\.\\d+$";

        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(texto);

        System.out.println("String analisada: "+texto);
        if (matcher.matches()) {
            System.out.println("String contem apenas numero decimais");
        }else{
            System.out.println("String invalida!");
        }

    }

    
}
