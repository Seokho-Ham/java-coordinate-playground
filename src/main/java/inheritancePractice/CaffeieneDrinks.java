package inheritancePractice;

public abstract class CaffeieneDrinks {
    void boilWater(){
        System.out.println("물을 끓입니다.");
    }

    void pourInCup(){
        System.out.println("컵에 음료를 담습니다.");
    }
    void makeDrink(){
        boilWater();
        brew();
        pourInCup();
        addIngredients();
    }

    abstract void brew();
    abstract void addIngredients();
}
