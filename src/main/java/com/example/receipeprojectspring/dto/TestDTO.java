package com.example.receipeprojectspring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestDTO {
    private int USER_SEQ;
    private String USER_DIV_CD;
    private String LOGIN_ID;
    private String LOGIN_PASSWD;
    private String EMAIL_ADDR;
    private String PASSWD_DATE;
    private int PASSWD_INPUT_FAIL_COUNT;
    private String PASSWD_STATUS_CODE;
    private String JOIN_DAY;
    private String RESIGN_DAY;
    private String GENDER_CODE;
    private String BDAY;
    private String MOBILE_TEL_NUM;
    private String ZIP_CODE;
    private String PIC_FILE_ID;
    private String USE_YN;
    private String RESIGN_YN;
    private String CREATE_SEQ;
    private String MODIFY_SEQ;
    private String MODIFY_DATE;
    private String LAST_LOGIN_DATE;
    private String PREV_LOGIN_PASSWD;
}