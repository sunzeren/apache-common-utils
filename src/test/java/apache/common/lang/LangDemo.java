package apache.common.lang;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;

/**
 * Author by Sun, Date on 2019/8/8.
 * PS: Not easy to write code, please indicate.
 * lang包,既language包,既语言的基础包下的常用方法
 */
public class LangDemo {


    private final String pattern = "yyyyMMddHHmmss";

    public String getPattern() {
        return pattern;
    }

    /**
     * 日期格式化
     */
    @Test
    public void dateFormat() {
        Date date = new Date();
        String formatDate = DateFormatUtils.format(date, pattern);
        System.out.println(formatDate);
    }

    /**
     * 日期操作
     */
    @Test
    public void dateOperating() {
        //可对Date进行增加或减少年月日时分秒，毫秒，周
        Date date = new Date();
        Date date1 = DateUtils.addYears(date, 1);
        Date date2 = DateUtils.addMonths(date, 1);
        Date date3 = DateUtils.addDays(date, 1);
        Date date4 = DateUtils.addWeeks(date, 1);
        //...

        //直接设置Date的年月日时分秒等等..
        Date date5 = DateUtils.setYears(new Date(), 1);
        Date date6 = DateUtils.setMonths(new Date(), 1);
        //...

        //判断是否在同一天
        DateUtils.isSameDay(new Date(), new Date());

        //Date 转 Calendar
        Calendar calendar = DateUtils.toCalendar(new Date());
    }

    //反射
    @Test
    public void reflect() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        //执行某个实例的某个方法
        MethodUtils.invokeExactMethod(new LangDemo(), "format");
        //获取一个实例的字段值(需拥有getter方法)
        String pattern = (String) PropertyUtils.getProperty(new LangDemo(), "pattern");
        System.out.println("pattern = " + pattern);
    }


    /**
     * 查找数组中是否包含某项，并返回下标
     */
    @Test
    public void arrayUtils() {
        String[] arrays = new String[]{"1", "2", "3"};
        System.out.println(ArrayUtils.indexOf(arrays, "2"));
        ArrayUtils.remove(arrays, 2);
    }
}
