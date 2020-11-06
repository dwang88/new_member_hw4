interface Burger {
    public int returnCalories();
    public String returnIngredients();
}
interface Fries {
    public String eatLoudly();
    public int returnCalories();

}
public class McDonaldsFryBurger implements Burger, Fries {
    public String eatLoudly() {
        return "Eating loudly...";
    }

    public int returnCalories() {
        return 1023123;
    }

    public String returnIngredients() {
        return "Lard";
    }

    public static void main(String[] args) {
        McDonaldsFryBurger burger = new McDonaldsFryBurger();

        System.out.println(burger.eatLoudly());
        System.out.println(burger.returnIngredients());
        System.out.println(burger.returnCalories());
    }
}