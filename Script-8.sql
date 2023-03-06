SELECT * FROM "record" r , SUBJECT s WHERE s.강좌이름 = r.강좌이름


INSERT INTO DEPARTMENT VALUES ('국문학과', '인문관107')

INSERT INTO STUDENT_INFORMATION VALUES ('701', '추신수', '클리블랜드', '국문학과')

SELECT * FROM STUDENT_INFORMATION si


SELECT * FROM STUDENT_INFORMATION si LEFT JOIN "record" r ON si.학생번호 = r.학생번호
LEFT JOIN DEPARTMENT d ON si.학과 = d.학과 
LEFT JOIN SUBJECT s ON r.강좌이름 = s.강좌이름;


SELECT * FROM DEPARTMENT d LEFT OUTER JOIN STUDENT_INFORMATION si ON d.학과 = si.학과

SELECT * FROM STUDENT_INFORMATION WHERE 학생번호 IN (SELECT 학생번호 FROM "record" r WHERE 성적 = 4.0)

SELECT 학생번호 FROM "record" r WHERE 성적 = 4.0


CREATE TABLE "HR"."movies" (    id INT PRIMARY KEY,    title VARCHAR(100),    director VARCHAR(100),    actors VARCHAR(100),    release_date DATE,    genre VARCHAR(100),    
summary VARCHAR(100));

SELECT * FROM MOVIES

DROP TABLE "reviews";
DROP TABLE "rating";


CREATE TABLE "HR"."reviews" (    id INT PRIMARY KEY,    movie_id INT,    reviewer_name VARCHAR(100),    content VARCHAR(100),    
FOREIGN KEY (movie_id) REFERENCES movies(id) );

CREATE TABLE "HR"."rating" (    id INT PRIMARY KEY,    movie_id INT,    rating FLOAT,    
FOREIGN KEY (movie_id) REFERENCES movies(id) );

SELECT * FROM "reviews" r;
SELECT * FROM RATING r;

