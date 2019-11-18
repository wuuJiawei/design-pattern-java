package xyz.easyboot.factory.method;

import xyz.easyboot.factory.simple.IFood;
import xyz.easyboot.factory.simple.RiceFood;

/**
 * 工厂类：生产大米
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/17
 */
public class RiceFoodFactory implements IFoodFactory{

    public IFood createFood() {
        return new RiceFood();
    }

}
