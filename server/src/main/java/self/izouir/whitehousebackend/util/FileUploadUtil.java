package self.izouir.whitehousebackend.util;

import lombok.experimental.UtilityClass;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

@UtilityClass
public class FileUploadUtil {
    public static String saveFile(String fileName, MultipartFile multipartFile) throws IOException {
        Path uploadDirectory = Path.of("src/main/resources/files");
        try (InputStream inputStream = multipartFile.getInputStream()) {
            Path file = uploadDirectory.resolve(fileName);
            Files.copy(inputStream, file, StandardCopyOption.REPLACE_EXISTING);
            return file.getFileName().toString();
        } catch (IOException e) {
            throw new IOException("Error uploading file: " + fileName, e);
        }
    }
}
