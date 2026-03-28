/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anoni
 */
public class empleado extends persona implements Mensaje{
    
    private String puesto;
    private double salario;

    
    public empleado(){
    super();
    this.puesto="";
    this.salario=0;
    
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public empleado(String puesto, double salario) {
        this.puesto = puesto;
        this.salario = salario;
    }
    
}
