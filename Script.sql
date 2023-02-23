CREATE TABLE member2 (
	id varchar2(100),
	pw varchar2(100),
	name varchar2(100),
	tel varchar2(100)

)

INSERT INTO MEMBER2 VALUES ('park', '1234', 'park','222')

INSERT INTO "member" VALUES ('ice', '2222', 'ice', '333')

INSERT INTO "member" VALUES ('melon', '3333', 'melon', '777')

SELECT * FROM "member"

SELECT * FROM "member"  -- 모든 컬럼

SELECT id FROM "member"

SELECT id, pw FROM "member"

CREATE TABLE "HR"."HOBBY2" 
   (	"HOBBYID" VARCHAR2(100), 
	"CONTENT" VARCHAR2(100), 
	"LOCATION" VARCHAR2(100)
   )
   
 INSERT INTO HOBBY VALUES ('100', 'run', 'seoul')
 
 INSERT INTO HOBBY VALUES ('200', 'book', 'busan')
 
SELECT * FROM HOBBY  -- 모든 컬럼

SELECT CONTENT FROM HOBBY

SELECT CONTENT, LOCATION FROM HOBBY