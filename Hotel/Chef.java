package LLD.Hotel;

public interface Chef {
    String [] dishes = {"Noodles", "Tea", "Coffee", "Sandwich", "ProteinShake", "Samosa"};
    void cookDishes();
    void orderName(String dish, int id);

    boolean isFoodCooked();
}
