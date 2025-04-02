# Real Estate Management System

A Java based real estate management system that handles different types of properties (houses, villas, and summer houses) with various calculations and filtering capabilities.

## Features

- Manage different types of properties (House, Villa, Summer House)
- Calculate total prices for each property type
- Calculate average areas for each property type
- Filter properties based on room count and living room count
- Simple and clean object-oriented design

## Classes Overview

- `Estate`: Base class containing common properties (price, area, room count, etc.)
- `EstateType`: Enum defining different types of properties (HOUSE, VILLA, SUMMER_HOUSE)
- `EstateCatalog`: Manages the collection of all estates
- `EstateCalculator`: Performs calculations and filtering operations
- `Main`: Application entry point with user interaction

## Usage

1. Clone the repository
2. Compile the Java files
3. Run the Main class
4. Follow the on-screen instructions.

## Example Output

```
=== Total Prices ===
Total House Price: 2250000.00 TL
Total Villa Price: 7500000.00 TL
Total Summer House Price: 3000000.00 TL
Total Price of All Properties: 12750000.00 TL

=== Average Areas ===
Average House Area: 125.75 m²
Average Villa Area: 275.25 m²
Average Summer House Area: 150.50 m²
Average Area of All Properties: 183.83 m²

=== Filter Properties ===
Enter room count: 3
Enter living room count: 1
```
