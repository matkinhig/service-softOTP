package vn.com.vietbank.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vn.com.vietbank.dto.SoftOTPDTO;

@RestController
public class SoftOTPAPI {
    @PostMapping(value = "/api/v1/softotp")
    public SoftOTPDTO handler(@RequestBody SoftOTPDTO model){
        return model;
    }
}
