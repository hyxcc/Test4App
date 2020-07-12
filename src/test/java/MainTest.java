import com.danga.MemCached.MemCachedClient;
import com.hyx.pojo.Profession;
import com.hyx.pojo.Student;
import com.hyx.pojo.User;
import com.hyx.service.ProfessionService;
import com.hyx.service.StudentService;
import com.hyx.service.UserService;
import com.hyx.util.MemcachedUtil;
import com.hyx.util.DESUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MainTest {
    @Autowired
    private StudentService studentService;
    @Resource
    private ProfessionService proService;
    @Resource
    private UserService userService;
    private Logger log = LoggerFactory.getLogger(MainTest.class);

    @Test
    public void student(){
        List<Student> list = studentService.selectAll();
        System.out.println(list);
    }
    @Test
    public void profession(){
        Profession pro = new Profession();
        pro.setDvpDirection("前端开发方向");
        List<Profession> list = proService.selectAll(pro);
        System.out.println(list);
    }
    @Test
    public void dologin(){
        User user = new User();
        user.setName("哪吒");
        User user1 = userService.findOne(user);
        System.out.println(user1);
    }
    @Test
    public void doregist(){
        User user = new User();
        user.setName("王二蛋");
        user.setNumber(2345);
        user.setPwd("1104959D53DC3B60F2D40CD4A47D79E7");
        int num = userService.insert(user);
        System.out.println(num);
    }
    @Test
    public void desTest(){
        String data = "测试520";
        System.out.println("加密前数据："+data);
        String key = "12345678";
        String encryptResult = DESUtil.desEncrypt(data, key);
        System.out.println("加密后数据："+encryptResult);
        String decryptResult= DESUtil.desDecrypt(encryptResult,key);
        System.out.println("解密后数据："+decryptResult);
    }

    @Test
    public void jedisTest(){
        log.info("====start===");
        long startTime = System.currentTimeMillis();
        List list = studentService.selectAll();
        System.out.println(list);
        long endTime = System.currentTimeMillis();
        log.info("执行时间：[{}ms]",endTime-startTime);
        log.info("====end====");
    }
}
