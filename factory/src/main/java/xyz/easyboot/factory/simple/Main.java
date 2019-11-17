package xyz.easyboot.factory.simple;

/**
 *
 * 简单工厂
 *
 * https://www.javazhiyin.com/41806.html
 *
 * 客户端
 *
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/17
 */
public class Main {

    public static void main(String[] args) {
        IFood fishFood = FoodFactory.getFood(FoodType.FISH);
        fishFood.showFood();

        IFood riceFood = FoodFactory.getFood(FoodType.RICE);
        riceFood.showFood();
    }

}
