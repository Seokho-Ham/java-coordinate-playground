package rentcompany;

public class Sonata extends Car {
    public Sonata(int tripDistance) {
        this.carName = "Sonata";
        this.fuelEfficiency = 10;
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
