package AZAAZTV1.azaaztv1.service;

import AZAAZTV1.azaaztv1.dto.request.LoginRequest;

public interface MemberMapper {
    LoginRequest userLogin(LoginRequest loginRequest);
}
