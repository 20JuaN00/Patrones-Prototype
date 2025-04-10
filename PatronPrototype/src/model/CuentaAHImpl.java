package model;
import inter.ICuenta;

public class CuentaAHImpl implements ICuenta,Cloneable {
    private String tipo;
    private double monto;
    
    public  CuentaAHImpl() {
        tipo = "AHORRO";
    }
    
    public ICuenta clonar() {
        CuentaAHImpl cuenta = null;
        
        try {
            cuenta = (CuentaAHImpl) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    return cuenta;
    }


    @Override
    public String toString(){
    return "CuentaAHImp1 (Tipo="+ tipo + ", Monto="+ monto + ")";
        }
public void setMonto (double monto){
    this.monto = monto;
}
public double getMonto(){
    return monto;
}
}