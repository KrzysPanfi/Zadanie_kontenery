public  class Kontener {
    private Cargo cargo;
    private int cargomass_kg;
    private int height_cm;
    private int self_mass_kg;
    private int depth_cm;
    private int max_cargo_mass;


    public Kontener(int cargomass_kg, int height_cm, int depth_cm,int self_mass_kg, int max_cargo_mass, Cargo cargo) {
        this.cargomass_kg = cargomass_kg;
        this.height_cm = height_cm;
        this.depth_cm=depth_cm;
        this.self_mass_kg = self_mass_kg;
        this.max_cargo_mass = max_cargo_mass;
        this.cargo=cargo;

    }
    public void emptyCargo(){
        cargomass_kg=0;
    }
    public void loadcargo(int kg) throws Exception  {

        try {
            if (this.cargomass_kg+kg > this.max_cargo_mass) {
                throw new OverfillException();
            }
            else {
                this.cargomass_kg=this.cargomass_kg+kg;
            }
        }
        catch (OverfillException e){
            System.out.println("Przepelninie");
        }

    }

    public int getCargomass_kg() {
        return cargomass_kg;
    }

    public void setCargomass_kg(int cargomass_kg) {
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

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}

