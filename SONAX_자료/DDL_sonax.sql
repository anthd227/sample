/* 
  코드그룹
*/  

-- DROP TABLE T_GROUP_CODE 

CREATE TABLE T_GROUP_CODE
(
    GROUP_CODE         varchar(50)     NOT NULL, 
    GROUP_CODE_NAME    varchar(50)     NOT NULL, 
    GROUP_CODE_DESC    varchar(200)    NULL, 
    USE_YN             char(1)         NOT NULL, 
    REG_ID             varchar(50)     NULL, 
    REG_DATE           timestamp       NULL, 
    UDT_ID             varchar(50)     NULL, 
    UDT_DATE           timestamp       NULL, 
    PRIMARY KEY (GROUP_CODE)
);

COMMENT ON TABLE T_GROUP_CODE IS '코드그룹';

COMMENT ON COLUMN T_GROUP_CODE.GROUP_CODE IS '그룹코드';
COMMENT ON COLUMN T_GROUP_CODE.GROUP_CODE_NAME IS '그룹코드명';
COMMENT ON COLUMN T_GROUP_CODE.GROUP_CODE_DESC IS '그룹코드설명';
COMMENT ON COLUMN T_GROUP_CODE.USE_YN IS '사용여부';
COMMENT ON COLUMN T_GROUP_CODE.REG_ID IS '최초등록자ID';
COMMENT ON COLUMN T_GROUP_CODE.REG_DATE IS '최초등록일시';
COMMENT ON COLUMN T_GROUP_CODE.UDT_ID IS '최종수정자ID';
COMMENT ON COLUMN T_GROUP_CODE.UDT_DATE IS '최종수정일시';



/*
  공통코드
*/

-- DROP TABLE T_CODE 

CREATE TABLE T_CODE
(
    CODE_ID           integer         NULL, 
    GROUP_CODE        varchar(50)     NOT NULL, 
    CODE              varchar(50)     NOT NULL, 
    CODE_NAME         varchar(50)     NOT NULL, 
    CODE_DESC         varchar(200)    NOT NULL, 
    SYSTEM_CODE_YN    char(1)         NULL, 
    CODE_ORDER        integer         NOT NULL, 
    USE_YN            char(1)         NOT NULL, 
    REG_ID            varchar(50)     NULL, 
    REG_DATE          timestamp       NULL, 
    UDT_ID            varchar(50)     NULL, 
    UDT_DATE          timestamp       NULL, 
    PRIMARY KEY (CODE_ID)
);

COMMENT ON TABLE T_CODE IS '공통코드';

COMMENT ON COLUMN T_CODE.CODE_ID IS '코드ID';
COMMENT ON COLUMN T_CODE.GROUP_CODE IS '공통코드';
COMMENT ON COLUMN T_CODE.CODE IS '코드';
COMMENT ON COLUMN T_CODE.CODE_NAME IS '코드명';
COMMENT ON COLUMN T_CODE.CODE_DESC IS '코드설명';
COMMENT ON COLUMN T_CODE.SYSTEM_CODE_YN IS '시스템코드여부';
COMMENT ON COLUMN T_CODE.CODE_ORDER IS '코드순서';
COMMENT ON COLUMN T_CODE.USE_YN IS '사용여부';
COMMENT ON COLUMN T_CODE.REG_ID IS '최초등록자ID';
COMMENT ON COLUMN T_CODE.REG_DATE IS '최초등록일시';
COMMENT ON COLUMN T_CODE.UDT_ID IS '최종수정자ID';
COMMENT ON COLUMN T_CODE.UDT_DATE IS '최종수정일시';


/*
  사용자관리
*/

-- DROP TABLE T_USER

CREATE TABLE T_USER
(
    USER_ID                       varchar(50)     NULL, 
    USER_GROUP_ID                 integer         NOT NULL, 
    PASSWORD                      varchar(100)    NOT NULL, 
    SALT                          varchar(100)    NOT NULL, 
    USER_NAME                     varchar(50)     NOT NULL, 
    USER_BIRTH                    varchar(50)     NOT NULL, 
    PHONE                         varchar(50)     NOT NULL, 
    EMAIL                         varchar(50)     NOT NULL, 
    ADDRESS                       varchar(100)    NOT NULL, 
    DETAIL_ADDRESS                varchar(100)    NULL, 
    MEM_GRADE                     varchar(50)     NOT NULL, 
    USE_YN                        char(1)         NOT NULL, 
    JOIN_DATE                     timestamp       NOT NULL, 
    LEAVE_DATE                    timestamp       NOT NULL, 
    PWD_CHANGE_DATE               timestamp       NOT NULL, 
    PWD_ERR_CNT                   integer         NOT NULL, 
    PLATFORM_TYPE                 varchar(50)     NOT NULL, 
    MARKETING_CONSENT_YN          char(1)         NOT NULL, 
    MARKETING_RECEIVE_METHOD      varchar(50)     NULL, 
    MARKETING_CONSENT_DATE        timestamp       NULL, 
    ACCESSION_PATH                varchar(50)     NULL, 
    INFLOW_PATH                   varchar(50)     NULL, 
    PRIMARY KEY (USER_ID)
);

COMMENT ON TABLE T_USER IS '사용자정보';

COMMENT ON COLUMN T_USER.USER_ID IS '아이디';
COMMENT ON COLUMN T_USER.USER_GROUP_ID IS '사용자그룹ID';
COMMENT ON COLUMN T_USER.PASSWORD IS '비밀번호';
COMMENT ON COLUMN T_USER.SALT IS '암호화키값';
COMMENT ON COLUMN T_USER.USER_NAME IS '이름';
COMMENT ON COLUMN T_USER.USER_BIRTH IS '생년월일';
COMMENT ON COLUMN T_USER.PHONE IS '연락처';
COMMENT ON COLUMN T_USER.EMAIL IS '이메일';
COMMENT ON COLUMN T_USER.ADDRESS IS '주소';
COMMENT ON COLUMN T_USER.DETAIL_ADDRESS IS '상세주소';
COMMENT ON COLUMN T_USER.MEM_GRADE IS '등급';
COMMENT ON COLUMN T_USER.USE_YN IS '사용여부';
COMMENT ON COLUMN T_USER.JOIN_DATE IS '가입일';
COMMENT ON COLUMN T_USER.LEAVE_DATE IS '탈퇴일';
COMMENT ON COLUMN T_USER.PWD_CHANGE_DATE IS '비밀번호변경일';
COMMENT ON COLUMN T_USER.PWD_ERR_CNT IS '비밀번호 틀린 횟수';
COMMENT ON COLUMN T_USER.PLATFORM_TYPE IS '소셜로그인 종류';
COMMENT ON COLUMN T_USER.MARKETING_CONSENT_YN IS '마케팅 수신동의여부';
COMMENT ON COLUMN T_USER.MARKETING_RECEIVE_METHOD IS '마케팅수신타입';
COMMENT ON COLUMN T_USER.MARKETING_CONSENT_DATE IS '마케팅수신동의일';
COMMENT ON COLUMN T_USER.ACCESSION_PATH IS '가입경로[PC/모바일]';
COMMENT ON COLUMN T_USER.INFLOW_PATH IS '유입경로[광고/소개/검색]';


/*
  로그인 로그
*/

-- DROP TABLE T_LOGIN_LOG

CREATE TABLE T_LOGIN_LOG
(
    USER_ID        varchar(50)    NULL, 
    USER_IP        varchar(50)    NULL, 
    LOG_DATE       varchar(50)    NOT NULL, 
    LOG_TYPE       varchar(50)    NOT NULL, 
    LOG_CONTENT    text           NOT NULL
);

COMMENT ON TABLE T_LOGIN_LOG IS '로그인로그';

COMMENT ON COLUMN T_LOGIN_LOG.USER_ID IS '사용자ID';
COMMENT ON COLUMN T_LOGIN_LOG.USER_IP IS '사용자IP';
COMMENT ON COLUMN T_LOGIN_LOG.LOG_DATE IS '발생일자';
COMMENT ON COLUMN T_LOGIN_LOG.LOG_TYPE IS '로그유형';
COMMENT ON COLUMN T_LOGIN_LOG.LOG_CONTENT IS '로그';

/*
  첨부파일
*/

-- DROP TABLE T_FILE

CREATE TABLE T_FILE
(
    FILE_ID           integer         GENERATED BY DEFAULT AS IDENTITY NULL, 
    REF_CODE          varchar(50)     NOT NULL, 
    REF_ID            integer         NOT NULL, 
    FILE_ORDER        integer         NULL, 
    FILE_NAME_DEST    varchar(200)    NOT NULL, 
    FILE_NAME         varchar(200)    NOT NULL, 
    FILE_SIZE         integer         NOT NULL, 
    FILE_EXTENSION    varchar(50)     NULL, 
    FILE_PATH         varchar(100)    NOT NULL, 
    DEL_YN            char(1)         NOT NULL, 
    REG_ID            varchar(50)     NULL, 
    REG_DATE          timestamp       NULL, 
    UDT_ID            varchar(50)     NULL, 
    UDT_DATE          timestamp       NULL, 
    PRIMARY KEY (FILE_ID)
);

COMMENT ON TABLE T_FILE IS '첨부파일';

COMMENT ON COLUMN T_FILE.FILE_ID IS '파일ID';
COMMENT ON COLUMN T_FILE.REF_CODE IS '구분코드[대상테이블(메뉴)명]';
COMMENT ON COLUMN T_FILE.REF_ID IS '구분ID[대상 글번호]';
COMMENT ON COLUMN T_FILE.FILE_ORDER IS '파일순서[첨부파일의 순서]';
COMMENT ON COLUMN T_FILE.FILE_NAME_DEST IS '원본파일명';
COMMENT ON COLUMN T_FILE.FILE_NAME IS '저장파일명';
COMMENT ON COLUMN T_FILE.FILE_SIZE IS '파일사이즈';
COMMENT ON COLUMN T_FILE.FILE_EXTENSION IS '파일확장자';
COMMENT ON COLUMN T_FILE.FILE_PATH IS '파일저장경로';
COMMENT ON COLUMN T_FILE.DEL_YN IS '삭제여부';
COMMENT ON COLUMN T_FILE.REG_ID IS '최초등록자ID';
COMMENT ON COLUMN T_FILE.REG_DATE IS '최초등록일시';
COMMENT ON COLUMN T_FILE.UDT_ID IS '최종수정자ID';
COMMENT ON COLUMN T_FILE.UDT_DATE IS '최종수정일시';

/*
  게시판마스터
*/

-- DROP TABLE T_BOARD_MASTER

CREATE TABLE T_BOARD_MASTER
(
    BOARD_ID           integer         GENERATED BY DEFAULT AS IDENTITY NULL, 
    BOARD_NAME         varchar(50)     NOT NULL, 
    BOARD_TYPE         varchar(50)     NULL, 
    BOARD_DESC         varchar(200)    NULL, 
    FILE_ADD_YN        char(1)         NULL, 
    FILE_CNT           integer         NULL, 
    FILE_EXTENSION     varchar(50)     NULL, 
    USE_YN             char(1)         NOT NULL, 
    REG_ID             varchar(50)     NULL, 
    REG_DATE           timestamp       NULL, 
    UDT_ID             varchar(50)     NULL, 
    UDT_DATE           timestamp       NULL, 
    PRIMARY KEY (BOARD_ID)
);

COMMENT ON TABLE T_BOARD_MASTER IS '게시판마스터';

COMMENT ON COLUMN T_BOARD_MASTER.BOARD_ID IS '게시판ID';
COMMENT ON COLUMN T_BOARD_MASTER.BOARD_NAME IS '게시판명';
COMMENT ON COLUMN T_BOARD_MASTER.BOARD_TYPE IS '게시판분류[운영/상품/일반/자료실]';
COMMENT ON COLUMN T_BOARD_MASTER.BOARD_DESC IS '게시판설명';
COMMENT ON COLUMN T_BOARD_MASTER.FILE_ADD_YN IS '파일첨부 가능여부';
COMMENT ON COLUMN T_BOARD_MASTER.FILE_CNT IS '첨부가능한 파일 개수';
COMMENT ON COLUMN T_BOARD_MASTER.FILE_EXTENSION IS '첨부가능한 파일 종류';
COMMENT ON COLUMN T_BOARD_MASTER.USE_YN IS '사용여부';
COMMENT ON COLUMN T_BOARD_MASTER.REG_ID IS '최초등록자ID';
COMMENT ON COLUMN T_BOARD_MASTER.REG_DATE IS '최초등록일시';
COMMENT ON COLUMN T_BOARD_MASTER.UDT_ID IS '최종수정자ID';
COMMENT ON COLUMN T_BOARD_MASTER.UDT_DATE IS '최종수정일시';

/*
  게시글
*/

-- DROP TABLE T_BOARD_POST 
CREATE TABLE T_BOARD_POST
(
    POST_ID            integer         GENERATED BY DEFAULT AS IDENTITY NOT NULL, 
    BOARD_ID           integer         NULL, 
    POST_TITLE         varchar(200)    NOT NULL, 
    POST_CONTENT       text            NOT NULL, 
    WRITER_ID          varchar(50)     NULL, 
    POST_WRITER        varchar(50)     NULL, 
    NOTICE_YN          char(1)         NOT NULL, 
    GROUP_ID           integer         NOT NULL, 
    GROUP_ORDER        integer         NOT NULL, 
    DEL_YN             char(1)         NOT NULL, 
    ADMIN_DELETE_YN    char(1)         NULL, 
    DELETION_REASON    varchar(50)     NULL, 
    VIEWS              integer         NULL, 
    REG_ID             varchar(50)     NULL, 
    REG_DATE           timestamp       NULL, 
    UDT_ID             varchar(50)     NULL, 
    UDT_DATE           timestamp       NULL, 
    PRIMARY KEY (POST_ID, BOARD_ID)
);

COMMENT ON TABLE T_BOARD_POST IS '게시글';

COMMENT ON COLUMN T_BOARD_POST.POST_ID IS '게시글ID';
COMMENT ON COLUMN T_BOARD_POST.BOARD_ID IS '게시판마스터ID';
COMMENT ON COLUMN T_BOARD_POST.POST_TITLE IS '제목';
COMMENT ON COLUMN T_BOARD_POST.POST_CONTENT IS '내용';
COMMENT ON COLUMN T_BOARD_POST.WRITER_ID IS '게시자ID';
COMMENT ON COLUMN T_BOARD_POST.POST_WRITER IS '게시자명[로그인하지 않은 유저가 글 작성 시]';
COMMENT ON COLUMN T_BOARD_POST.NOTICE_YN IS '공지사항여부';
COMMENT ON COLUMN T_BOARD_POST.GROUP_ID IS '그룹번호[부모글 id]';
COMMENT ON COLUMN T_BOARD_POST.GROUP_ORDER IS '게시글순서[원글 포함 답글 순서]';
COMMENT ON COLUMN T_BOARD_POST.DEL_YN IS '삭제여부';
COMMENT ON COLUMN T_BOARD_POST.ADMIN_DELETE_YN IS '관리자삭제여부';
COMMENT ON COLUMN T_BOARD_POST.DELETION_REASON IS '삭제사유';
COMMENT ON COLUMN T_BOARD_POST.VIEWS IS '조회수';
COMMENT ON COLUMN T_BOARD_POST.REG_ID IS '최초등록자ID';
COMMENT ON COLUMN T_BOARD_POST.REG_DATE IS '최초등록일시';
COMMENT ON COLUMN T_BOARD_POST.UDT_ID IS '최종수정자ID';
COMMENT ON COLUMN T_BOARD_POST.UDT_DATE IS '최종수정일시';


/*
  댓글
*/

-- DROP TABLE T_BOARD_COMMENT

CREATE TABLE T_BOARD_COMMENT
(
    COMMENT_ID         integer        NOT NULL, 
    POST_ID            integer        NOT NULL, 
    COMMENT_NAME       varchar(50)    NULL, 
    COMMENT_CONTENT    text           NOT NULL, 
    ADMIN_DELETE_YN    char(1)        NULL, 
    DEL_YN             char(1)        NOT NULL, 
    DELETION_REASON    varchar(50)    NULL, 
    CMT_GROUP_ID       integer        NOT NULL, 
    CMT_GROUP_ORDER    integer        NOT NULL, 
    REG_ID             varchar(50)    NULL, 
    REG_DATE           timestamp      NULL, 
    UDT_ID             varchar(50)    NULL, 
    UDT_DATE           timestamp      NULL, 
    PRIMARY KEY (COMMENT_ID)
);

COMMENT ON TABLE T_BOARD_COMMENT IS '댓글';

COMMENT ON COLUMN T_BOARD_COMMENT.COMMENT_ID IS '댓글ID';
COMMENT ON COLUMN T_BOARD_COMMENT.POST_ID IS '게시글ID';
COMMENT ON COLUMN T_BOARD_COMMENT.COMMENT_NAME IS '작성자명';
COMMENT ON COLUMN T_BOARD_COMMENT.COMMENT_CONTENT IS '내용';
COMMENT ON COLUMN T_BOARD_COMMENT.ADMIN_DELETE_YN IS '관리자삭제여부';
COMMENT ON COLUMN T_BOARD_COMMENT.DEL_YN IS '삭제여부';
COMMENT ON COLUMN T_BOARD_COMMENT.DELETION_REASON IS '삭제사유';
COMMENT ON COLUMN T_BOARD_COMMENT.CMT_GROUP_ID IS '그룹번호';
COMMENT ON COLUMN T_BOARD_COMMENT.CMT_GROUP_ORDER IS '댓글 순서';
COMMENT ON COLUMN T_BOARD_COMMENT.REG_ID IS '최초등록자ID';
COMMENT ON COLUMN T_BOARD_COMMENT.REG_DATE IS '최초등록일시';
COMMENT ON COLUMN T_BOARD_COMMENT.UDT_ID IS '최종수정자ID';
COMMENT ON COLUMN T_BOARD_COMMENT.UDT_DATE IS '최종수정일시';

/*
  게시판 첨부파일
*/

-- DROP TABLE T_BOARD_FILE

CREATE TABLE T_BOARD_FILE
(
    BOARD_FILE_ID     integer         GENERATED BY DEFAULT AS IDENTITY NULL, 
    POST_ID           integer         NOT NULL, 
    FILE_NAME_DEST    varchar(200)    NOT NULL, 
    FILE_NAME         varchar(200)    NOT NULL, 
    FILE_SIZE         integer           NOT NULL, 
    FILE_EXTENSION    varchar(50)     NOT NULL, 
    FILE_PATH         varchar(100)    NOT NULL, 
    FILE_ORDER        integer         NOT NULL, 
    DEL_YN            char(1)         NOT NULL, 
    REG_ID            varchar(50)     NULL, 
    REG_DATE          timestamp       NULL, 
    UDT_ID            varchar(50)     NULL, 
    UDT_DATE          timestamp       NULL, 
    PRIMARY KEY (BOARD_FILE_ID)
);

COMMENT ON TABLE T_BOARD_FILE IS '게시판 첨부파일';

COMMENT ON COLUMN T_BOARD_FILE.BOARD_FILE_ID IS '파일ID';
COMMENT ON COLUMN T_BOARD_FILE.POST_ID IS '게시글ID';
COMMENT ON COLUMN T_BOARD_FILE.FILE_NAME_DEST IS '원본파일명';
COMMENT ON COLUMN T_BOARD_FILE.FILE_NAME IS '파일명';
COMMENT ON COLUMN T_BOARD_FILE.FILE_SIZE IS '파일사이즈';
COMMENT ON COLUMN T_BOARD_FILE.FILE_EXTENSION IS '파일확장자';
COMMENT ON COLUMN T_BOARD_FILE.FILE_PATH IS '파일저장경로';
COMMENT ON COLUMN T_BOARD_FILE.FILE_ORDER IS '파일순서';
COMMENT ON COLUMN T_BOARD_FILE.DEL_YN IS '삭제여부';
COMMENT ON COLUMN T_BOARD_FILE.REG_ID IS '최초등록자ID';
COMMENT ON COLUMN T_BOARD_FILE.REG_DATE IS '최초등록일시';
COMMENT ON COLUMN T_BOARD_FILE.UDT_ID IS '최종수정자ID';
COMMENT ON COLUMN T_BOARD_FILE.UDT_DATE IS '최종수정일시';