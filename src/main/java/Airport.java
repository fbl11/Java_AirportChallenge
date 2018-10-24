import java.util.LinkedList;
import java.util.List;

public class Airport {
    private List<Plane> planeList;  //  planeList = null, until initiated in constructor

    public Airport() {
        planeList = new LinkedList<>(); // supports remove
    }

    public List<Plane> getPlaneList() {
        return planeList;
    }

    public void setPlaneList(List<Plane> planeList) {    // auto-created for attribute, same as getPlaneList
        this.planeList = planeList;
    }

    public Boolean clearForLanding(Plane plane) {
        planeList.add(plane);
        return true;
    }

    public Boolean clearForTakeOff(final Plane plane) {
        planeList.remove(plane);
        return true;
    }
}
