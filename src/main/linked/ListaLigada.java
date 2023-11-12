package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar {

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
        if (cabeca == null) {
            cabeca = null;
        }

        No mini = cabeca;
        int min = mini.getValor();

        while (mini != null) {
            if (mini.getValor() < min) {
                min = mini.getValor();
            }
            mini = mini.getProximo();
        }

        return min;

    }

    @Override
    public int maximo() {
        if (cabeca == null) {
            cabeca = null;
        }

        No maxi = cabeca;
        int max = maxi.getValor();

        while (maxi != null) {
            if (maxi.getValor() > max) {
                max = maxi.getValor();
            }
            maxi = maxi.getProximo();
        }

        return max;
    }

    @Override
    public int predecessor(int valor) {


    }

    @Override
    public int sucessor(int valor) {

    }

    @Override
    public void insereElemento(int valor) {
        No novoNo = new No(valor);

        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No elem = cabeca;
            while (elem.getProximo() != null) {
                elem = elem.getProximo();
            }
            elem.setProximo(novoNo);
        }
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        
   

    }

    @Override
    public void insereInicio(int valor) {
        if (this.cabeca == null) {
            this.cabeca = new No(valor);
        } else {
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
        if (cabeca == null) {

            return;
        } else if (cabeca.getValor() == valor) {

            cabeca = cabeca.getProximo();
        } else {
            No remo = cabeca;

            while (remo.getProximo() != null) {
                if (remo.getProximo().getValor() == valor) {
                    remo.setProximo(remo.getProximo().getProximo());
                } else {
                    remo = remo.getProximo();
                }
            }

            if (remo.getProximo() != null) {
                remo.setProximo(remo.getProximo().getProximo());
            }
        }

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
        if (cabeca == null) {
            cabeca = null;

        } else if (cabeca.getProximo() == null) {
            cabeca = null;
        } else {

            No penultimo = cabeca;
            while (penultimo.getProximo().getProximo() != null) {
                penultimo = penultimo.getProximo();
            }

            penultimo.setProximo(null);
        }

    }

}

