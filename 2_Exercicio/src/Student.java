

public class Student {

    public String name;

    public double n1;

    public double n2;

    public double n3;

    public double soma(){
        return this.n1 + this.n2 + this.n3;
    }

    public double missing(){
        return 60 - soma();
    }
}
