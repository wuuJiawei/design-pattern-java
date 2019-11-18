package xyz.easyboot.factory.method;

import xyz.easyboot.factory.simple.FishFood;
import xyz.easyboot.factory.simple.IFood;

/**
 * 工厂角色：生产鱼
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/17
 */
public class FishFoodFactory implements IFoodFactory{
    public IFood createFood() {
        return new FishFood();
    }
}
