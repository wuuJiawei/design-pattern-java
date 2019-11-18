package xyz.easyboot.factory.abstract_;

import xyz.easyboot.factory.simple.IFood;
import xyz.easyboot.factory.simple.RiceFood;

/**
 *
 * 抽象工厂实现类：生产具体的食物和饮料
 *
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/18
 */
public class RiceAndColaFactory implements AbstractFactory{
    public IFood getFood() {
        return new RiceFood();
    }

    public IDrink getDrink() {
        return new ColaDrink();
    }
}
