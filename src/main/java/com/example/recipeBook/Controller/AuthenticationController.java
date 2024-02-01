package com.example.recipeBook.Controller;

import com.example.recipeBook.Data.UserRepository;
import com.example.recipeBook.Model.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class AuthenticationController {
    UserRepository userRepository;
    public static final String userSessionKey = "user";
    public User getUserFromSession(HttpSession session){
        Integer userId = (Integer) session.getAttribute(userSessionKey);
        if(userId == null){
            return null;
        }
        Optional<User> user = userRepository.findById(userId);
        if(user.isEmpty()){
            return null;
        }
        return user.get();
    }
    private static void SetUserInSession(HttpSession session,User user){
        session.setAttribute(userSessionKey,user.getId());
    }
}
