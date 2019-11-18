package xyz.easyboot.factory.abstract_;

import xyz.easyboot.factory.simple.IFood;

/**
 *
 * 抽象工厂：生产食物和饮料
 *
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/18
 */
public interface AbstractFactory {

    IFood getFood();

    IDrink getDrink();

}
