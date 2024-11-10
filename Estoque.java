public interface Estoque {
    void registrarObservador(Observer observador);
    void removerObservador(Observer observador);
    void notificarObservadores(String mensagem);
}