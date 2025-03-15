import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        LContainer lContainer1 = new LContainer(true, 15, 100, 30, 4, 40);
        lContainer1.loadcargo(18);
        ArrayList<Container> containers = new ArrayList<>();
        ArrayList<Container> containers1 = new ArrayList<>();
        Containership containership1 = new Containership(containers, 10, 1000, 100000);
        Containership containership2 = new Containership(containers1, 100, 1000, 100000);
        GContainer gContainer1 = new GContainer(15, 100, 30, 4, 40, 2.5);
        containership2.loadcontainer(lContainer1);
        containership2.loadcontainer(lContainer1);
        LContainer lContainer2 = new LContainer(false, 1000, 20, 10, 10, 100000);
        //containership1.loadcontainer(lContainer2);
        gContainer1.emptyCargo();
        containership2.unloadcontainer(lContainer1);
        //lContainer1.emptyCargo();
        //ArrayList<Container> list=new ArrayList<>();
        // list.add(gContainer1);
        // list.add(lContainer1);
        //  containership1.loadlistofcontainers(list);
        //containership2.replacecontainer(0,lContainer2);
        containership2.transfercontainer(lContainer1, containership1);
        System.out.println(lContainer1);
        System.out.println(lContainer2);
        System.out.println(gContainer1);
        System.out.println(containership1);
        System.out.println(containership2);
    }
}