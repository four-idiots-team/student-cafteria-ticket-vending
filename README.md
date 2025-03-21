**학생식당-Ticket-Vending Web application**
  - 학생식당 결제 및 서비스 기능 지원
  - 간편 결제를 이용한 주문 대기 시간 등을 절약한 Website 구축 

  기술 스택 (Skill Stack)

  # 프론트엔드 (Frontend) Presentation-Tier
    - HTML5: 
            웹 페이지의 구조를 설계하고 
            콘텐츠를 마크업
    - CSS3: 
            스타일링 및 레이아웃 디자인 (Flexbox, Grid 사용)
    - JavaScript (ES6+): 
            사용자의 편의성 제공, 기능 및 구현
            Mobile 호환성을 높이기 위해 form 구축

  # 백엔드 (Backend) Middle-Tier
    - Node.js: 
              서버 사이드 자바스크립트 런타임 환경
    - MySQL: 
              MySQL 데이터베이스 사용

    - Spring Boot:
    - Spring Data JPA:
            Hibernate: 
                      Spring Data JPA의 구현채 -> 동적Query 생성X -> ORM(Object Relational Mapping)으로 Entity를 맵핑 
  # DataBase Data-Tier
    - MYSQL
    
Spring Security (JSON Web Token): 사용자 인증 및 권한 부여
Bcrypt: 비밀번호 암호화
기타 도구 및 라이브러리
Git: 버전 관리 도구

배포 (Deployment)
AWS (Amazon Web Services): 클라우드 서버 및 데이터베이스 호스팅





##완료사항



- Spring Security 로그인 기능 구현 완료
- home.html(메인 페이지) -> main.html로 교체 예정, login.html(로그인 페이지), join.html(회원가입 페이지), admin.html(관리자 페이지)
- main.html -> .html, .css, .js로 파일 Partition 완료

  
##추후 일정



  - 로그인 페이지 Decoration(꾸미기)
  - 결제 기능 구현
  - 장바구니 페이지 구현
  - Oauth2 API 사용하여 구글 로그인, 카카오 로그인, 네이버 로그인 인증 절차 구현할 예정

