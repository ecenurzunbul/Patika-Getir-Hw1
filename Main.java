import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EstateCatalog estateCatalog = new EstateCatalog();
        EstateCalculator estateCalculator = new EstateCalculator(estateCatalog);
        Scanner scanner = new Scanner(System.in);

        // Display total prices for all estate types
        System.out.printf("Total House Price: %.2f TL%n", estateCalculator.getTotalHousePrice());
        System.out.printf("Total Villa Price: %.2f TL%n", estateCalculator.getTotalVillaPrice());
        System.out.printf("Total Summer House Price: %.2f TL%n", estateCalculator.getTotalSummerHousePrice());
        System.out.printf("Total Price of All Properties: %.2f TL%n", estateCalculator.getTotalPrice());

        // Display average areas for all estate types
        System.out.printf("Average House Area: %.2f m²%n", estateCalculator.getAverageHouseArea());
        System.out.printf("Average Villa Area: %.2f m²%n", estateCalculator.getAverageVillaArea());
        System.out.printf("Average Summer House Area: %.2f m²%n", estateCalculator.getAverageSummerHouseArea());
        System.out.printf("Average Area of All Properties: %.2f m²%n", estateCalculator.getAverageArea());

        // Get filtering parameters from user
        System.out.println("\n--Filter Properties--");
        System.out.print("Enter room count: ");
        int roomCount = scanner.nextInt();
        
        System.out.print("Enter living room count: ");
        int livingRoomCount = scanner.nextInt();

        // Filter and display results
        List<Estate> filteredEstates = estateCalculator.filterByRoomAndLivingRoomCount(roomCount, livingRoomCount);
        
        if (filteredEstates.isEmpty()) {
            System.out.println("No properties found with the specified criteria.");
        } else {
            System.out.printf("\nProperties with %d Rooms and %d Living Rooms%n", 
                roomCount, livingRoomCount);
            for (Estate estate : filteredEstates) {
                System.out.printf("%s - Area: %.2f m², Price: %.2f TL%n", 
                    estate.getType(), estate.getArea(), estate.getPrice());
            }
        }

        scanner.close();
    }
} 