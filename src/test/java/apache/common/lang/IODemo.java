package apache.common.lang;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Author by Sun, Date on 2019/8/11.
 * PS: Not easy to write code, please indicate.
 */
public class IODemo {

    @Test
    public void upload() throws IOException {
        // File temp = FileUtils.getTempDirectory();
        // String desktop = "C:\\Users\\Sun\\Desktop";
        // File desktopFile = new File(desktop);
        // FileUtils.getFile(desktopFile, "Apache-common常用讲.docx");
        // File userDirectory = FileUtils.getUserDirectory();
        // File img = FileUtils.toFile(new URL("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/logo_white_fe6da1ec.png"));
        // FileUtils.copyFile(img,temp);
    }

    /**
     * 移动文件夹,移动文件
     * 复制文件夹,复制文件
     */
    @Test
    public void demo() {
        // FileUtils.moveDirectory(,);
        // FileUtils.moveFile(,);
        // FileUtils.copyDirectory(,);
        // FileUtils.copyFile(,);
    }
}
