package Part5.Task_10;

class CookingRecipe {
    public void prepareRecipe() {
        boilWater();
        addIngredients();
        cook();
        serve();
    }
    private void boilWater() {
        System.out.println("Boiling water");
    }
    public void addIngredients() {
        System.out.println("Adding ingredients");
    }
    public void cook() {
        System.out.println("Cooking");
    }
    private void serve() {
        System.out.println("Serving");
    }
}
