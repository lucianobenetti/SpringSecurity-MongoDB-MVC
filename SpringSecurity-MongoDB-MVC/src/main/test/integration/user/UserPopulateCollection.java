package integration.user;

import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.antuansoft.mongodb.domain.User;
import com.antuansoft.mongodb.repositories.UserRepositoryDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "mongo-config.xml" })

public class UserPopulateCollection {
	
    @Resource
    UserRepositoryDao userRespositoryDao;
	
    
    /**
     * Test que sirve para poblar la base de datos de usuarios.
     */
    //@Test
	public void populateCollectionUser(){
		
		User user1 = new User();
		
		user1.setAge(33);
		user1.setId(UUID.randomUUID().toString());
		user1.setName("User1");
		user1.setSurname("Surname1");
		user1.setPassword("123");
		user1.setRole(1);
		user1.setUsername("user1@puleva.es");
		
		User user2 = new User();
		user2.setAge(35);
		user2.setId(UUID.randomUUID().toString());
		user2.setName("User2");
		user2.setSurname("Surname2");
		user2.setPassword("123");
		user2.setRole(2);
		user2.setUsername("user2@puleva.es");
		
		
		userRespositoryDao.save(user1);
		userRespositoryDao.save(user2);
		
		
	}

}