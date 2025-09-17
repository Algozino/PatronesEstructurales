package Decorator;

class PlanBasico implements Plan {
    @Override
    public String getDescripcion() {
        return "Plan Básico";
    }

    @Override
    public double getCosto() {
        return 1000;
    }
}
