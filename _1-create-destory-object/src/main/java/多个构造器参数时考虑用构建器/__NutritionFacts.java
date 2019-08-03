package 多个构造器参数时考虑用构建器;

/**
 * builder模式
 * 容易编写，易于阅读
 * builder 对参数强加约束条件 这点与setter方法类似
 * 多个参数时候使用
 */
public class __NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder{
        //required parameters
        private final int servingSize;
        private final int servings;
        //optional parameters
        private int calories=0;
        private int fat=0;
        private int carbohydrates=0;
        private int sodium=0;

        public Builder(int servingSize,int servings){
            this.servingSize=servingSize;
            this.servings=servings;
        }

        public Builder calories(int val){
            calories=val;
            return this;
        }
        public Builder fat(int val){
            fat=val;
            return this;
        }

        public Builder carbohydrates(int val){
            carbohydrates=val;
            return this;
        }

        public Builder sodium(int val){
            sodium=val;
            return this;
        }

        public __NutritionFacts build(){
            return new __NutritionFacts(this);
        }
    }

    public __NutritionFacts(Builder builder){
        servingSize=builder.servingSize;
        servings=builder.servings;
        calories=builder.calories;
        fat=builder.fat;
        carbohydrate=builder.carbohydrates;
        sodium=builder.sodium;
    }

    public static  void main(String[]args){
        __NutritionFacts cocaCola=new Builder(240,8).calories(100).sodium(35).carbohydrates(27).fat(100).build();
    }
}
