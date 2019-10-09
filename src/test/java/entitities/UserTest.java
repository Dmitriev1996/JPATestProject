package entitities;

import lombok.NonNull;
import org.junit.Assert;
import org.junit.Test;
import ru.example.JPATestProject.UserService;
import ru.example.JPATestProject.entities.Address;
import ru.example.JPATestProject.entities.User;
import ru.example.JPATestProject.services.impl.UserServiceImpl;

import java.util.List;

/**
 * Created by Admin on 09.10.2019.
 */
public class UserTest {

    @Test
    public void fillUserTest() {
        Address address = Address.builder()
                .street("Улица")
                .numberHouse(10)
                .corpus("a")
                .build();
                User user = User.builder()
                .surname("Анонимов")
                .name("Аноним")
                .patronymic("Анонимович")
                .address(address)
                .build();
        Assert.assertEquals("Анонимов", user.getSurname());
        Assert.assertNotNull(user.getPatronymic());
    }
}
