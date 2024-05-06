package cl.aiep;

public class Reptil extends Animal {

        private String tipoPiel;

        public Reptil(String name, int age, String tipoPiel) {
            super(name, age);
            this.tipoPiel = tipoPiel;
        }

        @Override
        public void print() {
            super.print();
            System.out.println("Tipo de piel: " + tipoPiel);
        }

        @Override
        public void comer() {
            System.out.println("ñam ñam, comiendo con los dientes");
        }

        @Override
        public void dormir() {
            System.out.println("zzzz, durmiendo en el coliseo de Roma ");
        }

        public void mudarPiel() {
            System.out.println("Mudando piel");
        }

        public String getTipoPiel() {
            return tipoPiel;
        }

        public void setTipoPiel(String tipoPiel) {
            this.tipoPiel = tipoPiel;
        }
}
