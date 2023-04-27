# 구인구직 프로젝트
![image](https://user-images.githubusercontent.com/80329856/232003130-0d034b5c-6d6f-447e-a9ac-aac21f46c4d5.png)

# 시연 영상
![시연 영상](https://youtu.be/ZHjjhayQqIM/0.jpg)(https://youtu.be/ZHjjhayQqIM)

## PPT
[1조_미니프로젝트1_PPT.pdf](https://github.com/KDT-1-miniproject/miniproject1/files/11340943/1._.1_PPT.pdf)

## 시연영상 gif
### 구직자 회원가입 밉 로그인
![1  개인 회원가입 및 로그인](https://user-images.githubusercontent.com/80329856/232674048-640b4547-48a4-4a74-a2bd-c3249d3e1616.gif) 
### 이력서 등록
![2  이력서 등록](https://user-images.githubusercontent.com/80329856/232674072-734882cd-1a9c-400e-b363-fc91009a140f.gif)  
### 공고 지원
![3  공고 지원](https://user-images.githubusercontent.com/80329856/232674078-8d0558ba-7a6f-4b4c-bf50-1c9e1843d346.gif)
### 지원 이력 확인 - 합격 메시지 확인
![4  지원 이력 확인 - 합격 메세지 확인](https://user-images.githubusercontent.com/80329856/232674081-5a3ce57b-080b-4844-baf9-dfd3e737f7d2.gif)
### 스크랩 관리
![5  스크랩 관리](https://user-images.githubusercontent.com/80329856/232674083-40b75371-cb44-4ab1-b427-f4e5207438b0.gif)
### 이력서 삭제
![6  이력서 삭제](https://user-images.githubusercontent.com/80329856/232674086-363f86c2-364f-425a-931f-56d7f829f96a.gif)
### 이력서 수정
![7  이력서 수정](https://user-images.githubusercontent.com/80329856/232674087-95f5ffd5-8ac4-4eea-a067-32de3c122120.gif)
###  개인 회원 정보 수정
![8  개인 회원 정보 수정](https://user-images.githubusercontent.com/80329856/232674089-526f59ef-7693-48f8-b0db-aa7e0e870176.gif)
###  기업 로그인
![9  기업 로그인](https://user-images.githubusercontent.com/80329856/232674092-03d1b45b-97c9-4afb-b18f-5e25e97977ed.gif)
### 공고 등록
![10  공고 등록](https://user-images.githubusercontent.com/80329856/232674098-78d018b7-eecb-4792-9131-65b1981cd3a1.gif)
### 공고 수정 및 삭제
![11  공고 수정 및삭제](https://user-images.githubusercontent.com/80329856/232674102-4c9c46a5-a90b-4fd4-bbcb-2e3aed549471.gif)
### 지원 이력서 관리
![12  지원 이력서 관리](https://user-images.githubusercontent.com/80329856/232674105-176d7e98-1cf3-4bb8-bfce-f23acfe1a620.gif)
### 합격 메세지 보내기
![13  합격 메세지 보내기](https://user-images.githubusercontent.com/80329856/232674108-aa6bf02c-fd81-430a-8f93-76eec409ad4a.gif)
###  추천 인재
![14  추천 인재](https://user-images.githubusercontent.com/80329856/232674110-6fc37203-4c43-4a4d-9239-285eff26fd2f.gif)




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
### 1단계(완료)
김정민
- “메인화면”  개인, 기업 선택 화면
- (개인)회원가입
- (개인)회원가입 화면2 (희망 분야 선택)
- (기업)회원가입 (회사명 사업자번호 회사주소)
- (기업)회원가입 화면2 (로그인에 필요한 정보)
- 로그인 (개인, 기업 )

오주혜
- (개인) 이력서 보기
- (개인) 이력서 작성 (skill resume)
- (개인) 이력서 삭제하기
- (개인) 이력서 프로필 추가

장희선
- (개인)정보 화면 (skill user person)
- (개인)정보 수정
- (기업)정보 화면
- (기업)정보 수정 (logo 추가)

성소정
- (기업)  공고 등록하기
- (기업)  공고 관리하기
- (기업)  공고 삭제하기
- (개인) 구인 공고 메인
- (개인) 구인 공고 디테일

### 2단계(완료)
김정민
- (개인)  구인공고 디테일에서 이력서 지원하기 누르면 나오는 다일로그(모달)
- (개인)  구인 공고 지원하기 (이력서 지원하기)
    - 이미 지원한 공고에는 지원할 수 없도록 하기
    
오주혜
- (기업) 마감됨을 알려줌 → 삭제하도록 권고
    - 삭제 버튼 색(grey → red)변경으로 마감 표시. 
- (개인) 메인에서는 마감됨을 보여줌 → 이왕이면 안보이면 좋겟다
    - (디테일) → 지원하기 버튼 비활성화
    - (개인메인화면) → 마감일자 순으로 정렬 / 마감된 공고는 하루만

장희선
- filter skill insert 및 update, delete 필요
    - insert 이력서 작성, 공고 등록
    - update 개인정보 수정, 이력서 수정, 공고 수정 (delete 후 insert 하는 방식으로 하기)
    - delete 이력서 삭제, 공고 삭제
- (개인)  추천 공고  (개인 회원가입 스킬로 한 번 필터링)
- (기업)  구직자 추천 서비스
- → 이력서 연결해주기 /company/resumeDetail/${id}

성소정
- (기업)  제출된 이력서 관리
    - 리스트 보기 합격/불합격=삭제)
    - 개인 쪽에서 지원한 공고에 표시
    - 기업에서 개인에게 메시지 남기기
    - 개인이 기업이 남긴 메시지 확인하기

### 3단계(완료)
김정민
- 고객센터
- JUnit 테스트  (보기에서 일반적인 SELECT는 안해도 된다, JOIN이 들어가는 경우만 해보기)
    - 개인,기업 회원가입
    - 개인,기업 로그인
    - 개인,기업 개인정보 보기 수정하기
    - 개인 이력서 보기, 쓰기, 수정하기
    - 개인 이력서 지원하기
    
오주혜
- sha-256 - 로그인 회원가입
- 이력서 공개 비공개 설정  → 기업에서 못보게 : 테이블 컬럼 추가해서

장희선
- (개인)  스크랩 하기
- (개인)  스크랩 보기
- (개인)  스크랩 삭제하기
- (기업)  스크랩 하기
- (기업)  스크랩 보기
- (기업)  스크랩 삭제하기

성소정
- 레디스
- JUnit Test
    - 개인 메인 공고 보기
        - 개인 마감시간 보기 : 위에서 같이 비교함
    - 개인 추천 공고 보기
    - 기업 공고 등록, 수정, 삭제
    - 기업 제출된 이력서 합불합 하기
    - 기업 추천 이력서 보기

### 4단계
- 페이징
    - 개인 공고리스트 , 공고추천리스트, 이력서 리스트, 지원이력
    - 기업 공고리스트, 추천 이력서 리스트, 제안 리스트
- 기업에 대한 평점
- (개인)메인에서의 구인 공고 필터링


## 코드 컨벤션
![image](https://user-images.githubusercontent.com/80329856/232003943-c74063a4-a3ec-47d0-9842-bf9e8fc84606.png)

## 프로젝트 아키텍처 : MVC 설계
![image](https://user-images.githubusercontent.com/80329856/232003917-728f01dd-47a2-40bc-92c7-e5cbbb156ebb.png)

## 테이블 설계
![image](https://user-images.githubusercontent.com/80329856/232017269-16d60e51-3727-48e7-abee-6b7469deb8ff.png)

## 협업 전략
### github
- Organaization을 이용해 하나의 팀을 먼저 만들고 레파지토리를 생성 및 세팅
    - 팀장의 레파지토리에 초대하는 것 보다 하나의 팀을 만들어서 같은 레파지토리를 보는 것이 좋겠다 판단
    - 또한 이 팀원으로 두번째 프로젝트를 진행할 때 다시 초대할 일 없이 계속해서 이용 가능함
- master-dev-topic으로 각자의 토픽에 해야 할 일을 설정하고 dev에 merge
### 일정관리
- 처음에는 일정관리 시트를 만들어서 미리 시간이 안되는 날을 체크하여, 가능한 날 주기적으로 오후 7시~9시에 만나서 짧은 회의와 정리를 진행 
