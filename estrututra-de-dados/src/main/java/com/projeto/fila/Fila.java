package com.projeto.fila;

public class Fila<T> {

    private No<T> refNoInput;

    public Fila() {
        this.refNoInput = null;
    }

    public boolean isEmpty() {
        return (this.refNoInput == null);
    }

    public void enqueue(T object) {
        No no = new No(object);
        no.setRefNo(refNoInput);
        refNoInput = no;
    }

    public T first() {
        if (this.isEmpty()) return null;

        No auxNo = refNoInput;

        while (auxNo.getRefNo() != null) {
            auxNo = auxNo.getRefNo();
        }

        return (T) auxNo.getObject();
    }

    // Remove o primeiro da fila
    public T dequeue() {
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
        return (T) firstNo.getObject();
    }

    @Override
    public String toString() {
        if (this.isEmpty()) return "null";

        String returnString = "\n==================\n";
        returnString += "====   Fila   ====\n";
        returnString += "==================\n\n";

        No auxNo = refNoInput;

        while (auxNo.getRefNo() != null) {
            returnString += "[No{Objeto=" + auxNo.getObject() + "}]->";
            auxNo = auxNo.getRefNo();
        }
        returnString += "[No{Objeto=" + auxNo.getObject() + "}]->null\n"; // Last

        returnString += "\n==================\n";
        return returnString;
    }
}
