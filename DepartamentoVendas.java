public class DepartamentoVendas implements Observer {
    
    @Override
    public void update(String message) {
        System.out.println("Departamento de Vendas: " + message);
    }
}