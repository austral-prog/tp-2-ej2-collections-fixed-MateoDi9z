package com.collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Arrays;

public class Sets {

    private static final Set<String> ALCOHOLS = new HashSet<>(Arrays.asList("whiskey", "whisky", "white rum", "dark rum", "bourbon", "rye", "scotch", "vodka",
            "tequila", "gin", "dry vermouth", "sweet vermouth", "prosecco","aperol", "brandy", "mezcal",
            "triple sec", "coffee liqueur", "almond liqueur", "champagne", "orange curacao", "rum"));

    public static String checkDrinks(String drink, List<String> drinks) {
        Set<String> intersection = new HashSet<>(ALCOHOLS); // Alcohols copy
        intersection.retainAll(drinks); // Alcohols & ingredients intersection

        if (!intersection.isEmpty()) return String.format("%s Cocktail", drink);
        return String.format("%s Mocktail", drink);
    }
}
