package org.example;
public class GameOver implements JogoEstado{
    private GameOver() {};
    private static GameOver instance = new GameOver();
    public static GameOver getInstance() {
        return instance;
    }
    public String getEstado() {
        return "GAME OVER!";
    }
    public String comecar(Jogo jogo) {
        return "Jogo não iniciado.";
    }
    public String jogar(Jogo jogo) {
        return "Jogo em andamendo não realizado.";
    }
    public String perder(Jogo jogo) {
        return "Game Over não realizado.";
    }
    public String ganhar(Jogo jogo) {
        return "Vitoria não realizada.";
    }
    public String pausar(Jogo jogo) {
        return "Jogo pausado não realizado.";
    }
}
