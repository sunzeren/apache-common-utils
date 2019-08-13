package apache.common.lang;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.net.URLCodec;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;

/**
 * Author by Sun, Date on 2019/8/11.
 * PS: Not easy to write code, please indicate.
 * codec包,开源组织提供的用于摘要运算、编码的包。
 * 在该包中主要分为四类加密：BinaryEncoders、DigestEncoders、LanguageEncoders、NetworkEncoders。
 */
public class CodecDemo {

    /**
     * Base64加密解密
     */
    @Test
    public void testBase64() {
        System.out.println("==============Base64================");
        //Base64加密
        byte[] encode = Base64.encodeBase64("Hello SZR".getBytes());
        //Base64解密,
        byte[] decode = Base64.decodeBase64(encode);
        String decode_str = new String(decode);
        System.out.println(decode_str);
    }

    /**
     * Md5加密,为不可逆加密,
     * 且相同原数据多次加密后,结果一致
     */
    @Test
    public void MD5() {
        System.out.println("==============MD5================");
        String data = "Hello Sun !";
        String result1 = DigestUtils.md5Hex(data);
        String result2 = DigestUtils.md5Hex(data);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result1.equals(result2) = " + result1.equals(result2));
    }

    /**
     * sha1加密,
     */
    @Test
    public void SHA1() {
        System.out.println("==============SHA1================");
        String data = "Hello Sun !";
        String result1 = DigestUtils.sha1Hex(data);
        String result2 = DigestUtils.sha1Hex(data);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result1.equals(result2) = " + result1.equals(result2));
    }

    /**
     * URL编码
     */
    @Test
    public void urlEncoder() throws Exception {
        System.out.println("==============URLCodec================");
        //第一个参数可为null,可设置对URL安全字符
        String url = "www.baidu.com?seachKey=helloWorld";
        byte[] encode = URLCodec.encodeUrl(BitSet.valueOf("www.baidu.com".getBytes()), url.getBytes());
        System.out.println("加密后 = " + new String(encode));
        byte[] decode = URLCodec.decodeUrl(encode);
        System.out.println("解密后 = " + new String(decode));
    }

    @Test
    public void byteTest() {
        System.out.println("==============ByteTest================");
        String str = "HelloWorld你猜啊,你猜我猜不猜";
        // String str = "HelloWorld";
        byte[] default_byte = str.getBytes();
        byte[] gbk_byte = str.getBytes(Charset.forName("GBK"));
        byte[] utf_8_byte = str.getBytes(Charset.forName("UTF-8"));
        //比较编码格式,默认UTF-8 编码
        System.out.println("default = UTF-8 :" + Arrays.equals(default_byte, utf_8_byte));
        System.out.println("default = GBK   :" + Arrays.equals(default_byte, gbk_byte));
        System.out.println("UTF-8   = GBK   :" + Arrays.equals(utf_8_byte, gbk_byte));
        System.out.println(" default = " + Arrays.toString(default_byte));
        System.out.println(" UTF-8 = " + Arrays.toString(utf_8_byte));
        System.out.println(" UTF-gbk = " + Arrays.toString(gbk_byte));
    }
}

