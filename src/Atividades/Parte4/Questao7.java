package Atividades.Parte4;

import Atividades.BaseQuestao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao7 extends BaseQuestao {
    @Override
    public void executar(){

        String texto = "\n nome Diego CPF: 123.456.789-00 \n";
        String regex = "(\\d{3})\\.(\\d{3})\\.(\\d{3})-(\\d{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        String resultado = matcher.replaceAll("***.***.***-$4");

        System.out.println("\n texto original:"+texto);
        System.out.println("\n Resultado: "+resultado);
        
    }
}
