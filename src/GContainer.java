import java.util.UUID;

public class GContainer extends Container implements IHazardNotifier  {
    private Double pressure_atm;
   public GContainer(int cargomass_kg, int height_cm, int depth_cm,
                     int self_mass_kg, int max_cargo_mass, double pressure_atm) {
            super(cargomass_kg,height_cm,depth_cm,self_mass_kg,max_cargo_mass);
       setId("KON-"+"G-"+ UUID.randomUUID());
            this.pressure_atm=pressure_atm;
        }

        @Override
        public void NotifyHazard() {
            System.out.println("Dangerous_situation"
                    +getId());
        }


    public void emptyCargo(){
            setCargomass_kg(getCargomass_kg()*0.05);
        }

    public Double getPressure_atm() {
        return pressure_atm;
    }

    public void setPressure_atm(Double pressure_atm) {
        this.pressure_atm = pressure_atm;
    }
}
