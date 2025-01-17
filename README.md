# Wanada PC
컴퓨터 / 부품 소개 사이트


## 🖥️ 프로젝트 소개
다나와 PC 를 참고해 만든 Spring boot / Thyemleaf 프로젝트


## 🕰️ 개발 기간
* 1차 (JSP) : 24.10.10 ~ 24.10.26
* 2차 (Spring Boot (Thymeleaf) / DB) : 24.11.18 ~ 24.12.19


### 🧑‍🤝‍🧑 멤버 구성
 - Team Leader : 안진혁 - index, pc 상세 페이지, 검색 페이지, 마이 페이지, 유틸리티(헤더, 푸터, 최상위 버튼)
 - Sub Leader : 김현규 - 상품 상세 페이지, 카테고리 별 상품 페이지, DB 데이터 구축 및 입력
 - Team Member 1 : 서광제 - 커뮤니티
 - Team Member 2 : 조유남 - 로그인, 회원가입, 회원정보 수정


### ⚙️ 개발 환경
 - `Java 17`
 - **IDE** : STS 4.26.0
 - **Framework** : Spring Boot (Thymleaf)
 - **Database** : Oracle


## 📌 주요 기능
### 🧑‍🤝‍🧑 안진혁 (Team Leader)
#### Index 페이지 - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki">상세보기(WIKI)</a>
 - 이미지 슬라이드
 - 네비게이션 메뉴
 - 메뉴 별 Pc 리스트
 - 페이지 최상위로 이동 버튼
 - 커뮤니티 최신 글 표시
 - 로그인 시 헤더의 메뉴 변경
#### Pc 리스트 페이지 - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC-%EB%B3%84-Pc-%EB%A6%AC%EC%8A%A4%ED%8A%B8">상세보기(WIKI)</a>
 - 카테고리 별 Pc 정보 (DB 의 상품 테이블들을 참조하여 Pc 테이블 생성)
 - 카테고리 메뉴 선택 시 카테고리에 맞는 pc 리스트를 표시 (성능 순으로 4개까지)
 - 추천 pc 리스트 표시 (성능 순으로 4개까지)
#### Pc 상세 페이지 - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/pc-%EC%83%81%EC%84%B8-%ED%8E%98%EC%9D%B4%EC%A7%80">상세보기(WIKI)</a>
 - Pc 정보 (DB 의 상품 테이블들을 참조하여 Pc 테이블 생성)
 - 상세보기 버튼 활용하여 pc 부품들의 상세 정보 표시
#### 검색 페이지 - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/%EA%B2%80%EC%83%89-%ED%8E%98%EC%9D%B4%EC%A7%80">상세보기(WIKI)</a>
 - 검색 내용 표시
 - 커뮤니티 글 검색
 - 상품 정보 검색
#### 마이 페이지 - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/%EB%A7%88%EC%9D%B4-%ED%8E%98%EC%9D%B4%EC%A7%80">상세보기(WIKI)</a>
 - 세부 페이지(내가 쓴 글, 회원정보 수정)로 이동
 - 회원정보 수정 클릭 시 비밀번호 확인 팝업 창 표시

#
### 🧑‍🤝‍🧑 조유남 (Team Membmer)
#### 로그인 - <a href="">상세보기(WIKI)</a>
 - DB 의 정보와 비교
 - 로그인 시 session 생성
#### 회원가입 - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85">상세보기(WIKI)</a>
 - 유효성 검사
 - ID 중복체크
 - 패스워드 인코딩
#### 회원정보수정 - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/%ED%9A%8C%EC%9B%90%EC%A0%95%EB%B3%B4-%EC%88%98%EC%A0%95">상세보기(WIKI)</a>
 - 비밀번호 확인 후 페이지 이동

#
### 🧑‍🤝‍🧑 김현규 (Sub Leader)
#### 카테고리 별 상품 페이지 - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC-%EB%B3%84-%EC%83%81%ED%92%88-%ED%8E%98%EC%9D%B4%EC%A7%80">상세보기(WIKI)</a>
 - 제품 목록
 - 상품 범주별 항목 보여주기
#### 상품 상세 페이지 - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/%EC%83%81%ED%92%88-%EC%83%81%EC%84%B8-%ED%8E%98%EC%9D%B4%EC%A7%80">상세보기(WIKI)</a>
 - 제품 목록
 - 카탈로그
 - 가격 및 이미지

#
### 🧑‍🤝‍🧑 서광제 (Team Member)
#### 커뮤니티 - <a href="">상세보기(WIKI)</a>
 - 글 작성, 읽기, 수정, 삭제 (CRUD)
 - 글 작성, 수정, 삭제는 로그인 시 가능
