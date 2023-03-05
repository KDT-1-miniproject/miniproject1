INSERT INTO user_tb(email, password, p_info_id, created_at) values('ssar@nate.com', '1234',1, now());
INSERT INTO user_tb(email, password, p_info_id, created_at) values('cos@nate.com', '1234',2, now());

INSERT INTO user_tb(email, password, c_info_id, created_at) values('init@nate.com', '1234',1, now());
INSERT INTO user_tb(email, password, c_info_id, created_at) values('kakao@nate.com', '1234',2, now());
INSERT INTO user_tb(email, password, c_info_id, created_at) values('google@nate.com', '1234',3, now());


INSERT INTO person_info_tb(name,phone,address,birthday,created_at) 
                values('쌀', '01000000000','부산 부산진구 부전동 000-00', '2000-04-10 00:00:00', now());
INSERT INTO person_info_tb(name,phone,address,birthday,created_at) 
                values('코스', '01000000000','부산 부산진구 부전동 000-00', '1998-07-22 00:00:00', now());

INSERT INTO company_info_tb(logo, name, number, boss_name, address, manager_name, manager_phone,size,cyear, created_at) 
                values('/images/logo.png','이닛', '00000000000', '보스' ,'부산 부산진구 부전동 000-00', '이니티', '01000000000',50,2022, now());
INSERT INTO company_info_tb(logo, name, number, boss_name, address, manager_name, manager_phone, size,cyear,created_at)
                values('/images/kakao.jpg','카카오', '00000000000', '카카오사장', '부산 부산진구 부전동 000-00', '카카오', '01000000000',100,2010, now());
INSERT INTO company_info_tb(logo, name, number,  boss_name, address, manager_name, manager_phone, size,cyear,created_at) 
                values('/images/google.png','구글', '00000000000', '구글사장', '부산 부산진구 부전동 000-00', '구글', '01000000000',200,1998, now());

INSERT INTO job_post_tb(title,c_info_id,career,pay,condition,start_hour,end_hour,deadline,c_intro,job_intro,created_at) values('성실한 개발자 구합니다.',1,0,'3000만원','계약직', '09:00:00','18:00:00','2023-03-04 00:00:00','좋은직장','위대한직장',now());
INSERT INTO job_post_tb(title,c_info_id,career,pay,condition,start_hour,end_hour,deadline,c_intro,job_intro,created_at) values('멋진 개발자 구합니다.',1,0,'3000만원','계약직', '09:00:00','18:00:00','2023-03-15 00:00:00','좋은직장','위대한직장',now());
INSERT INTO job_post_tb(title,c_info_id,career,pay,condition,start_hour,end_hour,deadline,c_intro,job_intro,created_at) values('열심히하는 개발자 구합니다.',1,0,'3000만원','계약직', '09:00:00','18:00:00','2023-03-07 00:00:00','좋은직장','위대한직장',now());
INSERT INTO job_post_tb(title,c_info_id,career,pay,condition,start_hour,end_hour,deadline,c_intro,job_intro,created_at) values('백엔드 개발자 구합니다.',1,0,'3000만원','계약직', '09:00:00','18:00:00','2023-03-10 00:00:00','좋은직장','위대한직장',now());
INSERT INTO job_post_tb(title,c_info_id,career,pay,condition,start_hour,end_hour,deadline,c_intro,job_intro,created_at) values('프론트 개발자 구합니다.',2,3,'4000만원','정규직', '09:00:00','18:00:00','2023-03-20 00:00:00','좋은직장','위대한직장',now());
INSERT INTO job_post_tb(title,c_info_id,career,pay,condition,start_hour,end_hour,deadline,c_intro,job_intro,created_at) values('프론트 개발자 구합니다.',3,3,'4000만원','정규직', '09:00:00','18:00:00','2023-03-20 00:00:00','좋은직장','위대한직장',now());

INSERT INTO resume_tb(p_info_id,profile,title,portfolio,self_intro,created_at) values(1,'/images/profile1.jpg','성실한 지원자입니다','https://naver.com','저는성실해요',now());
INSERT INTO resume_tb(p_info_id,profile,title,portfolio,self_intro,created_at) values(1,'/images/profile1.jpg','멋있는 지원자입니다','https://naver.com','저는성실해요',now());
INSERT INTO resume_tb(p_info_id,profile,title,portfolio,self_intro,created_at) values(1,'/images/profile1.jpg','열심인 지원자입니다','https://naver.com','저는성실해요',now());
INSERT INTO resume_tb(p_info_id,profile,title,portfolio,self_intro,created_at) values(2,'/images/profile1.jpg','코스입니다','https://naver.com','코스는 성실해요',now());

INSERT INTO skill_tb(p_info_id, post_id, resume_id, skills,created_at) values(1, 0, 0,'Java,Javascript,Html',now());
INSERT INTO skill_tb(p_info_id, post_id, resume_id, skills,created_at) values(2, 0, 0,'Java,Javascript,Html',now());
INSERT INTO skill_tb(p_info_id, post_id, resume_id, skills,created_at) values(0, 1, 0,'Java,Javascript,Sql',now());
INSERT INTO skill_tb(p_info_id, post_id, resume_id, skills,created_at) values(0, 2, 0,'Javascript,Sql,Html',now());
INSERT INTO skill_tb(p_info_id, post_id, resume_id, skills,created_at) values(0, 3, 0,'Java,Sql,Html',now());
INSERT INTO skill_tb(p_info_id, post_id, resume_id, skills,created_at) values(0, 4, 0,'Java,Sql,Android',now());
INSERT INTO skill_tb(p_info_id, post_id, resume_id, skills,created_at) values(0, 5, 0,'Java,Sql,Android',now());
INSERT INTO skill_tb(p_info_id, post_id, resume_id, skills,created_at) values(0, 6, 0,'Java,Sql,Android',now());
INSERT INTO skill_tb(p_info_id, post_id, resume_id, skills,created_at) values(0, 0, 1,'Java,Sql,Html,Android',now());
INSERT INTO skill_tb(p_info_id, post_id, resume_id, skills,created_at) values(0, 0, 2,'Java,Javascript,Html',now());
INSERT INTO skill_tb(p_info_id, post_id, resume_id, skills,created_at) values(0, 0, 3,'React,Javascript,Sql',now());
INSERT INTO skill_tb(p_info_id, post_id, resume_id, skills,created_at) values(0, 0, 4,'Java,Javascript,Android',now());

INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Java', 1, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Javascript', 1, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Sql', 1, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Javascript', 2, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Sql', 2, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Html', 2, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Java', 3, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Sql', 3, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Html', 3, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Java', 4, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Sql', 4, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Android', 4, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Java', 5, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Sql', 5, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Android', 5, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Java', 6, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Sql', 6, 0);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Android', 6, 0);

INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Java', 0, 1);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Sql', 0, 1);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Html', 0, 1);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Android', 0, 1);

INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Java', 0, 2);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Javascript', 0, 2);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Html', 0, 2);

INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('React', 0, 3);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Javascript', 0, 3);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Sql', 0, 3);

INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Java', 0, 4);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Javascript', 0, 4);
INSERT INTO skill_filter_tb(skill, post_id, resume_id) values('Android', 0, 4);


INSERT INTO person_proposal_tb(p_info_id, post_id, resume_id, status, created_at) values(1, 1, 1, -1 ,now());
INSERT INTO person_proposal_tb(p_info_id, post_id, resume_id, status, created_at) values(1, 2, 1, 1 ,now());
INSERT INTO person_proposal_tb(p_info_id, post_id, resume_id, status, created_at) values(1, 3, 1, 1 ,now());
INSERT INTO person_proposal_tb(p_info_id, post_id, resume_id, status, created_at) values(2, 1, 4, 0 ,now());
INSERT INTO person_proposal_tb(p_info_id, post_id, resume_id, status, created_at) values(2, 5, 4, 0 ,now());
INSERT INTO person_proposal_tb(p_info_id, post_id, resume_id, status, created_at) values(1, 5, 2, 0 ,now());
INSERT INTO person_proposal_tb(p_info_id, post_id, resume_id, status, created_at) values(2, 6, 4, 0 ,now());
INSERT INTO person_proposal_tb(p_info_id, post_id, resume_id, status, created_at) values(1, 6, 1, 0 ,now());

INSERT INTO proposal_pass_tb(p_info_id, p_proposal_id, comment, created_at) values(1,2,'그 기백이 마음에 듭니다. 회사로 와서 면접을 봅시다.',now());
INSERT INTO proposal_pass_tb(p_info_id, p_proposal_id, comment, created_at) values(1,3,'회사로 와서 면접을 봅시다.',now());

INSERT INTO person_customer_service_tb(question, answer, created_at) values ('회원가입은 어떻게 하나요?', '홈페이지 첫 화면에서 해당하는 회원 유형(개인 또는 기업)을 선택하시고, 로그인 창 밑의 "아직 회원이 아니신가요?" 문구를 클릭하시면 회원가입 페이지로 이동합니다.', now());
INSERT INTO person_customer_service_tb(question, answer, created_at) values ('이 사이트는 무엇인가요?', '저희 이닛(INITi)은 개발자 전용 구인구직 서비스 입니다. 기술스택에 따른 추천 채용 공고, 쉽고 빠른 지원 시스템, 관심 공고 스크랩 시스템, 실시간 채용결과 조회 등이 가능합니다.', now());
INSERT INTO person_customer_service_tb(question, answer, created_at) values ('회원 정보 수정은 어떻게 하나요?', '회원 로그인 후 우측 상단 프로필을 클릭해 주세요. 회원 정보 탭에 들어가 개인 정보를 수정하신 후, "수정하기" 버튼을 클릭해 주시면, 정보 수정이 완료됩니다.', now());
INSERT INTO person_customer_service_tb(question, answer, created_at) values ('이력서를 작성할 때 주의해야 할 점은 무엇인가요?', '1. 우선, 사진은 최근 3개월 내의 것으로 규격에 맞는 사진으로 준비해 주세요. 2. 이력서에 오탈자가 없는 지 다시 한 번 확인해 주세요. 3. 내용에는 거짓이 없어야 합니다.', now());

INSERT INTO company_customer_service_tb(question, answer, created_at) values ('인재추천 메뉴는 무엇인가요?', '등록하신 공고에서 요구되는 기술스택과 일치하는 인재를 매칭해주는 서비스 입니다.', now());
INSERT INTO company_customer_service_tb(question, answer, created_at) values ('사이트를 이용하는 데에 비용이 드나요?', '저희 이닛(INITi)은 무료 플랫폼으로, 누구나 이용할 수 있습니다.', now());
INSERT INTO company_customer_service_tb(question, answer, created_at) values ('지원자의 이력서는 어떻게 확인하나요?', '회원 로그인 후 우측 상단 프로필을 클릭해 주세요. "받은 이력서" 메뉴를 클릭하시면, 지원자의 이력서를 확인하실 수 있습니다!', now());
INSERT INTO company_customer_service_tb(question, answer, created_at) values ('등록한 공고를 수정하고 싶어요.', '회원 로그인 후 우측 상단 프로필을 클릭해 주세요. "공고 관리" 메뉴에 들어가시면 기존 공고 수정 뿐만아니라, 새로운 공고 등록, 공고 삭제도 가능합니다.', now());


commit;
