package entities;

public class Triangle {
    
    public double a;
    public double b;
    public double c;
    

    // Não precisa receber os dados de A,B e C pois já estão na classe.
    public double area(){

        double p = (a + b +c) / 2.0;

        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        
        return result;
        
    }
}
