package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;
    private No cauda;
    

    public ListaLigada() {
        cabeca = null;

    }

    @Override
    public boolean buscaElemento(int valor) {
        No elem = cabeca; 

        while (elem != null) {
            if (elem.getValor() == valor) {
                return true; 
            }
            elem = elem.getProximo();
        }
    
        return false; 
      
     
    }

    @Override
    public int buscaIndice(int valor) {
        No atual = cabeca;
        int contador = 0;

        while (atual != null) {
            if (contador == indice) {
                return atual.getValor();
            }
            atual = atual.getProximo();
            contador++;
        } 
    
    }

    @Override
    public int minimo() {
       
    }

    @Override
    public int maximo() {
       
    }

    @Override
    public int predecessor(int valor) {
       
    }

    @Override
    public int sucessor(int valor) {
        
    }

    @Override
    public void insereElemento(int valor) {
        
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
       
    }

    @Override
    public void insereInicio(int valor) {
            if (this.cabeca == null) {
            this.cabeca = new No(valor);}
        else {
            No n = new No(valor);
            n.setProximo(this.cabeca);
            this.cabeca = n;
        }

    }

    @Override
    public void insereFim(int valor) {
        No noFim = new No(valor);

        if (this.cabeca == null) {
            this.cabeca = new No(valor);
            this.cauda = new No(valor);}
        else {
            this.cauda.setProximo(noFim);
            this.cauda = noFim;
        }
        
  
    }

    @Override
    public void remove(int valor) {
       
    }

    @Override
    public void removeIndice(int indice) {
       
    }

    @Override
    public void removeInicio() {
        
    }

    @Override
    public void removeFim() {
       
        
        
    }
    
}
