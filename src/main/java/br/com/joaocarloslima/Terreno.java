package br.com.joaocarloslima;

public class Terreno {
    int x;
    int y;
    Batata batata;
    Cenoura cenoura;
    Morango morango;


    public Terreno(int x, int y){
        this.x = x;
        this.y = y;

    }

    public void plantar(Batata batata){
        this.batata = batata;
    }

    public void plantar(Cenoura cenoura){
        this.cenoura = cenoura;
    }

    public void plantar(Morango morango){
        this.morango = morango;
    }

    public void colher(Celeiro celeiro){
        if (batata != null && batata.podeColher()){
            celeiro.armazenarBatata();
            batata = null;
        }
        if (cenoura != null && cenoura.podeColher()){
            celeiro.armazenarCenoura();
            cenoura = null;
        }
        if (morango != null && morango.podeColher()){
            celeiro.armazenarMorango();
            morango = null;
        }
    }

    public boolean estaOcupado(){
        if (batata == null && cenoura == null && morango == null){
            return false;
        }
        return true;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
