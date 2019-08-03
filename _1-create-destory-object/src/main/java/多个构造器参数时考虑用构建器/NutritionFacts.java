package 多个构造器参数时考虑用构建器;

/**
 * 传统的构造器
 * 当许多参数的时候，客户端很难写，也很难阅读
 */
public class NutritionFacts {
    // required parameters
    private final int servingSize;
    private final int servings;
    //optional parameters
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFacts(int servingSize,int servings){
        this(servingSize,servings,0);
    }

    public  NutritionFacts(int servingSize,int servings,int calories){
        this(servingSize,servings,calories,0);
    }
    public NutritionFacts(int servingSize,int servings,int calories,int fat){
        this(servingSize,servings,calories,fat,0);

    }
    public NutritionFacts(int servingSize,int servings,int calories,int fat,int sodium){
        this(servingSize,servings,calories,fat,sodium,0);
    }
    public NutritionFacts(int servingSize,int servings, int calories,int fat,int sodium,int carbohydrate){
        this.servingSize=servingSize;
        this.servings=servings;
        this.calories=calories;
        this.fat=fat;
        this.sodium=sodium;
        this.carbohydrate=carbohydrate;
    }

}
