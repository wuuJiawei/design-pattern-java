package xyz.easyboot.factory.abstract_;

import xyz.easyboot.factory.simple.FishFood;
import xyz.easyboot.factory.simple.IFood;

/**
 *
 * 工厂实现类
 *
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/18
 */
public class FishAndSpriteFactory implements AbstractFactory{


    public IFood getFood() {
        return new FishFood();
    }

    public IDrink getDrink() {
        return new SpriteDrink();
    }
}
