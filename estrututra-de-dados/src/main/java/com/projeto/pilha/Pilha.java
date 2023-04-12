package com.projeto.pilha;

public class Pilha {

    private No refNo; // Entrada pilha

    public Pilha() {
        this.refNo = null;
    }

    public No pop(){
        if(this.isEmpty()) return null;

        No refNoPopped = refNo; // no refNo eu tenho o nó atual
        refNo = refNo.getRefNo(); // no getRefNo tenho o nó anterior, no caso, seto a anterior como a atual

        return refNoPopped; // retorno o nó retirado
    }

    public void push(No novoNo) {
        novoNo.setRefNo(refNo);
        refNo = novoNo;
    }

    public No top(){
        return refNo;
    }

    public boolean isEmpty() {
        return this.refNo == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "==================\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "==================\n";

        No noAuxiliar = refNo;

        while (noAuxiliar != null) {
            stringRetorno += "[No {" +
                                "dado=" + noAuxiliar.getDado() +
                            "}]\n";

            noAuxiliar = noAuxiliar.getRefNo();
        }

        stringRetorno += "==================\n";
        return stringRetorno;
    }
}
