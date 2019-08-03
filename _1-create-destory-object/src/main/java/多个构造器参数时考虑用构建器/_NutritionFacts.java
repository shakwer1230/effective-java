package 多个构造器参数时考虑用构建器;

/**
 * javabean模式
 *
 * 缺点：
 *   构造过程被分到几个调用的过程中，构造可能处于不一致的状态
 */
public class _NutritionFacts {
    private   int servingSize=-1;
    private   int servings=-1;
    private   int calories=0;
    private   int fat=0;
    private   int sodium=0;
    private   int carbohydrate=0;

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public static void main(String []args){
        _NutritionFacts cocaCola=new _NutritionFacts();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
    }


}
