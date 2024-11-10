import java.util.ArrayList;
import java.util.List;

public class EstoqueProduto implements Estoque {
    private List<Observer> observadores = new ArrayList<>();
    private Produto produto;
    private int quantidade;

    public EstoqueProduto(Produto produto, int quantidadeInicial) {
        this.produto = produto;
        this.quantidade = quantidadeInicial;
    }

    @Override
    public void registrarObservador(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (Observer observador : observadores) {
            observador.update(mensagem);
        }
    }

    public void reabastecer(int quantidade) {
        this.quantidade += quantidade;
        if (this.quantidade > 0) {
            notificarObservadores("Produto " + produto.getNome() + " está disponível novamente.");
        }
    }
}