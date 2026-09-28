package br.com.joaocarloslima;

public class Celeiro {
    int capacidade = 10;
    int qtdeBatatas;
    int qtdeCenouras;
    int qtdeMorangos;

    public void armazenarBatata() {
        if (qtdeBatatas + qtdeCenouras + qtdeMorangos <= 10) {
            qtdeBatatas += 2;
        } else {
            throw new RuntimeException();
        }
    }

    public void armazenarCenoura() {
        if (qtdeBatatas + qtdeCenouras + qtdeMorangos <= 10) {
            qtdeCenouras += 2;
        } else {
            throw new RuntimeException();
        }

    }

    public void armazenarMorango() {
        if (qtdeBatatas + qtdeCenouras + qtdeMorangos <= 10) {
            qtdeMorangos += 2;
        } else {
            throw new RuntimeException();
        }

    }

    public void consumirBatata() {
        if (qtdeBatatas != 0) {
            qtdeBatatas = -1;
        } else {
            throw new RuntimeException();
        }

    }

    public void consumirCenoura() {
        if (qtdeCenouras != 0) {
            qtdeCenouras = -1;
        } else {
            throw new RuntimeException();
        }
    }

    public void consumirMorango() {
        if (qtdeMorangos != 0) {
            qtdeMorangos = -1;
        } else {
            throw new RuntimeException();
        }
    }

    public int getEspacoDisponivel() {
        int espaco = (capacidade - (qtdeBatatas + qtdeCenouras + qtdeMorangos));

        return espaco;
    }

    public int getOcupacao(){
        int espaco = getEspacoDisponivel();
        int ocupacao = espaco/100;
        return ocupacao;
    }

    public boolean celeiroCheio(){
        if (capacidade == 10){
            return true;
        }else{
            return false;
        }

    }
        public int getQtdeBatatas() {
        return qtdeBatatas;
    }
 
    public int getQtdeCenouras() {
        return qtdeCenouras;
    }
 
    public int getQtdeMorangos() {
        return qtdeMorangos;
    }
}




