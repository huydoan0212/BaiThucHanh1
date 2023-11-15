package huy.bean;

import huy.dao.UserDAO;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    static Map<String, String> data = new HashMap<>();

    static {
        data.put("anhlapro090@gmail.com", "123");

    }

    private static UserService instance;

    public static UserService getInstance() {
        if (instance == null) instance = new UserService();
        return instance;
    }

    public User checkLogin(String email, String pass) {
        User userByEmail = UserDAO.getUserByEmail(email);
        if(userByEmail!=null && userByEmail.getEmail().equals(email) && userByEmail.getPassword().equals(pass))
            return userByEmail;
        return null;
    }


}
