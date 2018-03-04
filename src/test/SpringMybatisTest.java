package test;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.lisa.model.User;
import com.lisa.service.UserService;
/**
 * config spring and junit integrate, when junit starts, it loads springIOC , spring test, junit
 */
@RunWith(SpringJUnit4ClassRunner.class)

//tell junit where is spring config file
@ContextConfiguration({"classpath:applicationContext.xml"})
public class SpringMybatisTest {
  @Autowired
  private UserService userService;
  
  @Test
  public void testSelectAllUser(){
	  List<User> users = userService.selectAllUser();
	  for(User us: users){
		  System.out.println(us.toString());
	  }
  }
}
