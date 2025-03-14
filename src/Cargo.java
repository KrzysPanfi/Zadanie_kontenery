public class Cargo {
    private String name;
    private boolean danger;
    private double temperature;

    public Cargo(String name, boolean danger, double temperature) {
        this.name = name;
        this.danger = danger;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDanger() {
        return danger;
    }

    public void setDanger(boolean danger) {
        this.danger = danger;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
