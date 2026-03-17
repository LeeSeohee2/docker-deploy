/**
 *  sign.js
 */

console.log("자바스크립트 연결함!");

function checkPassword(){
	const pw = document
			   .getElementById("password")
			   .value;
	const pwCheck = document
			  .getElementById("passwordCheck")
			  .value;
			  
	const pwMsg = document
			  	 .getElementById("pwMessage");
			  
	console.log(pw);
	console.log("확인용:", pwCheck);	
	
	if(pw === pwCheck){
		pwMsg.innerText = "비밀번호가 일치합니다.";
		pwMsg.style.color = "green";
	}else{
		pwMsg.innerText = "비밀번호가 일치하지 않습니다!";
		pwMsg.style.color = "red";
	}
			 
}

//실제 아이디를 누르면 no를 넘긴다.
function goDetail(no){
	console.log("넘어온 값:" + no);
	location.href = "/detail/"+ no;
	
}
// 삭제하기 버튼을 클릭하면 실행
function goRemove(no){
	console.log("넘어온 값:" + no);
	location.href = "/delete/"+ no;
	
}






