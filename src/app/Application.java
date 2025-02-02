package app;

public class Application {

        public static void main(String[] args) {
                Ami ami1 = new Ami("Paul", 3);
                Ami ami2 = new Ami("Sophie", 2);
                Ami ami3 = new Ami("Lucas", 4);

                afficherSituation(ami1, ami2, ami3);

                ami1.boitUneBiere();
                ami2.boitUneBiere();
                ami3.boitUneBiere();

                afficherSituation(ami1, ami2, ami3);
        }

        private static void afficherSituation(Ami... amis) {
                for (Ami ami : amis) {
                        System.out.println(
                                        ami.getNom() + " peut encore boire " + ami.getBieresRestantes() + " bieres.");
                }
        }
}
