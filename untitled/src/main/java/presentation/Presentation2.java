
package presentation;

import metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"dao", "metier"})
public class Presentation2 {

    public static void main(String[] args) {

        // Initialiser le conteneur Spring
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Presentation2.class);

        try {
            // Obtenir le service métier
            IMetier service = context.getBean(IMetier.class);

            // Lancer le calcul
            double resultat = service.calcul();

            // Afficher le résultat
            System.out.println("Le résultat du calcul est : " + resultat);

        } finally {
            // Fermer le contexte Spring
            context.close();
        }
    }
}
