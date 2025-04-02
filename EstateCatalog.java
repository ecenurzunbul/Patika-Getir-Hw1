import java.util.ArrayList;
import java.util.List;

public class EstateCatalog {
    private List<Estate> estates;

    public EstateCatalog() {
        this.estates = new ArrayList<>();
        initializeProperties();
    }

    private void initializeProperties() {
        // Initialize houses
        estates.add(new Estate(750000, 125.75, 3, 1, Estate.EstateType.HOUSE));
        estates.add(new Estate(950000, 165.25, 4, 2, Estate.EstateType.HOUSE));
        estates.add(new Estate(1200000, 185.50, 5, 2, Estate.EstateType.HOUSE));

        // Initialize villas
        estates.add(new Estate(2500000, 275.25, 5, 2, Estate.EstateType.VILLA));
        estates.add(new Estate(3500000, 325.75, 6, 3, Estate.EstateType.VILLA));
        estates.add(new Estate(4500000, 375.50, 7, 3, Estate.EstateType.VILLA));

        // Initialize summer houses
        estates.add(new Estate(950000, 155.25, 3, 1, Estate.EstateType.SUMMER_HOUSE));
        estates.add(new Estate(1250000, 185.75, 4, 2, Estate.EstateType.SUMMER_HOUSE));
        estates.add(new Estate(1500000, 205.25, 4, 2, Estate.EstateType.SUMMER_HOUSE));
    }

    public List<Estate> getEstatesByType(Estate.EstateType type) {
        List<Estate> filteredEstates = new ArrayList<>();
        for (Estate estate : estates) {
            if (estate.getType() == type) {
                filteredEstates.add(estate);
            }
        }
        return filteredEstates;
    }

    public List<Estate> getAllEstates() {
        return estates;
    }
} 