package vn.com.vietbank.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeAPI {
    @GetMapping("/api/v1/softotp")
    public ResponseEntity<String> testSpringBoost() {
        return ResponseEntity.ok("success");
    }
}
