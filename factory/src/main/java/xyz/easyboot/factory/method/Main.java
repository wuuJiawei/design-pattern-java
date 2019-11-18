package xyz.easyboot.factory.method;

/**
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/17
 */
public class Main {

    public static void main(String[] args) {
        // 从店里的鱼柜买鱼
        FishFoodFactory fishFoodFactory = new FishFoodFactory();
        fishFoodFactory.createFood().showFood();

        // 从店里的米柜买米
        RiceFoodFactory riceFoodFactory = new RiceFoodFactory();
        riceFoodFactory.createFood().showFood();
    }

}
