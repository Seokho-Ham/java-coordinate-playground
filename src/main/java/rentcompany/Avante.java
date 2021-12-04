package rentcompany;

public class Avante extends Car {
    public Avante(int tripDistance) {
        this.carName = "Avante";
        this.fuelEfficiency = 15;
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
