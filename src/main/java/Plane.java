public class Plane {
    public Boolean land(Airport airport) {
        return airport.clearForLanding(this);
    }


    public Boolean takeOff(Airport airport) {
        return airport.clearForTakeOff(this);
    }
}
