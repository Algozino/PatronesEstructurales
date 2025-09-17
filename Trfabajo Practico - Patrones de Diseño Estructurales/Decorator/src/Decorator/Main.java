//En este ejercicio el patron ayuda a añadir dinamicamente extras (como HD, UltraHD y Descargar)
//a un plan basico de subscripcion, lo que nos soluciona tener que contemplar combinaciones de
//clases derivadas de PlanBase, PlanHD, PlanUltraHD, y PlanDescarga

package Decorator;

public class Main {
    public static void main(String[] args) {
        // Plan básico
        Plan plan1 = new PlanBasico();
        System.out.println(plan1.getDescripcion() + " = $" + plan1.getCosto());

        // Básico + HD
        Plan plan2 = new HD(new PlanBasico());
        System.out.println(plan2.getDescripcion() + " = $" + plan2.getCosto());

        // Básico + UltraHD + Descargas
        Plan plan3 = new Descargas(new UltraHD(new PlanBasico()));
        System.out.println(plan3.getDescripcion() + " = $" + plan3.getCosto());

        // Básico + HD + UltraHD + Descargas
        Plan plan4 = new Descargas(new UltraHD(new HD(new PlanBasico())));
        System.out.println(plan4.getDescripcion() + " = $" + plan4.getCosto());
    }
}
