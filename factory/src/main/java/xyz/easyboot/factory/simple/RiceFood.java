package xyz.easyboot.factory.simple;

/**
 * 具体产品：米（食物）
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/17
 */
public class RiceFood implements IFood {
    public void showFood() {
        System.out.println("一碗白米饭");
    }
}
