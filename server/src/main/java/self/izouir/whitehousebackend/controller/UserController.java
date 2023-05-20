package self.izouir.whitehousebackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import self.izouir.whitehousebackend.entity.user.User;
import self.izouir.whitehousebackend.service.user.UserService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/{userId}")
    public User find(@PathVariable("userId") final Long userId) {
        return userService.find(userId);
    }

    @PostMapping("/mailing")
    public void mailing(@RequestParam("email") final String email) {
        userService.mailing(email);
    }

    @GetMapping("/downloadAgreementFile")
    public ResponseEntity<?> downloadAgreementFile() {
        return userService.downloadAgreementFile();
    }
}
