package al.powerlifting.fitnessapi.controller;

import al.powerlifting.fitnessapi.model.Response;
import al.powerlifting.fitnessapi.service.LifterProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;
import java.util.Map;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1/profile")
public class LifterProfileController {

    private LifterProfileService lifterProfileService;

    public LifterProfileController(LifterProfileService lifterProfileService) {
        this.lifterProfileService = lifterProfileService;
    }

    @GetMapping(value = "/fetchProfile")
    public ResponseEntity<Response> fetchLifterProfile() throws IOException {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("lifter Profile",lifterProfileService.getProfile()))
                        .message("Lifter Retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()

        );
    }
}
