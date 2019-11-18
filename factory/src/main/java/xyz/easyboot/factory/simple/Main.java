package xyz.easyboot.factory.simple;

/**
 *
 * 简单工厂
 *
 *
 * 客户端
 *
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/17
 */
public class Main {

    public static void main(String[] args) {
        // 从店里买鱼
        IFood fishFood = FoodFactory.getFood(FoodType.FISH);
        fishFood.showFood();

        // 从店里买米
        IFood riceFood = FoodFactory.getFood(FoodType.RICE);
        riceFood.showFood();
    }

}
