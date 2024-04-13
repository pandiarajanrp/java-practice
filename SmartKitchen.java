class KitchenWork {
    protected boolean hasWorkToDO;
    public void setHasWorkToDO(boolean hasWorkToDO) {
        this.hasWorkToDO = hasWorkToDO;
    }

    public void doTheWork(String work) {
        if(!this.hasWorkToDO) return;
        System.out.println(work);
    }
}
class Refregirator extends KitchenWork {
    public void addWater() {
        this.doTheWork("Add Water");
    }
}

class DishWasher extends KitchenWork {
    public void loadDishwasher() {
        this.doTheWork("Load Dish Washer");
    }
}

class CoffeeMaker extends KitchenWork {
    public void pourMilk() {
        this.doTheWork("Pour Milk");
    }
}

public class SmartKitchen {
    private Refregirator refregirator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen(Refregirator refregirator, CoffeeMaker coffeeMaker, DishWasher dishWasher) {
        this.refregirator = refregirator;
        this.dishWasher = dishWasher;
        this.coffeeMaker = coffeeMaker;
    }
    public void setKitchenState(Boolean refrigatorState, Boolean coffeeMakerState, Boolean dishWashState) {
        this.refregirator.setHasWorkToDO(refrigatorState);
        this.dishWasher.setHasWorkToDO(dishWashState);
        this.coffeeMaker.setHasWorkToDO(coffeeMakerState);
    }

    public void doKitchenWork() {
        this.refregirator.addWater();
        this.coffeeMaker.pourMilk();
        this.dishWasher.loadDishwasher();
    }
}

class MyKitchen {
    public static void main(String[] args) {
        Refregirator refregirator = new Refregirator();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        DishWasher dishWasher = new DishWasher();
        SmartKitchen smartKitchen = new SmartKitchen(refregirator, coffeeMaker, dishWasher);
        smartKitchen.setKitchenState(true, false, true);
        smartKitchen.doKitchenWork();
    }
}
