package self.izouir.whitehousebackend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import self.izouir.whitehousebackend.repository.MailingEntityRepository;

@RequiredArgsConstructor
@Service
public class MailingEntityService {
    private final MailingEntityRepository mailingEntityRepository;
}
