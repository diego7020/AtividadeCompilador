package Atividades.Parte4;

import Atividades.BaseQuestao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Questão 8 – Oculte parte de um telefone celular.
//Entrada: Telefone: (67) 99876-1234

//Saída esperada: Telefone: (67) 9****-1234

public class Questao8 extends BaseQuestao {
    @Override
    public void executar(){
        
        String texto = "Telefone: (67) 99876-1234\n";
        String regex = "(\\(\\d{2}\\)) 9\\d{4}-(\\d{4})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        String resultado = matcher.replaceAll("$1 9****-$2");

        System.out.println("\ntexto original: "+texto);
        System.out.println("Resultado: "+resultado);

    }
}
