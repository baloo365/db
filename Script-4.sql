CREATE TABLE "HR"."BOARD3" 
   (	"BOARDNO" NUMBER(38,0), 
	"TITLE" VARCHAR2(100), 
	"CONTENTS" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 
	"WRITEDATE" DATE, 
	"RECOMMEND" NUMBER(38,0), 
	"VIEWCOUNT" NUMBER(38,0)
   )
   
  ALTER TABLE HR.BOARD3 MODIFY TITLE VARCHAR2(200) 
 
  ALTER TABLE HR.BOARD3 MODIFY CONTENTS VARCHAR2(200) 
  
  DROP TABLE BOARD3
  
  --DCL: DB 관리/제어해주는 문법(계정생성, 계정권한부여, 백업, 복구)
  
  CREATE USER APPLE IDENtIFIED BY a1234
  
  GRANT CONNECT, resource, dba TO apple
  
  --apple에게 권한을 줌.
  
  CREATE TABLE "HR"."product222" 
   (	"ID" VARCHAR2(100) PRIMARY KEY,
	"NAME" VARCHAR2(100), 
	"content" VARCHAR2(100),
	"price" number(38, 0)
   )
   
   INSERT INTO "member" VALUES ('100', '100', 'park', '011')
   
      INSERT INTO "member" VALUES ('200', '200', 'park', '011')
      
         INSERT INTO "member" VALUES ('300', '300', 'park', '011')
         
         
     SELECT id FROM "member" WHERE id = '100' -- id가 100인 id 컬럼
     
     SELECT ID, name FROM "member" WHERE id = '100' -- id가 100인 id와 pw 컬럼
     
     UPDATE "member" SET name='kim' WHERE id = '100' -- id가 100인 사람 이름을 'kim'으로 바꿈
     
     UPDATE "member" SET name='yang' WHERE id = '200' -- id가 100인 사람 이름을 'yang'으로 바꿈
     
     UPDATE "member" SET name='lee' WHERE id = '300' -- id가 100인 사람 이름을 'lee'으로 바꿈
     
     SELECT * FROM "member"
     
     UPDATE "member" SET pw='8888', tel='9999' WHERE id='ice'
     
     
CREATE TABLE product (
	id varchar2(200), 
	name varchar2(200), 
	content varchar2(200), 
	price varchar2(200), 
	company varchar2(200), 
	img varchar2(200)
)

CREATE TABLE PRODUCT(
ID VARCHAR2(200),
NAME VARCHAR2(200),
CONTENT VARCHAR2(200),
PRICE VARCHAR2(200),
COMPANY VARCHAR2(200),
IMG VARCHAR2(200)
)

 SELECT * FROM PRODUCT ORDER BY price DESC
 
 SELECT name, content, price FROM PRODUCT ORDER BY company ASC 
 
 SELECT name, price FROM product WHERE id='100'
 
 SELECT name, company FROM product WHERE price='5000'
  
 SELECT name, img FROM product WHERE company='c100'
 
SELECT company, name FROM product WHERE company='c100'

SELECT name, price FROM product WHERE company='c100' or company='c200'

UPDATE PRODUCT SET CONTENT='품절' WHERE PRICE=5000

UPDATE PRODUCT SET img='0.png', price=10000 WHERE id='100' OR id='102'

UPDATE PRODUCT SET company='apple', name='appleshoes' WHERE id='101'

DELETE FROM product WHERE name='shoes1' OR id='107'

DELETE FROM product WHERE COMPANY ='c100'

DELETE from product -- 테이블 틀은 남아 있음.

DROP TABLE PRODUCT -- 테이블뼈대(스키마)까지 모두 삭제

SELECT * FROM product
 
 
     