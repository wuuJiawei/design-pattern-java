package xyz.easyboot.factory.method;

import xyz.easyboot.factory.simple.IFood;

/**
 * 角色1：抽象工厂，负责获取食物
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/17
 */
public interface IFoodFactory {

    IFood createFood();

}
