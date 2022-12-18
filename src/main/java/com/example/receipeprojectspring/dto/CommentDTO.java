package com.example.receipeprojectspring.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDTO extends PublicDTO{
    /*
    DB 명세서
    1. 관리자 / 일반 사용자에게 들어가는 정보 차이
    - 관리자: 댓글SEQ, 부모댓글SEQ, 등록자SEQ, 수정자SEQ, 유저SEQ, 레시피SEQ, 게시글SEQ, 공개여부, 깊이
    - 일반 사용자: 내용, 추천수
    2. 수정할 수 있어야하는 컴포넌트
    - 댓글 내용
    3. 자동으로 업데이트 해줘야 할 컴포넌트
    - 추천수, 깊이, 공개 여부
    4. 변하지 않는 컴포넌트
    - 댓글SEQ, 부모댓글SEQ, 등록자SEQ, 수정자SEQ, 유저SEQ, 레시피SEQ, 게시글SEQ
    */

    private int COMMENT_SEQ;            //댓글 시퀀스
    private int PARENT_COMMENT_SEQ;     //상위 댓글 시퀀스
    private int CREATE_SEQ;             //등록자 시퀀스
    private int MODIFY_SEQ;             //수정자 시퀀스
    private int USER_SEQ;               //유저 시퀀스
    private int RECIPE_SEQ;             //레시피 시퀀스
    private int BOARD_SEQ;              //게시글 시퀀스
    private char USE_YN;                //공개 OR 비공개
    private int DEPTH;                  //대댓글 깊이

    private int RECOMMENT_CNT;          //추천수
    private String CONTENTS;            //댓글 내용

    /* getXXX() */
    public int getCommentSeq() { return COMMENT_SEQ; }
    public int getParentCommentSeq() { return PARENT_COMMENT_SEQ; }
    public int getCreateSeq() { return CREATE_SEQ; }
    public int getModifierSeq() { return MODIFY_SEQ; }
    public int getUserSeq() { return USER_SEQ; }
    public int getRecipeSeq() { return RECIPE_SEQ; }
    public int getBoardSeq() { return BOARD_SEQ; }
    public char getUse() {return USE_YN;}
    public int getRecommentCnt() { return RECOMMENT_CNT; }
    public String getContents() { return CONTENTS; }

    public void setContent(String CONTENTS) { this.CONTENTS = CONTENTS; }
    public void setRecommentCnt(int RECOMMENT_CNT) { this.RECOMMENT_CNT = RECOMMENT_CNT; }
}
