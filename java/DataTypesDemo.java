public class DataTypesDemo {
    public static void main(String[] args) {
        // 1. Whole Number (Integer) Types
        byte age = 25;
        short year = 2026;
        int populationCount = 1250000;
        long worldPopulation = 8100000000L; // Note the 'L' at the end for long

        // 2. Decimal (Floating-Point) Types
        float itemPrice = 19.99f;          // Note the 'f' at the end for float
        double exactPi = 3.14159265359;    // Standard choice for high precision decimals

        // 3. Character Type
        char studentGrade = 'A';           // Single quotes for a single character

        // 4. Boolean Type
        boolean isJavaFun = true;          // Only true or false

        // 5. Non-Primitive Type (Very common for text)
        String userName = "Alex";          // Double quotes for text strings

        // --- Printing all variables to the console ---
        System.out.println("--- User Profile ---");
        System.out.println("Name: " + userName);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Population Count: " + populationCount);
        System.out.println("World Population: " + worldPopulation);
        System.out.println("Item Price: $" + itemPrice);
        System.out.println("Value of Pi: " + exactPi);
        System.out.println("Grade: " + studentGrade);
        System.out.println("Is Java Fun? " + isJavaFun);
    }
}