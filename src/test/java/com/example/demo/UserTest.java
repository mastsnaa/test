package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserTest {
    @Autowired
    private User userService;
    @Test
    public void testCreateUser() {
        // Teste la méthode createUser
        String user = userService.createUser("sonia");
        assertEquals("sonia", user);
    }

    @Test
    public void testDeleteUser() {
        // Teste la méthode deleteUser
        boolean result = userService.deleteUser("sonia");
        assertTrue(result, "La suppression de l'utilisateur doit retourner true");
    }
    }
