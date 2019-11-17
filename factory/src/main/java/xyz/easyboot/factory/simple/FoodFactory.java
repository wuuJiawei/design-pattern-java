package xyz.easyboot.factory.simple;

/**
 * 工厂角色：食物工厂，生产食物
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/17
 */
public class FoodFactory {

    /**
     * 提供静态方法，用于获取食物
     * @param foodType 食物类型
     * @return
     */
    public static IFood getFood(FoodType foodType) {
        IFood food = null;
        if (foodType == FoodType.FISH) {
            food = new FishFood();
        } else if (foodType == FoodType.RICE) {
            food = new RiceFood();
        }
        return food;
    }

}
