package ai.developer.code.api.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {


    @GetMapping
    public ResponseEntity<UserResponse> getUserInfo() {
        UserResponse userResponse = new UserResponse("Id", "Name", "Email");
        return ResponseEntity.ok(userResponse);
    }
}
