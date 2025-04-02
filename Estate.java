public class Estate {
    private final double price;
    private final double area;
    private final int roomCount;
    private final int livingRoomCount;
    private final EstateType type;

    public enum EstateType {
        HOUSE,
        VILLA,
        SUMMER_HOUSE
    }

    public Estate(double price, double area, int roomCount, int livingRoomCount, EstateType type) {
        this.price = price;
        this.area = area;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public double getArea() {
        return area;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    public EstateType getType() {
        return type;
    }
} 