package AZAAZTV1.azaaztv1.controller;

import AZAAZTV1.azaaztv1.dto.request.LoginRequest;
import AZAAZTV1.azaaztv1.dto.request.SignUpRequest;
import AZAAZTV1.azaaztv1.service.impl.DbServiceImpl;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="/signup", method = RequestMethod.POST)
public class MemberController {
    @Autowired
    private final DbServiceImpl dbService;

    @PostMapping("/insert")
    public ResponseEntity<Void> signUp(@RequestBody @Valid SignUpRequest signUpRequest){
        dbService.signUp(signUpRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public String login(@RequestBody @Valid LoginRequest loginRequest) {
        if(dbService.login(loginRequest)) {
            //return "redirect:/home";
            return "OK";
        }
        return "login";
    }


}







