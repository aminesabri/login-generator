package dcll;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 15/04/2016.
 */
public class LoginServiceTest {

    @Test
    public void testLoginExists() throws Exception {
        String[] users = {"sabri", "amine", "mohamed", "adam"};
        LoginService loginService = new LoginService(users);
        boolean exist = loginService.loginExists("sabri");
        assertTrue(exist);
        boolean notExist = loginService.loginExists("hummels");
        assertFalse(notExist);
    }

    @Test
    public void testAddLogin() throws Exception {
        String[] users = {"sabri", "amine", "mohamed", "adam"};
        LoginService loginService = new LoginService(users);
        loginService.addLogin("hummels");
        boolean added = loginService.loginExists("hummels");
        assertTrue(added);
    }

    @Test
    public void testFindAllLoginsStartingWith() throws Exception {
        String[] users = {"sabri", "amine", "mohamed", "adam"};
        LoginService loginService = new LoginService(users);
        List<String> liste = loginService.findAllLoginsStartingWith("a");
        assertEquals(liste.size(), 2);
        assertNotEquals(liste.size(), 7);
        System.out.println(" "+ liste.get(0) + " " + liste.get(1));
    }

    @Test
    public void testFindAllLogins() throws Exception {
        String[] users = {"sabri", "amine", "mohamed", "adam"};
        LoginService loginService = new LoginService(users);
        List<String> liste = loginService.findAllLogins();
        assertEquals(liste.size(), 4);
        assertNotEquals(liste.size(), 2);
    }
}