package huy.bean;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    static Map<String, String> data = new HashMap<>();
    static {
        data.put("anhlapro090@gmail.com", "123");

    }
    private static UserService instance;
    public static UserService getInstance(){
        if(instance==null) instance = new UserService();
        return instance;
    }
    public User checkLogin(String email, String pass){
        if(!data.containsKey(email)) return null;
        if(pass!=null && pass.equals(data.get(email))){
            return new User(email, email);
        }
        return null;
    }
}
