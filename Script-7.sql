SELECT ename FROM EMP emp WHERE sal = 800

SELECT lower(ename) FROM EMP emp WHERE sal = 800

SELECT length(ename) FROM EMP emp WHERE sal = 800

SELECT concat(ename, ':') FROM EMP emp WHERE sal = 800

SELECT ename || ':' || '0' FROM EMP emp WHERE sal = 800

SELECT length(ename) FROM emp

SELECT length(ename) FROM emp WHERE JOB = 'MANAGER'

SELECT ENAME, JOB FROM EMP e WHERE COMM IS NULL

SELECT HIREDATE FROM EMP e WHERE COMM IS NOT NULL

SELECT SUBSTR(ENAME, 2) FROM EMP e

SELECT SUBSTR(JOB, 1, 3) FROM EMP e

SELECT REPLACE(ENAME, 'K', 'P') FROM EMP e

SELECT EMPNO FROM EMP e2

SELECT EMPNO || '번은' || ENAME || '입니다' FROM EMP e

SELECT TO_CHAR(SYSDATE, 'MM') AS MM, TO_CHAR(SYSDATE, 'dd') AS DD FROM EMP e 

SELECT JOB,
CASE JOB
WHEN 'MANAGER' THEN 'LEVEL1' 
WHEN 'SALEMAN' THEN 'LEVEL2'
ELSE 'LEVEL3'
END AS LEVEL_RESULT
FROM EMP e

SELECT SUM(DEPTNO) FROM EMP e;

SELECT MIN(SAL) FROM EMP e WHERE DEPTNO = 10 OR DEPTNO = 20

SELECT MIN(SAL) AS MIN, MAX(SAL) AS MAX FROM EMP e

SELECT AVG(SAL) FROM EMP e GROUP BY DEPTNO

SELECT SUM(SAL) FROM EMP e GROUP BY DEPTNO ORDER BY DEPTNO ASC

SELECT AVG(SAL) FROM EMP e GROUP BY DEPTNO HAVING AVG(SAL) >= 2000 ORDER BY DEPTNO DESC

SELECT COUNT(*), AVG(SAL) FROM EMP e WHERE ENAME LIKE '%S%'

SELECT count(*) FROM EMP e WHERE SAL >= 3000 AND comm IS NOT NULL
ORDER BY sal DESC


-- join: 왜 하는가? 검색을 하고 싶은데 항목들이 여러개의 테이블에 흩어져 있는 경우 테이블을 모아서(합해서) 검색

SELECT * FROM "member" m , BBS b WHERE m.ID = b.WRITER

SELECT b."no", title, name FROM "member" m , BBS b WHERE m.ID = b.WRITER

---- Inner join: 테이블간 공통된 값만 추출
---- emp테이블과 dept테이블을 조인하세요.
---- empno, ename, job, deptno, loc 컬럼 검색
---- 조인조건: deptno

SELECT e.empno, e.ename, e.job, d.deptno, d.loc FROM DEPT d , EMP e WHERE d.DEPTNO = e.DEPTNO

SELECT * FROM "member" m LEFT OUTER JOIN BBS b ON (m.id = b.WRITER) --MEMBER 다 나옴

SELECT * FROM "member" m right OUTER JOIN BBS b ON (m.id = b.WRITER) --bbs 다 나옴

-- left/right outer JOIN

--1. emp 테이블의 정보는 다 보이게 하고 싶음. dept는 맞는 것만 오른쪽에 붙여주고 싶음
SELECT * FROM EMP e LEFT OUTER JOIN dept d ON (e.deptno = d.deptno)

--2. dept테이블의 정보는 다 보이게 하고 싶음. emp는 맞는 것만 오른쪽에 붙여주고 싶음
SELECT * FROM emp e RIGHT OUTER JOIN DEPT d ON (e.deptno = d.DEPTNO)

SELECT * FROM "member" m, BBS b WHERE b.WRITER = m.ID -- INNER JOIN: 조인 조건이 공통적인 것만 검색


CREATE table company(
	id varchar2(200) PRIMARY key,
	name varchar2(200),
	addr varchar2(200),
	tel varchar2(200)
)

INSERT INTO company VALUES ('c100', 'good', 'seoul', '011')

INSERT INTO company VALUES ('c200', 'joa', 'busan', '012')

INSERT INTO company VALUES ('c300', 'maria', 'ulsan', '013')

INSERT INTO company VALUES ('c400', 'my', 'kwangju', '014')

SELECT * FROM company



SELECT * FROM COMPANY c , PRODUCT3 p WHERE c.ID = p.COMPANY  -- INNER JOIN: 조인 조건이 공통적인 것만 검색

SELECT * FROM COMPANY c LEFT OUTER JOIN PRODUCT3 p ON (c.ID = p.COMPANY) --company 다 나옴

SELECT * FROM PRODUCT3 p right OUTER JOIN COMPANY c ON (c.ID = p.COMPANY) --product 다 나옴
