# README
- 개발 기간 : 2024.01.12 ~ 2024.02.29
## SPEC
- 프레임 워크: Spring Boot  
- 지도: 카카오 API

## 업무 일지
- 2024.01.12.  
  - MapController.java, mapstyle.css, map.html 생성 및 구현  
  스프링 서버, 웹 프레임, 최상단 메뉴바, 맵, 줌 구현  
- 2024.01.16.  
  - map.html의 수정, 보완 및 추가  
  줌 컨트롤러 구현과 위치 설정 및 추가
- 2024.01.17.  
  - login화면 구현 중, 대략적인 구조 파악
- 2024.01.18  
  - login화면 구성 완료, 안의 로직 파악 후 세부 로직 추가
- 2024.01.19
  - login화면 구성 완료, 안의 로직 구성 완료, 화면에 띄우기 성공
- 2024.01.22
  - login화면 안 의 로직 구성 완료, 로그인 성공 햇을때 맵 화면으로 넘어가게 함
- 2024.01.23
  - 메뉴 상단 바의 탭 클릭 시 웹 페이지 전환  
  지도 상의 마커 추가
- 2024.01.29  
  - 마커를 추가하고 마커를 클릭 했을 때 팝업을 띄우게 함
- 2024.01.30  
  - 마커를 추가하고 모달창 띄우기 해결
- 2024.01.31
  - 모달창을 뛰우고 안의 로직, 디자인 해결
- 2024.02.01
  - 모달창에 사진 추가 및 모달창 디자인 해결
- 2024.02.05 
  - 모달창이 아닌 레이어 팝업으로 변경 하엿음. 변경 이유는 모달창은 탭의 이동이 이루어지지 않지만 레이어 팝업은 탭의 이동이 이루어지기 때문에 변경함.
- 2024.02.06
  - 팝업안의 내용과 각 레이어 팝업 마다의 로직을 구현함 탭마다 각 탭으로 넘어갈 수 있도록 구현 하였음. 각 탭 마다의 클리어 박스 또한 내용이 달라 지도록 구현 함
- 2024.02.07
  - 지하매설관로 페이지 구성 완료
- 2024.02.13
  - 마커를 여러개 생성 하고 각각 클릭하게 하면 레이어 팝업이 뜨게 함
  
TODO
- 2024.1.17: login 화면 구현 하기 와 각 탭 클릭 시 웹 페이지 넘어가는 부분 구현 하기 (완료)
- 2024.1.18: login 화면 구현 마무리 login 화면에서 넘어가게 되면 map으로 넘어가도록 만들기 (완료)
- 2024.1.19: login 화면 구현 마무리 (완료)
- 2024.1.22: login 화면 넘어가면 map으로 넘어가기 map에서 다른 탭들을 선택 했을때 화면 전환 하기 (완료)
- 2024.1.23: 맵 안에서의 탭을 나누어 안의 로직 구현 하기 (완료)
- 2024.1.24: 맵 상의 마커 클릭 이벤트 추가하기 (완료)
- 2024.1.25: 위 의 일정을 해결 해야함(완료)
- 2024.1.30: 팝업을 뜨고 사라질 때의 버그와 팝의 창의 내용 그리고 팝업을 클릭 했을 때 다른 동작을 하지 않도록 하게 하기(완료)
- 2024.1.31: 모달창 모델 만들기(완료)
- 2024.2.01: 모달창의 세부 로직 만들기 및 사진 업로드 하기(완료)
- 2024.2.05: 모달창의 세부 로직 더 구현 각 탭 마다 로직 구현(완료)
- 2024.2.06: 모달창이 아닌 레이어 팝업으로 바꾸면서 모달창의 로직이 아니라 다른 로직을 구현하여 다르게 넘어갈 수 있도록 한다.(완료)
- 2024.2.07: 레이어 팝업 마무리 및 각 웹 페이지 구현 혹은 맵 안의 검색 창 도입(일부완료)
- 2024.2.08: 웹 페이지 마무리 짖기 및 디자인 구성(미완료)