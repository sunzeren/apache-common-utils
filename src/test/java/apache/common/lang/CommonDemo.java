package apache.common.lang;

import apache.common.lang.bean.Bean;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Author by Sun, Date on 2019/8/11.
 * PS: Not easy to write code, please indicate.
 */
public class CommonDemo {

    /**
     * Mao值转Bean
     *
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    @Test
    public void map() throws InvocationTargetException, IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "程序员");
        map.put("age", "25");
        // map.put("phone", "1343333333");
        //map中不存在的值会忽略
        map.put("none", "null");
        Bean bean = new Bean();
        BeanUtils.populate(bean, map);
        System.out.println(bean.toString());
    }

    /**
     * 复制实体字段值
     *
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    @Test
    public void copyProperties() throws InvocationTargetException, IllegalAccessException {
        Bean origin = new Bean();
        origin.setName("吃什么");
        Bean newBean = new Bean();
        BeanUtils.copyProperties(newBean, origin);
        System.out.println(newBean.toString());
    }
}
