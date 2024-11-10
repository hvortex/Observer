public class DepartamentoMarketing implements Observer {
    
    @Override
    public void update(String message) {
        System.out.println("Departamento de Marketing: " + message);
    }
}