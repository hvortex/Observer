public class DepartamentoCompras implements Observer {
    
    @Override
    public void update(String message) {
        System.out.println("Departamento de Compras: " + message);
    }
}