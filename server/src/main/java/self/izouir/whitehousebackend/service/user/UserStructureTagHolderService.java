package self.izouir.whitehousebackend.service.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import self.izouir.whitehousebackend.repository.user.UserStructureTagHolderRepository;

@RequiredArgsConstructor
@Service
public class UserStructureTagHolderService {
    private final UserStructureTagHolderRepository userStructureTagHolderRepository;
}
