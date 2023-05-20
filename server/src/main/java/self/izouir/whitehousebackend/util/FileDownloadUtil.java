package self.izouir.whitehousebackend.util;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;
import java.nio.file.Path;

public class FileDownloadUtil {
    public static Resource downloadFile(String filePath) throws MalformedURLException {
        return new UrlResource(Path.of(filePath).toUri());
    }
}
