package cl.aiep;

public class Ave extends Animal {

            private String tipoPico;

            public Ave(String name, int age, String tipoPico) {
                super(name, age);
                this.tipoPico = tipoPico;
            }

            @Override
            public void print() {
                super.print();
                System.out.println("Tipo de pico: " + tipoPico);
            }

            @Override
            public void comer() {
                System.out.println("ñam ñam, comiendo con el pico");
            }

            @Override
            public void dormir() {
                System.out.println("zzzz, durmiendo en el nido");
            }

            public void volar() {
                System.out.println("Volando");
            }

            public String getTipoPico() {
                return tipoPico;
            }

            public void setTipoPico(String tipoPico) {
                this.tipoPico = tipoPico;
            }
}
