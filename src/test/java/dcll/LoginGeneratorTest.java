package dcll;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 15/04/2016.
 */
public class LoginGeneratorTest {

    @Test
    public void testGenerateLoginForNomAndPrenom() throws Exception {
        LoginService loginService = new LoginService(
                new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});

        LoginGenerator loginGenerator = new LoginGenerator(loginService);

        String usernamePDUR = loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul");
        assertEquals("PDUR", usernamePDUR);
        assertNotEquals("DUPP", usernamePDUR);

    }

    @Test
    public void testGenerateLoginForNomAndPrenom1() throws Exception {
        LoginService loginService = new LoginService(
                new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});

        LoginGenerator loginGenerator = new LoginGenerator(loginService);

        String usernameJROL1 = loginGenerator.generateLoginForNomAndPrenom("Rolling", "Jean");
        assertEquals("JROL1", usernameJROL1);
        assertNotEquals("JROL", usernameJROL1);

    }

    @Test
    public void testGenerateLoginForNomAndPrenom2() throws Exception {
        LoginService loginService = new LoginService(
                new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});

        LoginGenerator loginGenerator = new LoginGenerator(loginService);

        String usernamePaulDURAN = loginGenerator.generateLoginForNomAndPrenom("Dùrand", "Paul");
        assertEquals("PDUR", usernamePaulDURAN);
        assertNotEquals("PDUR4", usernamePaulDURAN);

    }

    @Test
    public void testGenerateLoginForNomAndPrenom3() throws Exception {
        LoginService loginService = new LoginService(
                new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});

        LoginGenerator loginGenerator = new LoginGenerator(loginService);

        String usernamePaulDURAN = loginGenerator.generateLoginForNomAndPrenom("Du", "Paul");
        assertEquals("PDU", usernamePaulDURAN);
        assertNotEquals("PDUR", usernamePaulDURAN);

    }
/*
    @Test
    public void testGenerateLoginForNomAndPrenom4() throws Exception {
        LoginService loginService = new LoginService(
                new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});

        LoginGenerator loginGenerator = new LoginGenerator(loginService);

        String usernamePaulDURAN = loginGenerator.generateLoginForNomAndPrenom("Ralling", "John");
        assertEquals("JRAL2", usernamePaulDURAN);
        assertNotEquals("PDUR4", usernamePaulDURAN);

    }
*/
}