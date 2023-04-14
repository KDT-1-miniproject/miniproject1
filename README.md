# 구인구직 프로젝트
![image](https://user-images.githubusercontent.com/80329856/232003130-0d034b5c-6d6f-447e-a9ac-aac21f46c4d5.png)

## 기술스택
![image](https://user-images.githubusercontent.com/80329856/232003244-16c70937-4628-4776-b315-eb2f4d6e5882.png)
- JDK 11
- Springboot 2.7.8
- MyBatis
- 테스트 h2 디비
- 프로덕션(배포) MySQL 디비
- HTML
- CSS
- JAVAScript
- Bootstrap
- JSP
- Redis

## 모델링
### 1단계
- user 로그인 정보
    - id, username, password (DTO로 만들어서)
- person_info (개인 정보)
- company_info (기업 정보)
    - 둘의 상세 내용이 다르기 때문에 아예 구분(회원가입 부분에서..)
- 직무 테이블 (skill)
- job_post (구인 공고)
- resume (이력서)
### 2단계
- user_proposal 
- proposla_pass
- skill_filter
### 3단계
- person_scrap (개인 관심)
- company_scrap
- person_customer_service
- company_customer_service

## 기능정리
### 1단계 (완료)
- 개인 
    - 회원가입, 로그인, 개인정보 보기, 수정
    - 이력서 등록, 보기, 수정, 삭제
    - 구인 공고 메인, 디테일
- 기업  
    - 회원가입, 로그인, 개인정보 보기, 수정
    - 공고 등록, 보기, 수정, 삭제
### 2단계  (완료)
- 개인
    - 공고 마감일 보기 및 정렬, 추천 공고 띄우기
    - 이력서 지원하기 
- 기업
    - 공고 마감일 보기:삭제 권고
    - 추천 구직자 이력서 보기
    - 제출된 이력서 보기 , 합불합 표시 및 합격시 메시지 남기기
### 3단계  (완료)
- Redis 설정
- 로그인 회원가입시 Sha256 + salt 이용하기
- JUnit Test 
- 개인
    - 공고 스크랩 하기, 삭제
    - 이력서 공개 비공개 설정
- 기업
    - 구직자 이력서 스크랩 하기, 삭제
### 4단계
- 페이징
- 기업에 대한 평점
- 메인 구인 공고 필터링 

## 코드 컨벤션
![image](https://user-images.githubusercontent.com/80329856/232003943-c74063a4-a3ec-47d0-9842-bf9e8fc84606.png)

## 프로젝트 아키텍처 : MVC 설계
![image](https://user-images.githubusercontent.com/80329856/232003917-728f01dd-47a2-40bc-92c7-e5cbbb156ebb.png)

## 테이블 설계
![image](https://user-images.githubusercontent.com/80329856/232004012-a5d0e812-f50b-46f2-812c-f9488aecacd4.png)

## 협업 전략
### github
- Organaization을 이용해 하나의 팀을 먼저 만들고 레파지토리를 생성 및 세팅
    - 팀장의 레파지토리에 초대하는 것 보다 하나의 팀을 만들어서 같은 레파지토리를 보는 것이 좋겠다 판단
    - 또한 이 팀원으로 두번째 프로젝트를 진행할 때 다시 초대할 일 없이 계속해서 이용 가능함
- master-dev-topic으로 각자의 토픽에 해야 할 일을 설정하고 dev에 merge
### 일정관리
- 처음에는 일정관리 시트를 만들어서 미리 시간이 안되는 날을 체크하여, 가능한 날 주기적으로 오후 7시~9시에 만나서 짧은 회의와 정리를 진행 
