<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<c:set var="jsKey" value="e0a816d9a8b32217e589b55d16538674"></c:set>
<c:set var="restKey" value="b133392134b7c019eedc99601b78c0ef"></c:set>

<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>

<!-- kakao map -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=${jsKey}"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=${jsKey}&libraries=LIBRARY"></script>

<!-- kakao login -->
<script src="https://developers.kakao.com/sdk/js/kakao.min.js"></script>

<div>
	<input id="valueSearch" type="text"/>
	<button id="btnSearch">검색</button>
</div>

<div class="mapWrap" style="margin-top:10px;">
	<div id="map" style="width:600px; height:400px;"></div>
</div>

<div id="coordXY"></div>

<div class="loginWrap" style="margin-top:10px;">
	<a id="kakao-login-btn"></a>
</div>

<script>
$(function(){
	/* $.ajax({
        url:'/api/user/test.do',
        type:'POST',
	    success:function(data){
			console.log(data);
	    },
	    error : function(e){
			console.log(e);
	    }
	}); */
	
	// 마커를 표시할 위치와 title 객체 배열입니다 
	var positions = [
	    {
	        title: '카카오', 
	        latlng: new kakao.maps.LatLng(33.450705, 126.570677)
	    },
	    {
	        title: '생태연못', 
	        latlng: new kakao.maps.LatLng(33.450936, 126.569477)
	    },
	    {
	        title: '텃밭', 
	        latlng: new kakao.maps.LatLng(33.450879, 126.569940)
	    },
	    {
	        title: '근린공원', 
	        latlng: new kakao.maps.LatLng(33.451393, 126.570738)
	    }
	];
	
	// KAKAO MAP
	
	{
		var coordXY = document.getElementById('coordXY');
		var container = document.getElementById('map');
		var options = {
			center: positions[0].latlng, // 위도경도
			level: 3 //지도의 레벨(확대, 축소 정도)
		};
		
		var map = new kakao.maps.Map(container, options); // 지도 생성 및 객체 리턴
		
		for (var key in positions) {
			var mData = positions[key];
			
		    // 마커를 생성합니다
		    var marker = new kakao.maps.Marker({
		        map: map, // 마커를 표시할 지도
		        position: mData.latlng, // 마커를 표시할 위치
		        title : mData.title, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
		        clickable: true // 마커를 클릭했을 때 지도의 클릭 이벤트가 발생하지 않도록 설정합니다
		    });
		    
		 	// 마커에 클릭이벤트를 등록합니다
		    kakao.maps.event.addListener(marker, 'click', function() {
		    	var lat = this.getPosition().La;
		    	var lng = this.getPosition().Ma;
		    	var title = this.getTitle();
		    });
		}
	}
	
	
	
	// KAKAO LOGIN
	
	{
		// 사용할 앱의 JavaScript 키를 설정해 주세요.
		Kakao.init('${jsKey}');
		
		// 카카오 로그인 버튼을 생성합니다.
		Kakao.Auth.createLoginButton({
			container: '#kakao-login-btn',
			success: function(authObj) {
				alert(JSON.stringify(authObj));
			},
			fail: function(err) {
				alert(JSON.stringify(err));
			}
		});
	}
	
	
	// event
	
	{
		// 엔터키
		$("#valueSearch").keyup(function(){
			enterAction($("#btnSearch"));
		});
		
		// 검색
		$("#btnSearch").click(function(){
			var valueSearch = $("#valueSearch").val();
			
			if(!valueSearch){
				alert("검색어를 입력해주세요.");
				return false;
			}
			
		 	$.ajax({
	           url:'https://dapi.kakao.com/v2/local/search/address.json?query='+encodeURIComponent(valueSearch),
	           type:'GET',
	           headers: {'Authorization' : 'KakaoAK ${restKey}'},
			   success:function(data){
			       var addressList = data.documents;
			       
			       console.log(addressList);
			   },
			   error : function(e){
			       console.log(e);
			   }
			});
		});	
	}
});

// 엔터키함수
function enterAction(clickAbleObj) {
	if(clickAbleObj) {
		if(window.event.keyCode == 13) {
			clickAbleObj.click();
		}
	}
}
</script>