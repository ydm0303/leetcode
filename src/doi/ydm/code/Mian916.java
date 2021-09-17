package doi.ydm.code;


import sun.awt.windows.WEmbeddedFramePeer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName Mian916
 * @Description TODO
 * @Author YDM
 * @Date 2021/9/16 15:05
 **/
public class Mian916 {
    public int fileWrite (String fileName, String text)  {
        // write code here
        String path = "D:\\Test.txt";
        File file = new File(path);
        if(file.exists()){
            file.getParentFile().mkdir();
        }
        try {
            file.createNewFile();
            FileWriter fw =  new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("我想加入锐明共发展");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
