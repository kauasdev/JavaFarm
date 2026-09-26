package br.com.joaocarloslima;

public class Morango {

    int tamanho = 1;
    int tempoDeVida = 1;
    int tempoDeCrescimento = 3;

    public Morango (int tamanho, int tempoDeVida, int tempoDeCrescimento){
        this.tamanho = tamanho;
        this.tempoDeVida = tempoDeVida;
        this.tempoDeCrescimento = tempoDeCrescimento;

    }

    public void crescer(){
        if (tempoDeVida == tempoDeCrescimento){
            this.tamanho++;
        }else{
            this.tempoDeVida++;
        }

    }

    public boolean podeColher(){
        if (this.tamanho == 4){
            return true;
        }else{
            return false;
        }
    }

    public String getImagem(){
        return "/images/moranga" + tamanho + ".png";
    }

    public int getTempoDeVida() {
        return tempoDeVida;
    }

    public void setTempoDeVida(int tempoDeVida) {
        this.tempoDeVida = tempoDeVida;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTempoDeCrescimento() {
        return tempoDeCrescimento;
    }

    public void setTempoDeCrescimento(int tempoDeCrescimento) {
        this.tempoDeCrescimento = tempoDeCrescimento;
    }
}
