package rentcompany;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    public List<Car> cars = new ArrayList<>();
    public String reportList = "";

    public static RentCompany create() {
        return new RentCompany() ;
    }

    public String generateReport() {
        cars.stream().forEach(s->{
            reportList += s.getName() + " : " + (int)s.getChargeQuantity()+"리터" + NEWLINE;
        });
        return reportList;
    }

    public void addCar(Car car){
        cars.add(car);
    }
}
