package apache.common.lang;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;

/**
 * Author by Sun, Date on 2019/8/11.
 * PS: Not easy to write code, please indicate.
 */
public class MathsDemo {
    @Test
    public void random() {
        /*
         * RandomUtils帮助我们产生随机数,不止是数字类型 ,
         * 连boolean类型都可以通过RandomUtils产生
         */
        System.out.println(RandomUtils.nextBoolean());
        System.out.println(RandomUtils.nextDouble());
        System.out.println(RandomUtils.nextLong());
        //范围,1到10,不包含10
        System.out.println(RandomUtils.nextInt(1, 10));
    }

    @Test
    public void demo() {
        String str = "12.7";

        // 判断字符串是否为整数
        NumberUtils.isDigits(str);

        // 判断字符串是否为数字
        NumberUtils.isCreatable(str);

        // 获取参数中最大的值
        NumberUtils.max(new int[]{10, 20, 30});

        // 获取参数中最小的值
        NumberUtils.min(new int[]{10, 20, 30});

        // 将字符串转换为int类型,支持float,long,short等数值类型
        //小数会转换为0
        NumberUtils.toInt(str,10);

        // 通过字符串创建BigDecimal类型 ,支持int,float,long等数值
        NumberUtils.createBigDecimal(str);

    }
}
