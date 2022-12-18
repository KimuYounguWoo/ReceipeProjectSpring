package com.example.receipeprojectspring.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeDTO extends PublicDTO{
    /*
    DB 명세서
    1. 관리자 / 일반 사용자에게 들어가는 정보 차이
    - 관리자: 레시피SEQ, 등록자SEQ, 수정자SEQ, 유저SEQ, 게시글SEQ, 공개여부, 파일그룹ID
    - 일반 사용자: 제목, 내용, 등록일자, 수정일자, 조리시간, 추천수, 조회수, 난이도
    2. 수정할 수 있어야하는 컴포넌트
    - 제목, 내용, 공개 여부, 난이도, 조리시간, 파일 그룹 ID??, 공개 여부
    3. 자동으로 업데이트 해줘야 할 컴포넌트
    - 등록일자, 수정일자, 추천수, 조회수, 수정자 시퀀스, 게시글 시퀀스
    4. 변하지 않는 컴포넌트
    - 레시피SEQ, 등록자SEQ, 수정자SEQ, 유저SEQ, 게시글SEQ, 파일 그룹 ID
    */

    /* 관리자에게 제공되는 정보 */
    private int RECIPE_SEQ;         //레시피 시퀀스
    private int CREATE_SEQ;         //등록자 시퀀스
    private int MODIFY_SEQ;         //수정자 시퀀스
    private int USER_SEQ;           //유저 시퀀스
    private int BOARD_SEQ;          //게시글 시퀀스
    private char USE_YN;            //공개 OR 비공개
    private String FILE_GRP_ID;     //파일 그룹 ID


    /* 일반 유저에게 제공되는 정보 */
    private String TITLE;           //레시피 제목
    private String CONTENTS;        //레시피 내용
    private String RECIPE_TIME;     //조리시간
    private int RECOMMENT_CNT;      //추천수
    private int VIEW_CNT;           //조회수
    private int RECIPE_LEVEL;       //난이도

    @Override
    public String toString() {
        return "RecipeDTO{" +
                "CREATE_SEQ=" + CREATE_SEQ +
                ", MODIFY_SEQ=" + MODIFY_SEQ +
                ", USER_SEQ=" + USER_SEQ +
                ", BOARD_SEQ=" + BOARD_SEQ +
                ", USE_YN=" + USE_YN +
                ", FILE_GRP_ID='" + FILE_GRP_ID + '\'' +
                ", TITLE='" + TITLE + '\'' +
                ", CONTENTS='" + CONTENTS + '\'' +
                ", RECIPE_TIME='" + RECIPE_TIME + '\'' +
                ", RECOMMENT_CNT=" + RECOMMENT_CNT +
                ", VIEW_CNT=" + VIEW_CNT +
                ", RECIPE_SEQ=" + RECIPE_SEQ +
                ", RECIPE_LEVEL=" + RECIPE_LEVEL +
                '}';
    }

    /* getXXX() */
    public int getRecipeSeq() { return RECIPE_SEQ; }
    public int getCreateSeq() { return CREATE_SEQ; }
    public int getModifierSeq() { return MODIFY_SEQ; }
    public int getUserSeq() { return USER_SEQ; }
    public int getBoardSeq() { return BOARD_SEQ; }
    public char getUse() {return USE_YN;}
    public String getFileGrpId() { return FILE_GRP_ID; }

    public String getTitle() { return TITLE; }
    public String getContent() { return CONTENTS; }
    public String getCooktime() { return RECIPE_TIME; }
    public int getRecommentCnt() { return RECOMMENT_CNT; }
    public int getViewCnt() { return VIEW_CNT; }
    public int getLevel() { return RECIPE_LEVEL; }

    /* SetXXX() */
    public void setTitle(String TITLE) {this.TITLE = TITLE;}
    public void setYN(char USE_YN) {this.USE_YN = USE_YN;}
    public void setContent(String CONTENTS) {this.CONTENTS = CONTENTS;}
    public void setCooktime(String RECIPE_TIME) {this.RECIPE_TIME = RECIPE_TIME;}
    public void setLevel(int RECIPE_LEVEL) {this.RECIPE_LEVEL = RECIPE_LEVEL;}
    public void setFileGrpId(String FILE_GRP_ID) {this.FILE_GRP_ID = FILE_GRP_ID;}


}
