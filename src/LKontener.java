import java.util.UUID;

public class LKontener extends Kontener implements IHazardNotifier  {
private String  id;
   public LKontener(int cargomass_kg, int height_cm, int depth_cm,int self_mass_kg, int max_cargo_mass) {
       super(cargomass_kg,height_cm,depth_cm,self_mass_kg,max_cargo_mass);
        this.id="KON-"+"L-"+ UUID.randomUUID();
    }

    @Override
    public void NotifyHazard() {
        System.out.println("Niebezpieczna_sytuacja"+this.id);
    }

    public void loadcargo(int kg,boolean danger_cargo) throws Exception {

        super.loadcargo(kg);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
