package com.projeto.no;

public class No<T> {
    private T conteudo; // T = qualquer tipo
    private No<T> proximoNo;

    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    //Recebe como parâmetro a instância do tipo da mesma classe, sendo possível recuperar
    // os métodos da mesma ao ser chamado
    // por isso fica possível fazer chamadas do mesmo método várias vezes encadeado
    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    //Se eu tenho o toString na minha classe, consigo retornar o conteúdo dela em forma
    // de dicionário, no caso. Isso quando eu chamo somente a instancia, ex
    // No no1 = new No("xpto");
    // System.out.println(no1);
    //output: conteudo do método toString() da classe
    // No{
    //  conteudo=xpto
    // }
    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
