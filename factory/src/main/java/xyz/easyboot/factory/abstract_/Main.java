package xyz.easyboot.factory.abstract_;

import xyz.easyboot.factory.simple.FishFood;
import xyz.easyboot.factory.simple.IFood;
import xyz.easyboot.factory.simple.RiceFood;

/**
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/18
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new RiceAndColaFactory();
        IFood riceFood = factory.getFood();
        riceFood.showFood();
        factory.getDrink().showDrink();


        AbstractFactory factory2 = new FishAndSpriteFactory();
        factory2.getFood().showFood();
        factory2.getDrink().showDrink();


    }

}
