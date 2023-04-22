package com.projeto.fila;

public class Fila {

    private No refNoInput;

    public Fila() {
        this.refNoInput = null;
    }

    public boolean isEmpty() {
        return (this.refNoInput == null);
    }

    public void enqueue(No novoNo) {
        novoNo.setRefNo(refNoInput);
        refNoInput = novoNo;
    }

    public No first() {
        if (this.isEmpty()) return null;

        while (refNoInput.getRefNo() != null) {
            refNoInput = refNoInput.getRefNo();
        }

        return refNoInput;
    }

    // Remove o primeiro da fila
    public No dequeue() {
        if (this.isEmpty()) return null;

        No auxNo = refNoInput; // Auxilar para pegar o nó que vai se manter
        No firstNo = refNoInput; // O primeiro nó que será retirado

        while(firstNo.getRefNo() != null) { // Enquanto o nó não apontar para null (enquanto não for o primeiro) não termina o laço
            auxNo = firstNo; // guardo o nó completo do primeiro nó
            firstNo = firstNo.getRefNo(); // pego a referencia do próximo nó
        }

        //Caso chegue aqui, é pq a referencia do próximo é null, ou seja, não tem referencia

        auxNo.setRefNo(null); // pego o nó auxiliar, que aponta para um nó antes do nó que aponta para null e seto o mesmo para null

        // retorno o nó removido
        return firstNo;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) return "null";

        String returnString = "";
        No auxNo = refNoInput;

        while (auxNo.getRefNo() != null) {
            returnString += "[No{Objeto=" + auxNo.getObject() + "}]->";
            auxNo = auxNo.getRefNo();
        }
        returnString += "[No{Objeto=" + auxNo.getObject() + "}]->null"; // Last

        return returnString;
    }
}
