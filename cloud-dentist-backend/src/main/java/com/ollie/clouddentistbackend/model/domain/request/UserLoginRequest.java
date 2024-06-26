package com.ollie.clouddentistbackend.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登陆请求体
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 163057832488706587L;

    private String userAccount;

    private String userPassword;
}
