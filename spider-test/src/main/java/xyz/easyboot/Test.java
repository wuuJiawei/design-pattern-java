package xyz.easyboot;

import cn.hutool.http.HttpUtil;

/**
 * @author wujiawei0926@yeah.net
 * @see
 * @since 2019/11/17
 */
public class Test {

    public static void main(String[] args) {
        String content = HttpUtil.get("http://m.isuwen.com/yiyuan/region_2867");
        System.out.println(content);
    }

}
