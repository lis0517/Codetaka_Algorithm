-- 코드를 입력하세요
SELECT COUNT(USER_ID) as 'USERS'
FROM USER_INFO
WHERE JOINED BETWEEN "2021-01-01" AND "2021-12-31" AND AGE BETWEEN 20 AND 29