package self.izouir.whitehousebackend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import self.izouir.whitehousebackend.entity.AdminMessage;
import self.izouir.whitehousebackend.repository.AdminMessageRepository;

@RequiredArgsConstructor
@Service
public class AdminMessageService {
    private final AdminMessageRepository adminMessageRepository;

    public void save(AdminMessage adminMessage) {
        adminMessageRepository.save(adminMessage);
    }
}
