package functionality;

import static org.junit.jupiter.api.Assertions.*;

import data.dal.IUserDAO;
import data.dal.UserDAOMySQL;
import data.dto.UserDTO;
import org.junit.jupiter.api.*;
import utils.SQLTools;

class UserFunctionalityTest {
    // Vars
    private static String dbTestName = "21_d1_users_test";
    private IUserFunctionality func;
    private UserDTO testUser1;

    @BeforeAll
    static void setUpTestTable() {
        // Generate test table
        SQLTools.generateTable(dbTestName);
    }

    @BeforeEach
    void setUp() {
        // reset dao and func before each test is run
        IUserDAO dao = new UserDAOMySQL(dbTestName);
        func = new UserFunctionality(dao);
        // testUser1 values set:
        testUser1 = new UserDTO();
        testUser1.setUserId(42);
        testUser1.setUserName("testUser");
        testUser1.setIni("test");
        testUser1.setCpr("123456-7890");
        testUser1.setPassword("testPass");
        testUser1.addRole("Operator");
    }

    @Test
    void createUpdateDeleteUser() throws IUserFunctionality.UserInputException, IUserDAO.DALException {
        // Create 'testUser1' in database
        func.createUser(testUser1);
        // Check user was correctly created
        assertEquals(testUser1.getUserId(), func.getUser(testUser1.getUserId()).getUserId());
        assertEquals(testUser1.getUserName(), func.getUser(testUser1.getUserId()).getUserName());
        // Update 'testUser1'
        testUser1.setUserName("UpdatedTestUser");
        testUser1.setIni("UTU");
        // Check 'testUser1' is different from user in database
        assertNotEquals(testUser1.getUserName(), func.getUser(testUser1.getUserId()).getUserName());
        assertNotEquals(testUser1.getIni(), func.getUser(testUser1.getUserId()).getIni());
        // Update user in database
        func.updateUser(testUser1);
        // Check database user has been updated with correct values
        assertEquals(testUser1.getUserName(), func.getUser(testUser1.getUserId()).getUserName());
        assertEquals(testUser1.getIni(), func.getUser(testUser1.getUserId()).getIni());
        // Delete user
        func.deleteUser(testUser1.getUserId());
        // Check user has been correctly deleted
        assertEquals("[]", func.getUserList().toString());
    }
}