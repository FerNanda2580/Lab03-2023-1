package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;
    
    

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
        if (cabeca == null) {
            return -1;
        } else {
            int contador = 0;
            No bus = cabeca;

            while (bus != null) {
                if (bus.getValor() == valor) {
                    return contador;
                }
                bus = bus.getProximo();
                contador++;
            }

            return -1;
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
        if (cabeca == null) {
            cabeca = new No(valor);
        } else {
            No novoNo = new No(valor);
            No nFim = cabeca;

            while (nFim.getProximo() != null) {
                nFim = nFim.getProximo();
            }

            nFim.setProximo(novoNo);
        }
  
        
    }

    @Override
    public void remove(int valor) {
       
    }

    @Override
    public void removeIndice(int indice) {
        No rI = cabeca;
        if (cabeca == null) {
            cabeca = null;
        }
        int contador = 0;

        while (rI != null) {
            if (contador == indice) {
                remove(indice);
            }
            rI = rI.getProximo();
            contador++;

        }
       
    }

    @Override
    public void removeInicio() {
        if (cabeca == null) {
            cabeca = null;
        } else {
            cabeca = cabeca.getProximo();
        }
        
    }

    @Override
    public void removeFim() {
       
        
        
    }
    
}
