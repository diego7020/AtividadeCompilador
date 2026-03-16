package Atividades.Parte1;


import Atividades.BaseQuestao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao1 extends BaseQuestao{
        @Override
    public void executar() {

        //texto que vou analisar...
        String texto = "12345";

        //expressao regular para somente numero...
        String regex = "^[0-9]+$";

        //Responsavel por compilar a expressao regular..
        //Objetivo é transformar a regex em um automato interno que reconhece o padrao
        Pattern pattern = Pattern.compile(regex);

        // O Matcher aplica o padrão sobre uma cadeia de entrada.
        // O conceito aqui é:
        //     regex → autômato
        //     texto → cadeia
        //     matcher → processo de reconhecimento 
        Matcher matcher = pattern.matcher(texto);

        // Verificação de correspondência
        // Retorna:
        //     true → string inteira corresponde ao padrão
        //     false → não corresponde
        System.out.println(" Strign analisada: " + texto);

        if (matcher.matches()) {
            System.out.println("A string contem somente numeros.");
        } else {
            System.out.println("A string contem outros caracteres");
        }
    }
}