package xyz.easyboot.factory.simple;

/**
 * 具体产品-鱼（食物）
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/17
 */
public class FishFood implements IFood{
    public void showFood() {
        System.out.println("一盘鲜美的鱼");
    }
}
