package App;
import model.CuentaAHImpl;

public class App {
   public static void main(String[] args){

    CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
    cuentaAhorro.setMonto(200);

    CuentaAHImpl cuentaAhorro2 = new CuentaAHImpl();

    CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.clonar();

    
}
}