package xyz.easyboot.factory.abstract_;

/**
 *
 * 实际产品：可乐
 *
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/18
 */
public class ColaDrink implements IDrink{
    public void showDrink() {
        System.out.println("一瓶可乐");
    }
}
