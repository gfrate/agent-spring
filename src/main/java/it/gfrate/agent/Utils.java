package it.gfrate.agent;

import com.google.common.hash.Hashing;
import org.apache.commons.validator.routines.UrlValidator;

import java.nio.charset.StandardCharsets;
import java.time.LocalTime;

public class Utils {
    public static String encodeUrl(String url) {
        String encodedUrl = Hashing.murmur3_32_fixed()
                .hashString(
                        url.concat(LocalTime.now().toString()),
                        StandardCharsets.UTF_8)
                .toString();

        return encodedUrl;
    }

    public static boolean isUrlValid(String url) {
        UrlValidator validator = new UrlValidator();

        return validator.isValid(url);
    }
}
