package apache.common.lang;

import org.apache.commons.compress.utils.Lists;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.Arrays;

/**
 * Author by Sun, Date on 2019/8/11.
 * PS: Not easy to write code, please indicate.
 */
public class StringDemo {
    @Test
    public void demo() {
        String str = "Hello World";
        // isEmpty和isBlank的区别在于isEmpty不会忽略空格,
        // " "<--对于这样的字符串isEmpty会认为不是空,
        // 而isBlank会认为是空,isBlank更常用
        StringUtils.isEmpty(str);
        StringUtils.isNotEmpty(str);
        StringUtils.isBlank(str);
        StringUtils.isNotBlank(str);
        // strip      --> 去除两端的aa
        // stripStart --> 去除开始位置的hell
        // stripEnd   --> 去除结尾位置的orld
        StringUtils.strip(str, "aa");
        StringUtils.stripStart(str, "hell");
        StringUtils.stripEnd(str, "orld");

        // 返回字符串在第三次出现A的位置
        StringUtils.ordinalIndexOf(str, "A", 3);

        // 获取str 开始为hello结尾为orld中间的字符串
        // 注意此方法返回字符串      -->substringBetween
        // 注意此方法返回字符串数组(多了个s) --> substringsBetween
        StringUtils.substringBetween(str, "hell", "orld");
        StringUtils.substringsBetween(str, "hell", "orld");

        // 重复字符串,第二种重载形式为在重复中用,拼接
        StringUtils.repeat(str, 3);
        StringUtils.repeat(str, ",", 2);

        // 统计字符在字符串中出现的次数(大小写敏感)
        StringUtils.countMatches(str, "W");

        // 判断字符串是否全小写或大写
        StringUtils.isAllLowerCase(str);
        StringUtils.isAllUpperCase(str);

        // isAlpha        --> 全部由字母组成返回true
        // isNumeric      -->全部由数字组成返回true
        // isAlphanumeric -->全部由字母或数字组成返回true
        // isAlphaSpace   -->全部由字母或空格组成返回true
        // isWhitespace   -->全部由空格组成返回true
        StringUtils.isAlpha(str);
        StringUtils.isNumeric(str);
        StringUtils.isAlphanumeric(str);
        StringUtils.isAlphaSpace(str);
        StringUtils.isWhitespace(str);

        // 缩进字符串,第二参数最低为 4,因为要包含...
        // 现在Hello World输出为H...
        // 可用作介绍的省略,既超过长度的字符将会被用(...)替代
        StringUtils.abbreviate(str, 4);

        // 首字母大写或小写
        StringUtils.capitalize(str);
        StringUtils.uncapitalize(str);

        // 将字符串数组转变为一个字符串,通过","拼接,支持传入iterator和collection
        StringUtils.join(new String[]{"1", "2","3","4"}, ",");

        String join = String.join("1", "2");

    }
}
