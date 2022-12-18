package com.example.receipeprojectspring.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class UserDTO {
    private int USER_SEQ;
    private String USER_DIV_CD;
    private String LOGIN_ID;
    private String LOGIN_PASSWD;
    private String EMAIL_ADDR;
    private String PASSWD_DATE;
    private int PASSWD_INPUT_FAIL_COUNT;
    private String PASSWD_STATUS_CODE;
    private LocalDateTime JOIN_DAY;
    private LocalDateTime RESIGN_DAY;
    private String GENDER_CODE;
    private LocalDateTime BDAY;
    private String MOBILE_TEL_NUM;
    private String ZIP_CODE;
    private String PIC_FILE_ID;
    private String USE_YN;
    private String RESIGN_YN;
    private String CREATE_SEQ;
    private String MODIFY_SEQ;
    private LocalDateTime MODIFY_DATE;
    private LocalDateTime LAST_LOGIN_DATE;
    private String PREV_LOGIN_PASSWD;

    @Override
    public String toString() {
        return "UserDTO{" +
                "USER_SEQ=" + USER_SEQ +
                ", USER_DIV_CD='" + USER_DIV_CD + '\'' +
                ", LOGIN_ID='" + LOGIN_ID + '\'' +
                ", LOGIN_PASSWD='" + LOGIN_PASSWD + '\'' +
                ", EMAIL_ADDR='" + EMAIL_ADDR + '\'' +
                ", PASSWD_DATE='" + PASSWD_DATE + '\'' +
                ", PASSWD_INPUT_FAIL_COUNT=" + PASSWD_INPUT_FAIL_COUNT +
                ", PASSWD_STATUS_CODE='" + PASSWD_STATUS_CODE + '\'' +
                ", JOIN_DAY='" + JOIN_DAY + '\'' +
                ", RESIGN_DAY='" + RESIGN_DAY + '\'' +
                ", GENDER_CODE='" + GENDER_CODE + '\'' +
                ", BDAY='" + BDAY + '\'' +
                ", MOBILE_TEL_NUM='" + MOBILE_TEL_NUM + '\'' +
                ", ZIP_CODE='" + ZIP_CODE + '\'' +
                ", PIC_FILE_ID='" + PIC_FILE_ID + '\'' +
                ", USE_YN='" + USE_YN + '\'' +
                ", RESIGN_YN='" + RESIGN_YN + '\'' +
                ", CREATE_SEQ='" + CREATE_SEQ + '\'' +
                ", MODIFY_SEQ='" + MODIFY_SEQ + '\'' +
                ", MODIFY_DATE='" + MODIFY_DATE + '\'' +
                ", LAST_LOGIN_DATE='" + LAST_LOGIN_DATE + '\'' +
                ", PREV_LOGIN_PASSWD='" + PREV_LOGIN_PASSWD + '\'' +
                '}';
    }
}