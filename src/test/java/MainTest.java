import com.hyx.pojo.Profession;
import com.hyx.pojo.Student;
import com.hyx.service.ProfessionService;
import com.hyx.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
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
}
