package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {

    private static final int LINHAS = 13;
    private static final int COLUNAS = 13;

    private List<Terreno> terrenos;
    private Celeiro celeiro;

    public Fazenda() {
        this.celeiro = new Celeiro();
        this.terrenos = new ArrayList<>();

        // mesma ordem usada pelo Controller: índice = x * 13 + y
        for (int x = 0; x < LINHAS; x++) {
            for (int y = 0; y < COLUNAS; y++) {
                terrenos.add(new Terreno(x, y));
            }
        }
    }

    public void plantarBatata(int x, int y) {
        if (celeiro.getQtdeBatatas() == 0) {
            throw new RuntimeException("Não há batatas no celeiro!");
        }
        Terreno terreno = getTerreno(x, y);
        if (terreno.estaOcupado()) {
            throw new RuntimeException("O terreno já está ocupado!");
        }
        terreno.plantar(new Batata(1, 1, 3));
        celeiro.consumirBatata();
    }

    public void plantarCenoura(int x, int y) {
        if (celeiro.getQtdeCenouras() == 0) {
            throw new RuntimeException("Não há cenouras no celeiro!");
        }
        Terreno terreno = getTerreno(x, y);
        if (terreno.estaOcupado()) {
            throw new RuntimeException("O terreno já está ocupado!");
        }
        terreno.plantar(new Cenoura(1, 1, 3));
        celeiro.consumirCenoura();
    }

    public void plantarMorango(int x, int y) {
        if (celeiro.getQtdeMorangos() == 0) {
            throw new RuntimeException("Não há morangos no celeiro!");
        }
        Terreno terreno = getTerreno(x, y);
        if (terreno.estaOcupado()) {
            throw new RuntimeException("O terreno já está ocupado!");
        }
        terreno.plantar(new Morango(1, 1, 3));
        celeiro.consumirMorango();
    }

    public Terreno getTerreno(int x, int y) {
        if (x < 0 || x >= LINHAS || y < 0 || y >= COLUNAS) {
            throw new RuntimeException("Terreno inexistente!");
        }
        return terrenos.get(x * COLUNAS + y);
    }

    public void colher(int x, int y) {
        getTerreno(x, y).colher(celeiro);
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }
}