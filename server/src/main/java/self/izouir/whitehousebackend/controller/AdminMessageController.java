package self.izouir.whitehousebackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import self.izouir.whitehousebackend.entity.AdminMessage;
import self.izouir.whitehousebackend.service.AdminMessageService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/admin-messages")
public class AdminMessageController {
    private final AdminMessageService adminMessageService;

    @PostMapping
    public void save(@Validated @RequestBody final AdminMessage adminMessage) {
        adminMessageService.save(adminMessage);
    }
}
