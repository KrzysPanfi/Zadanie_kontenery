import java.util.UUID;

public class LKontener extends Kontener implements IHazardNotifier  {
private String  id;
private boolean dangercargo;
   public LKontener(boolean dangercargo,int cargomass_kg, int height_cm, int depth_cm,int self_mass_kg, int max_cargo_mass) {
       super(cargomass_kg,height_cm,depth_cm,self_mass_kg,max_cargo_mass);
        this.id="KON-"+"L-"+ UUID.randomUUID();
        this.dangercargo=dangercargo;
    }

    @Override
    public void NotifyHazard() {
        System.out.println("Niebezpieczna_sytuacja"+this.id);
    }

    public void loadcargo(int kg) throws Exception {
        double per;
       if(this.dangercargo){
       per=0.5;
       }
       else {
           per=0.9;
       }
            try {
                if (this.getCargomass_kg() + kg > this.getMax_cargo_mass()*per) {
                    throw new OverfillException();
                }
                else {
                    this.setCargomass_kg(this.getCargomass_kg() + kg);
                }
            }
            catch (OverfillException e){
                NotifyHazard();
            }
        }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDangercargo() {
        return dangercargo;
    }

    public void setDangercargo(boolean dangercargo) {
        this.dangercargo = dangercargo;
    }
}
