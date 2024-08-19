package com.collections;

import java.util.*;

public class Maps {

    public Map<String, Integer> createInventory(List<String> items) {
        Map<String, Integer> inventory = new HashMap<>();

        for (String item : items)
            inventory.put(item, inventory.getOrDefault(item, 0) + 1);

        return inventory;
    }

    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        Map<String, Integer> new_inventory = new HashMap<>(inventory);

        for (String item : items)
            new_inventory.put(item, new_inventory.getOrDefault(item, 0) + 1);

        return new_inventory;
    }

    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        Map<String, Integer> new_inventory = new HashMap<>(inventory);

        for (String item : items) {
            Integer value = new_inventory.getOrDefault(item, 0);

            if (value == 0) continue;
            new_inventory.put(item, value - 1);
        }

        return new_inventory;
    }

    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        Map<String, Integer> new_inventory = new HashMap<>();

        for (String key : inventory.keySet())
            if (!Objects.equals(key, item))
                new_inventory.put(key, inventory.get(key));

        return new_inventory;
    }

    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        List<Map.Entry<String, Integer>> list_inventory = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == 0) continue;

            list_inventory.add(new AbstractMap.SimpleEntry<>(entry.getKey(), entry.getValue()));
        }

        return list_inventory;
    }
}