package com.riffrain.dhl.module.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckAccountReqDTO {
    private String userId;
    private String password;
}
