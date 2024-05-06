package cl.aiep;

public class Mamifero extends Animal{

    private String raza;

    public Mamifero(String name, int age, String raza) {
        super(name, age);
        this.raza = raza;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("Raza: " + raza);
    }

    @Override
    public void comer(){
        System.out.println("ñam ñam, comiendo con la boca");
    }

    @Override
    public void dormir() {
        System.out.println("zzzz, durmiendo abrigadito");
    }

    public void amamantar() {
        System.out.println("Amamantando");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
