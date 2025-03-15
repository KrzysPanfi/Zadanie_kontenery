import java.util.Objects;

public  class Container {
    private double cargomass_kg;
    private int height_cm;
    private int self_mass_kg;
    private int depth_cm;
    private int max_cargo_mass;
    private String id;


    public Container(double cargomass_kg, int height_cm, int depth_cm,
                     int self_mass_kg, int max_cargo_mass) {
        this.cargomass_kg = cargomass_kg;
        this.height_cm = height_cm;
        this.depth_cm=depth_cm;
        this.self_mass_kg = self_mass_kg;
        this.max_cargo_mass = max_cargo_mass;
        this.id=null;
    }
    public void emptyCargo(){
        cargomass_kg=0;
    }
    public void loadcargo(int kg) throws Exception  {

        try {
            if (this.cargomass_kg+kg > this.max_cargo_mass) {
                throw new OverfillException("Overfill of container");
            }
            else {
                this.cargomass_kg=this.cargomass_kg+kg;
            }
        }
        catch (OverfillException e){
            System.out.println(e.getMessage());
        }

    }

    public int getCargomass_kg() {
        return (int) cargomass_kg;
    }

    public void setCargomass_kg(double cargomass_kg) {
        this.cargomass_kg = cargomass_kg;
    }

    public int getHeight_cm() {
        return height_cm;
    }

    public void setHeight_cm(int height_cm) {
        this.height_cm = height_cm;
    }

    public int getSelf_mass_kg() {
        return self_mass_kg;
    }

    public void setSelf_mass_kg(int self_mass_kg) {
        this.self_mass_kg = self_mass_kg;
    }

    public int getDepth_cm() {
        return depth_cm;
    }

    public void setDepth_cm(int depth_cm) {
        this.depth_cm = depth_cm;
    }

    public int getMax_cargo_mass() {
        return max_cargo_mass;
    }

    public void setMax_cargo_mass(int max_cargo_mass) {
        this.max_cargo_mass = max_cargo_mass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container container = (Container) o;
        return Double.compare(getCargomass_kg(), container.getCargomass_kg()) == 0 && getHeight_cm() == container.getHeight_cm() && getSelf_mass_kg() == container.getSelf_mass_kg() && getDepth_cm() == container.getDepth_cm() && getMax_cargo_mass() == container.getMax_cargo_mass() && Objects.equals(getId(), container.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCargomass_kg(), getHeight_cm(), getSelf_mass_kg(), getDepth_cm(), getMax_cargo_mass(), getId());
    }

    @Override
    public String toString() {
        return "Container{" +
                "cargomass_kg=" + cargomass_kg +
                ", height_cm=" + height_cm +
                ", self_mass_kg=" + self_mass_kg +
                ", depth_cm=" + depth_cm +
                ", max_cargo_mass=" + max_cargo_mass +
                ", id='" + id + '\'' +
                '}';
    }
}

