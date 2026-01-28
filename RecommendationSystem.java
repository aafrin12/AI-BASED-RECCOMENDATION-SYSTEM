import java.util.*;



public class RecommendationSystem {

    public static void main(String[] args) {

        // Sample product data
        Map<String, List<String>> products = new HashMap<>();
        products.put("Laptop", Arrays.asList("electronics", "technology"));
        products.put("Smartphone", Arrays.asList("electronics", "mobile"));
        products.put("Headphones", Arrays.asList("electronics", "audio"));
        products.put("Book", Arrays.asList("education", "reading"));
        products.put("Notebook", Arrays.asList("education", "stationery"));

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your preference: ");
        String preference = sc.nextLine().toLowerCase();

        System.out.println("\nRecommended Products:");

        boolean found = false;

        
        for (Map.Entry<String, List<String>> entry : products.entrySet()) {
            if (entry.getValue().contains(preference)) {
                System.out.println("- " + entry.getKey());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No recommendations found for your preference.");
        }

        sc.close();
    }
}
