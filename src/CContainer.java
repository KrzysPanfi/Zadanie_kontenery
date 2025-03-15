public class CContainer extends Container {
    private Cargo cargo;
    private Double temperature;

    public CContainer(double temperature, Cargo cargo, double cargomass_kg, int height_cm,
                      int depth_cm, int self_mass_kg, int max_cargo_mass) {
        super(cargomass_kg, height_cm, depth_cm, self_mass_kg, max_cargo_mass);
        setTemperature(temperature);
        this.cargo=cargo;
        setId("KON-" + "C-" + getId());
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        if (temperature >= cargo.getTemperature()) {
            this.temperature = temperature;
        }
        else {
            System.out.println("Temperature too low");
        }
    }
}
