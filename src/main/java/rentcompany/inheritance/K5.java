package rentcompany.inheritance;

public class K5 extends Car {
    public K5(int tripDistance) {
        this.carName = "K5";
        this.fuelEfficiency = 13;
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return fuelEfficiency;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return carName;
    }
}
