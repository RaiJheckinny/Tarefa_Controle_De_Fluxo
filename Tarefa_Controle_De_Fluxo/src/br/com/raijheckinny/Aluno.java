package br.com.raijheckinny;

public class Aluno {
    private String nome;
    private int notaMatematica;
    private int notaPortugues;
    private int notaHistoria;
    private int notaGeografia;
    private double media;
    private String status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(int notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public int getNotaPortugues() {
        return notaPortugues;
    }

    public void setNotaPortugues(int notaPortugues) {
        this.notaPortugues = notaPortugues;
    }

    public int getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(int notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public int getNotaGeografia() {
        return notaGeografia;
    }

    public void setNotaGeografia(int notaGeografia) {
        this.notaGeografia = notaGeografia;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    //Cacular a media das 4 nullnotas recebidas
    public void media(int n1, int n2, int n3, int n4){
        this.media = (double) (n1 + n2 + n3 + n4) / 4;
    }

    //Gera um numero inteiro de 0 a 10
    public int gerarNumeros(){
        int num = (int)Math.round(Math.random() * 10);
        return num;
    }

    //Imprimir as notas das materias
    public void imprimirNota(String materia, Integer nota){
        System.out.println("Nota " + materia + " : " + nota);
    }

    //Testar se o aluno foi apravado com 7 ou mais, esta de recuperaçao com 5 ou mais ou reprovado com menos de 5
    public void validacaoDaMedia(){
        if (media >= 7 ){
            this.status = "Aprovado";
        }else if (media >= 5 ){
            this.status = "Recuperação";
        }else if (media < 5 ){
            this.status = "Reprovado";
        }
    }

    //Imprimir a media do aluno e o seu status nas materias
    public void imprimirMedia(){
        System.out.println("Media : " + media);
        System.out.println("Status : " + this.status);
    }
}
