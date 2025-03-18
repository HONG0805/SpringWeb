# :full_moon: **프로젝트 소개**
 이 프로젝트는 Spring Framework의 MVC(Model-View-Controller) 모델2 아키텍처를 활용하여 게시판형 웹사이트를 만드는 것에 초점을 맞추고 있습니다. Spring Framework를 선택한 이유는 안정성과 확장성, 그리고 개발 생산성을 향상시킬 수 있는 다양한 기능들 때문입니다. 또한 MVC패턴을 사용함으로써 코드의 구조화와 유지보수성을 쉽게 유지할 수 있습니다. 

  **개발 기간 :** 2024 . 3.12 - 2024 . 5.17  

  **개발 인원 :** 단독
  
 ***
 
# 📚 **기술 스택 (Tech Stack)**  

## 🎨 **Frontend**  
🖥️ **Markup & Styling**  
- HTML5 / CSS3  
- Bootstrap (CSS 프레임워크)  

⚡ **JavaScript & Libraries**  
- JavaScript (ES6)  
- jQuery (DOM 조작 및 이벤트 핸들링)  
-  Ajax (비동기 데이터 처리)  

🛠️ **Template Engine**  
- Thymeleaf (Spring 기반 템플릿 엔진)  

---

## 🏗️ **Backend**  
🖥️ **Programming Language**  
-  Java 8+  

🚀 **Framework & Tools**  
- 🌿 Spring Framework  
  -  Spring MVC (Model-View-Controller 패턴 적용)  
  -  Spring Security (인증 및 권한 관리)  
  -  MyBatis (SQL 매핑 프레임워크)  

💾 **Database**  
-  Oracle  
-  MySQL  

🔗 **API & Logging**  
-  RESTful API 설계  
-  Logback / SLF4J (로그 관리)  

---

## 🌐 **Server & Deployment**  
-  **Web Server:** Apache Tomcat  
-  **운영 환경:** 로컬 환경 (운영 서버 배포 미적용)  

---

## 🛠️ **Etc.**  
-  **Version Control:** Git & GitHub  
-  **Dependency Management:** Maven  
-  **Testing:** JUnit  


  
  ***
 
# :pushpin: **주요 기능**

 ### :star: **게시판 관리 기능**  
 사용자가 게시물을 작성, 수정, 삭제할 수 있는 기능을 제공합니다. 
 페이징 처리를 적용하여 대량의 데이터도 효율적으로 관리할 수 있도록 하였습니다.
 ### :star: **인증 및 권한 관리**  
 Spring Security를 이용하여 비밀번호 암호화(BCrypt), CSRF 방어, 세션 관리, 자동 로그인(Remember-Me) 기능을 구현하였습니다. 
 관리자와 일반 사용자 역할(Role) 분리를 통해 보안성을 강화하였습니다. 
 ### :star: **댓글 기능**  
 게시물에 대한 댓글을 작성, 수정, 삭제할 수 있으며, Ajax 기술을 활용하여 페이지 새로고침 없이 동적 업데이트가 가능하도록 구현하였습니다.
 이를 통해 사용자 경험(UX)을 향상시켰습니다. 
 ### :star: **검색 기능**  
 게시물의 제목, 내용, 작성자 등을 기준으로 검색할 수 있으며, 페이징 처리를 적용하여 검색 결과를 효율적으로 확인할 수 있도록 구현하였습니다.
  ***

# :pushpin: **기능 소개**

## **메인메뉴**
  <img src="https://github.com/HONG0805/SpringWeb/assets/112541200/cd3c2217-a6d0-423c-a15f-50d69fa7e858" width=400/>

## **게시물 작성(수정/삭제)**
  <img src="https://github.com/HONG0805/SpringWeb/assets/112541200/bcf3bb03-a968-422b-8655-9ea782540bbe" width=345/> <img src="https://github.com/HONG0805/SpringWeb/assets/112541200/acc8ee01-3063-44b0-9d8a-a82a08948eca" width=350/> <img src="https://github.com/HONG0805/SpringWeb/assets/112541200/e63cdc4f-6a3d-43d5-b642-516dc2ceeb31" width=300/>
  
## **게시물 댓글작성(수정/삭제)**
<img src="https://github.com/HONG0805/SpringWeb/assets/112541200/0a1c1c90-b70b-42d0-bf7a-647cc6b46984" width=330/> <img src="https://github.com/HONG0805/SpringWeb/assets/112541200/05974906-2e21-4bc4-9b03-0dc3d7cc3033" width=300/> <img src="https://github.com/HONG0805/SpringWeb/assets/112541200/e329a310-7649-45ae-b762-be0066c383e5" width=310/>


## **게시물 검색**
<img src="https://github.com/HONG0805/SpringWeb/assets/112541200/72fce6f2-d639-420b-9ce8-1cfcdd72af7b" width=290/> <img src="https://github.com/HONG0805/SpringWeb/assets/112541200/7b75acca-33b6-4ebd-9296-e07df3835041" width=360/> <img src="https://github.com/HONG0805/SpringWeb/assets/112541200/458501d0-0e2a-49bc-bfdd-2e7a1a089014" width=350/>

## **로그인**
**remember me : 자동 로그인 기능**  
<img src="https://github.com/HONG0805/SpringWeb/assets/112541200/101df4c8-f948-40d3-b1aa-71a5eb5cfcc7"/> ![image](https://github.com/HONG0805/SpringWeb/assets/112541200/f5ab7643-b5ef-4a7c-916c-2d8f40a8a74e)

<img src="https://github.com/HONG0805/SpringWeb/assets/112541200/2a2727dd-034f-4c34-a97b-e26ba7d2fc64"/> ![image](https://github.com/HONG0805/SpringWeb/assets/112541200/b56d0e83-c7a5-4aac-94bb-95f1a1af205d)



  
# :clipboard: **현재 진행 상황**  
현재는 프로젝트의 안정성을 높이기 위해 지속적으로 개선 작업을 진행하고 있습니다.
 ***
 
# :date: **다음 단계**  
 ***



