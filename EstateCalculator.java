import java.util.ArrayList;
import java.util.List;

public class EstateCalculator {
    private EstateCatalog estateCatalog;

    public EstateCalculator(EstateCatalog estateCatalog) {
        this.estateCatalog = estateCatalog;
    }

    // Calculate total price for all houses
    public double getTotalHousePrice() {
        double total = 0;
        for (Estate estate : estateCatalog.getEstatesByType(Estate.EstateType.HOUSE)) {
            total += estate.getPrice();
        }
        return total;
    }

    // Calculate total price for all villas
    public double getTotalVillaPrice() {
        double total = 0;
        for (Estate estate : estateCatalog.getEstatesByType(Estate.EstateType.VILLA)) {
            total += estate.getPrice();
        }
        return total;
    }

    // Calculate total price for all summer houses
    public double getTotalSummerHousePrice() {
        double total = 0;
        for (Estate estate : estateCatalog.getEstatesByType(Estate.EstateType.SUMMER_HOUSE)) {
            total += estate.getPrice();
        }
        return total;
    }

    // Calculate total price for all properties
    public double getTotalPrice() {
        return getTotalHousePrice() + getTotalVillaPrice() + getTotalSummerHousePrice();
    }

    // Calculate average area for houses
    public double getAverageHouseArea() {
        List<Estate> houses = estateCatalog.getEstatesByType(Estate.EstateType.HOUSE);
        if (houses.isEmpty()) return 0;
        
        double total = 0;
        for (Estate estate : houses) {
            total += estate.getArea();
        }
        return total / houses.size();
    }

    // Calculate average area for villas
    public double getAverageVillaArea() {
        List<Estate> villas = estateCatalog.getEstatesByType(Estate.EstateType.VILLA);
        if (villas.isEmpty()) return 0;
        
        double total = 0;
        for (Estate estate : villas) {
            total += estate.getArea();
        }
        return total / villas.size();
    }

    // Calculate average area for summer houses
    public double getAverageSummerHouseArea() {
        List<Estate> summerHouses = estateCatalog.getEstatesByType(Estate.EstateType.SUMMER_HOUSE);
        if (summerHouses.isEmpty()) return 0;
        
        double total = 0;
        for (Estate estate : summerHouses) {
            total += estate.getArea();
        }
        return total / summerHouses.size();
    }

    // Calculate average area for all properties
    public double getAverageArea() {
        List<Estate> allEstates = estateCatalog.getAllEstates();
        if (allEstates.isEmpty()) return 0;
        
        double total = 0;
        for (Estate estate : allEstates) {
            total += estate.getArea();
        }
        return total / allEstates.size();
    }

    public List<Estate> filterByRoomAndLivingRoomCount(int roomCount, int livingRoomCount) {
        List<Estate> filteredEstates = new ArrayList<>();
        
        for (Estate estate : estateCatalog.getAllEstates()) {
            if (estate.getRoomCount() == roomCount && estate.getLivingRoomCount() == livingRoomCount) {
                filteredEstates.add(estate);
            }
        }
        
        return filteredEstates;
    }
} 