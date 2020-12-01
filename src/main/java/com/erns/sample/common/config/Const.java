package com.erns.sample.common.config;

public class Const {
	public static final int DEFAULT_PAGESIZE = 10;
    public static final int DEFAULT_ROWSIZE = 10;
    //common code
    public static final int RO_SUCCESS_ACTION = 1;
    public static final int RO_FAIL_ACTION = -1;
    public static final int RO_NOT_VALID_DATA = -10;
    public static final int RO_NO_AUTH = -12;    
    public static final int RO_INVALID_VERSION = -9898;
    public static final int RO_INIT_OBJECT = -5555;
    public static final int RO_CATCHED_EXCEPTOIN = -9999;
    public static final int RO_RELOAD_PAGE = -8888;
    public static final int RO_NO_DATA = -7777;
    public static final int RO_INVALID_STATUS = -7779;
    
    public static final int RO_NO_LOGINED = -13;
    
    public static final boolean DELETE_PHYSICAL_FILE = true;
    
    public static final String AX_SUCCESS = "S";
    public static final String AX_FAIL = "F";
    
    public static final String INVALID_VERSION = "INVALID_VERSION";
    
    //Session Key
    public static final String SESSION_KEY_USER = "ts2020User";
    public static final String SESSION_KEY_PASSPHRASE = "ts2020passphrase";
    
    //Auth
    public static final String KEY_AUTH_TOKEN = "authtkn";
    
    //thumnail
    public static final String AUTO_THUMB_EXT = "png";
    public static final int AUTO_THUMB_MAX_WIDTH = 500;
    public static final int AUTO_THUMB_MAX_HEIGHT = 500;
    public static final String AUTO_THUMB_BACKGROUD_COLOR = "#FFFFFF";
    public static final String AUTO_THUMB_BORDER_COLOR = "#CCCCCC";  
    
    
    //prop key
    public static final String PROP_KEY_AUTH_KEY = "system.auth.key";
    public static final String PROP_KEY_AUTH_JWT_EXPIRED = "system.auth.jwt.expired";
    public static final String PROP_KEY_AUTH_JWT_MOBILE_EXPIRED = "system.auth.jwt.mobile.expired";
    public static final String PROP_KEY_UPLOAD_PATH = "system.uploadpath";
    public static final String PROP_KEY_THUMB_PATH = "system.thumbpath";
    
    //mail
    public static final String SYSTEM_EMAIL = "SYSTEM";
    public static final String FIND_PW_MAIL_TITLE = "[자동차안전연구원] 임시비밀번호";
    
    //common pages
    public static final String PAGE_LOGIN = "/login/login.do";

    //file type
    public static enum TYPE_FILE { 
    	FT_01	//확인자 사인
    	, FT_02	//검사표 엑셀
    	, FT_03	//검사 항목 엑셀
    	, FT_04	//검사 사진(메인)
    	, FT_05	//시설인력 첨부사진
    	//, FT_06	//검사 항목 사진(항목 설명시 사용) //사용안함
    	, FT_07 //검사 항목 결과사진
    	, FT_08 //사용자 도장
    	, FT_09 //검사 첨부파일
    	;
    	public static TYPE_FILE find(String name) {
    		for(TYPE_FILE e : TYPE_FILE.values()) {
    			if(e.name().equals(name)) return e;
    		}    		
    		return null;
    	}
    };
    
    //평가결과 Flag
    public static enum RESULT_VAL {
    	FAIL(0, "0")	//부적합  ("0")
    	, PASS(1, "1")  //적합    ("1")
    	, NA(2, "2")    //해당없음("2")
    	;
    	
    	private int index;
    	private String code;
    	
    	private RESULT_VAL(int index, String code) {
    		this.index = index;
    		this.code = code;
    	}
    	
    	public int getIndex() {
			return index;
		}
    	
		public String getCode() {
			return code;
		}

		public static RESULT_VAL find(String name) {
    		for(RESULT_VAL e : RESULT_VAL.values()) {
    			if(e.name().equals(name)) return e;
    		}    		
    		return null;
    	}
		
		public static RESULT_VAL findByCode(String code) {
    		for(RESULT_VAL e : RESULT_VAL.values()) {
    			if(e.code.equals(code)) return e;
    		}    		
    		return null;
    	}
    };
    
    //검사 마스터 상태
    public static enum INSP_MST_STATUS {
    	IMS_000	  //승인등록중
    	, IMS_010 //임시저장
    	, IMS_100 //형식승인완료
    	, IMS_210 //확인검사중
    	, IMS_200 //확인검사완료
    	, IMS_310 //제작차검사중
    	, IMS_300 //제작차검사완료
    	, IMS_410 //운행차검사중
    	, IMS_400 //운행차검사완료
    	, IMS_500 //최종완료
    	;
    	public static INSP_MST_STATUS find(String name) {
    		for(INSP_MST_STATUS e : INSP_MST_STATUS.values()) {
    			if(e.name().equals(name)) return e;
    		}    		
    		return null;
    	}
    };

    //insp type
    //형식승인, 확인검사, 제작차검사, 운행차검사 
    public static enum INSP_TYPE {
    	NONE    //NONE 
    	, IT_100 //형식승인
    	, IT_200 //확인검사
    	, IT_300 //제작차검사
    	, IT_400 //운행차검사
    	;
    	public static INSP_TYPE find(String name) {
    		for(INSP_TYPE e : INSP_TYPE.values()) {
    			if(e.name().equals(name)) return e;
    		}    		
    		return null;
    	}
    };
    
    //insp status
    public static enum INSP_STATUS {
    	IS_300  //검사중
    	,IS_500 //검사완료    	
    	,IS_900 //불합격
    	,IS_999 //삭제
    	;
    	public static INSP_STATUS find(String name) {
    		for(INSP_STATUS e : INSP_STATUS.values()) {
    			if(e.name().equals(name)) return e;
    		}    		
    		return null;
    	}
    };
    
    //공통코드 모음
    public static enum CODE_MST {
    	DRIVING_STYLE	, // "주행방식"
    	ENGN_TP	, // "원동기형식"
    	FCLTY_CATE	, // "시설인력 구분"
    	FCLTY_CNTRY	, // "시설인력 제작사"
    	FILE_TP	, // "첨부파일"
    	FORM_PRESET_TP	, // "양식 프리셋타입"
    	INSP_DETAIL	, // "검사항목 세부사항"
    	INSP_LARGE	, // "검사항목 대형구분"
    	INSP_MST_STATUS	, // "검사마스터상태"
    	INSP_PRESET_TP	, // "검사 프리셋타입"
    	INSP_STATUS	, // "검사상태"
    	INSP_TYPE	, // "검사종류"
    	MCHN_CD	, // "기계종류"
    	MCHN_TP	, // "기계분류"
    	PRESET_SIGN	, // "검사프리셋 항목기호"
    	RESULT_VAL	, // "판정값"
    	USER_AUTH	, // "사용자 권한"
    	USER_RANK	, // "사용자 직급"
    	
    	;
    	public static CODE_MST find(String name) {
    		for(CODE_MST e : CODE_MST.values()) {
    			if(e.name().equals(name)) return e;
    		}    		
    		return null;
    	}
    }
    
    //
    public static enum INSP_ITEM_CATE { 
    	NONE, CATE1, CATE2, CATE3
    	;
    	public static INSP_ITEM_CATE find(String name) {
	    	for(INSP_ITEM_CATE e : INSP_ITEM_CATE.values()) {
				if(e.name().equals(name)) return e;
			}    		
			return null;
    	}
    };
    
    public static enum MCHN_CD {
    	MC_000	//공통
    	,MC_001	//불도저
    	,MC_002	//굴착기
    	,MC_003	//로더
    	,MC_004	//지게차
    	,MC_005	//스크레이퍼
    	,MC_006	//덤프트럭
    	,MC_007	//기중기
    	,MC_008	//모터그레이더
    	,MC_009	//롤러
    	,MC_010	//노상안정기
    	,MC_011	//콘크리트뱃칭플랜트
    	,MC_012	//콘크리트피니셔
    	,MC_013	//콘크리트살포기
    	,MC_014	//콘크리트믹서트럭
    	,MC_015	//콘크리트펌프
    	,MC_016	//아스팔트믹싱플랜트
    	,MC_017	//아스팔트피니셔
    	,MC_018	//아스팔트살포기
    	,MC_019	//골재살포기
    	,MC_020	//쇄석기
    	,MC_021	//공기압축기
    	,MC_022	//천공기
    	,MC_023	//항타및항발기
    	,MC_024	//자갈채취기
    	,MC_025	//준설선
    	,MC_026	//특수건설기계
    	,MC_027	//타워크레인
    	,MC_999	//기타
    	
    	;
    	public static MCHN_CD find(String name) {
    		for(MCHN_CD e : MCHN_CD.values()) {
    			if(e.name().equals(name)) return e;
    		}    		
    		return null;
    	}
    };
    
    //시설인력 제작사
    public static enum FCLTY_CNTRY {
    	FC_100	//제작ㆍ조립
    	,FC_200	//수입사
    	
    	;
    	public static FCLTY_CNTRY find(String name) {
    		for(FCLTY_CNTRY e : FCLTY_CNTRY.values()) {
    			if(e.name().equals(name)) return e;
    		}    		
    		return null;
    	}
    };
    
    public static enum DRIVING_STYLE {
	    DS_000	//공통
	    ,DS_100	//무한궤도식
	    ,DS_200	//타이어
	    
	    ;
    	public static DRIVING_STYLE find(String name) {
    		for(DRIVING_STYLE e : DRIVING_STYLE.values()) {
    			if(e.name().equals(name)) return e;
    		}    		
    		return null;
    	}
    };
    	
    public static enum ENGN_TP {
	    ET_000	//공통
	    ,ET_100	//전기
	    ,ET_200	//디젤
	    ,ET_300	//가스
	    ,ET_400	//수소
	    
	    ;
    	public static ENGN_TP find(String name) {
    		for(ENGN_TP e : ENGN_TP.values()) {
    			if(e.name().equals(name)) return e;
    		}    		
    		return null;
    	}
    };
    	
    public static enum INSP_DETAIL {
	    ID_000	//공통
	    ,ID_100	//토공
	    ,ID_200	//트럭
	    
	    ;
    	public static INSP_DETAIL find(String name) {
    		for(INSP_DETAIL e : INSP_DETAIL.values()) {
    			if(e.name().equals(name)) return e;
    		}    		
    		return null;
    	}
    };
    	
    public static enum INSP_LARGE {
	    IL_000	//공통
	    ,IL_100	//대형
	    
	    ;
    	public static INSP_LARGE find(String name) {
    		for(INSP_LARGE e : INSP_LARGE.values()) {
    			if(e.name().equals(name)) return e;
    		}    		
    		return null;
    	}
    };    
    
    public static enum USER_AUTH {
    	UA_01	//관리자
	    ,UA_02	//연구원
	    
	    ;
    	public static USER_AUTH find(String name) {
    		for(USER_AUTH e : USER_AUTH.values()) {
    			if(e.name().equals(name)) return e;
    		}    		
    		return null;
    	}
    };   
}
