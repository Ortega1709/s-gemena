package com.ortega.sgemena;

import com.ortega.sgemena.services.InfoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1")
public class SGemenaController {

    private InfoService infoService;

    @GetMapping("/info")
    public String index() {
        return infoService.getInfoServer();
    }

}
