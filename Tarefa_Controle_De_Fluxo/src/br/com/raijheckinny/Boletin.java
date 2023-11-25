package br.com.raijheckinny;

public class Boletin {
    public static void main(String args []){
        Aluno aluno = new Aluno();

        //Cadastrando dados do Aluno
        aluno.setNome("Pedro");
        aluno.setNotaMatematica(aluno.gerarNumeros());
        aluno.setNotaPortugues(aluno.gerarNumeros());
        aluno.setNotaGeografia(aluno.gerarNumeros());
        aluno.setNotaHistoria(aluno.gerarNumeros());

        //Calculando a media
        aluno.media(aluno.getNotaMatematica(),aluno.getNotaPortugues(), aluno.getNotaGeografia(), aluno.getNotaHistoria());

        //Imprimindo resposta no terminal
        aluno.imprimirNota("Matematica", aluno.getNotaMatematica());
        aluno.imprimirNota("Portugues", aluno.getNotaPortugues());
        aluno.imprimirNota("Geografia", aluno.getNotaGeografia());
        aluno.imprimirNota("Historia", aluno.getNotaHistoria());

        aluno.validacaoDaMedia();
        aluno.imprimirMedia();

    }
}
