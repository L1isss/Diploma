package self.izouir.whitehousebackend.service.user;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import self.izouir.whitehousebackend.entity.user.User;
import self.izouir.whitehousebackend.exception.UserNotFoundException;
import self.izouir.whitehousebackend.repository.user.UserRepository;
import self.izouir.whitehousebackend.util.FileDownloadUtil;

import java.net.MalformedURLException;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public User find(Long userId) {
        return userRepository.findById(userId).orElseThrow(
                () -> new UserNotFoundException("User with id = " + userId + " was not found"));
    }

    public void mailing(String email) {
        userRepository.mailing(email);
    }

    public ResponseEntity<?> downloadAgreementFile() {
        Resource resource;
        try {
            resource = FileDownloadUtil.downloadFile("src/main/resources/agreement.txt");
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                    .body(resource);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
