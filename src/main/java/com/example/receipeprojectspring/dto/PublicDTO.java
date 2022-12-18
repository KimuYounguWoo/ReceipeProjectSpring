package com.example.receipeprojectspring.dto;

import java.time.LocalDateTime;

public class PublicDTO {
    /*
    현재 시간 -> LocalDateTime으로 자동 수정 
    */
    private LocalDateTime CREATE_DATE;
    private LocalDateTime MODIFY_DATE;

    public LocalDateTime getCreateDate() {
        return CREATE_DATE;
    }
    public void setCreateDate(LocalDateTime CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }
    public LocalDateTime getModifiedDate() {
        return MODIFY_DATE;
    }
    public void getModifiedDate(LocalDateTime MODIFY_DATE) {
        this.MODIFY_DATE = MODIFY_DATE;
    }
}
