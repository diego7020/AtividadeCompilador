package Atividades.Parte2;

import Atividades.BaseQuestoes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Diferente da questao4 pois tem q pegar dois digitos ou mais somente.
public class Questao5 extends BaseQuestoes{
    @Override
    public void executar(){

        String texto = "Maria tem 23 anos e comprou 5 livros por 120 reais. 1000. 122222. 124125. 42242.";
        //mudança no regex para pegar 2 digitos ou mais...
        String regex = "\\d{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        
        System.out.println("String analisada: "+texto);
        System.out.println("Numero encontrados:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        
    }    

    
}
