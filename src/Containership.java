import java.util.ArrayList;
import java.util.List;

public class Containership {
    private ArrayList<Container> containers;
    private double max_vel_knots;
    private int max_capacity;
    private int max_weight_tons;
    private double currentmass_tons;

    public Containership(ArrayList<Container> containers,
                         double max_vel_knots, int max_capacity,
                         int max_weight_tons) {
        this.containers = containers;
        this.max_vel_knots = max_vel_knots;
        this.max_capacity = max_capacity;
        this.max_weight_tons = max_weight_tons;
        if(containers.isEmpty()){
            this.currentmass_tons=0;
        }
        else {
            for(Container c:containers){
                this.currentmass_tons=
                        this.currentmass_tons+c.getCargomass_kg()*0.001
                                +c.getSelf_mass_kg()*0.001;
            }
        }
    }
    public void loadcontainer(Container container) throws OverfillException{
      try {
          if (containers.size() > max_capacity && currentmass_tons + container.getSelf_mass_kg() * 0.001
                  + container.getCargomass_kg() * 0.001 < max_weight_tons) {
              containers.add(container);
              this.currentmass_tons =
                      this.currentmass_tons + container.getCargomass_kg() * 0.001 + container.getSelf_mass_kg() * 0.001;
          } else {
              throw new OverfillException("Overfill of container ship");
          }
      }
      catch (OverfillException e){
          System.out.println(e.getMessage());
      }
    }
    public void loadlistofcontainers(List<Container>List) throws OverfillException {
        for(Container c:List){
            loadcontainer(c);
        }
    }
    public void unloadcontainer(Container container){
        containers.remove(container);
    }
    //dany numer w zadaniu uznaje za indeks
    public void replacecontainer(int index,Container newcontainer){
                containers.set(index,newcontainer);
    }
    public void transfercontainer(Container container,Containership newcontainership){
        Container container1=searchcontainer(container);
        this.containers.remove(container1);
        newcontainership.containers.add(container1);
    }

    public ArrayList<Container> getContainers() {
        return containers;
    }

    public void setContainers(ArrayList<Container> konteners) {
        this.containers = konteners;
    }

    public double getMax_vel_in_knots() {
        return max_vel_knots;
    }

    public void setMax_vel_in_knots(double max_vel_in_knots) {
        this.max_vel_knots = max_vel_in_knots;
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public void setMax_capacity(int max_capacity) {
        this.max_capacity = max_capacity;
    }

    public int getMax_weight_in_tons() {
        return max_weight_tons;
    }

    public void setMax_weight_in_tons(int max_weight_in_tons) {
        this.max_weight_tons = max_weight_in_tons;

    }

    @Override
    public String toString() {
        return "Containership{" +
                "containers=" + containers +
                ", max_vel_knots=" + max_vel_knots +
                ", max_capacity=" + max_capacity +
                ", max_weight_tons=" + max_weight_tons +
                ", currentmass_tons=" + currentmass_tons +
                '}';
    }

    public Container searchcontainer(Container container){
        for(Container c:containers){
            if(c.equals(container)){
                return c;
            }
        }
        return null;

    }
}
