public class LContainer extends Container implements IHazardNotifier  {
private boolean dangercargo;
   public LContainer(boolean dangercargo, int cargomass_kg, int height_cm,
                     int depth_cm, int self_mass_kg, int max_cargo_mass) {
       super(cargomass_kg,height_cm,depth_cm,self_mass_kg,max_cargo_mass);
       setId(" KON-" + "L-" + getId());
        this.dangercargo=dangercargo;
    }

    @Override
    public void NotifyHazard() {
        System.out.println
                ("Dangerous operation" + getId());
    }

    public void loadcargo(int kg) throws OverfillException {
        double per;
       if(this.dangercargo){
       per = 0.5;
       }
       else {
           per = 0.9;
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

    public boolean isDangercargo() {
        return dangercargo;
    }

    public void setDangercargo(boolean dangercargo) {
        this.dangercargo = dangercargo;
    }
}
