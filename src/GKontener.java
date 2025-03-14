import java.util.UUID;

public class GKontener extends Kontener implements IHazardNotifier  {
        private String  id;
        private Double pressure_atm;
   public GKontener(int cargomass_kg, int height_cm, int depth_cm,
                    int self_mass_kg, int max_cargo_mass,double pressure_atm) {
            super(cargomass_kg,height_cm,depth_cm,self_mass_kg,max_cargo_mass);
            this.id="KON-"+"G-"+ UUID.randomUUID();
            this.pressure_atm=pressure_atm;
        }

        @Override
        public void NotifyHazard() {
            System.out.println("Niebezpieczna_sytuacja"+this.id);
        }


    public void emptyCargo(){
            setCargomass_kg(getCargomass_kg()*0.05);
        }
}
