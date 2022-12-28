package AZAAZTV1.azaaztv1.controller;

import AZAAZTV1.azaaztv1.dto.request.SignUpRequest;
import AZAAZTV1.azaaztv1.service.impl.DbServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="/signup", method = RequestMethod.POST)
public class MemberController {
    private final DbServiceImpl dbService;

    @PostMapping("/insert")
    public ResponseEntity<Void> signUp(@RequestBody @Valid SignUpRequest signUpRequest){
        dbService.signUp(signUpRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public
}
