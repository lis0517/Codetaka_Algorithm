WITH REVIEW_COUNTS AS (
    SELECT MEMBER_ID, COUNT(*) AS REVIEW_COUNT
    FROM REST_REVIEW
    GROUP BY MEMBER_ID
), TOP_REVIEWER AS(
    SELECT MEMBER_ID
    FROM REVIEW_COUNTS
    ORDER BY REVIEW_COUNT DESC
    LIMIT 1
)
SELECT  MP.MEMBER_NAME,
    RR.REVIEW_TEXT,
    DATE_FORMAT(RR.REVIEW_DATE, "%Y-%m-%d") AS "REVIEW_DATE"
FROM REST_REVIEW RR
JOIN MEMBER_PROFILE MP ON RR.MEMBER_ID = MP.MEMBER_ID
JOIN TOP_REVIEWER TR ON RR.MEMBER_ID = TR.MEMBER_ID
ORDER BY RR.REVIEW_DATE ASC, RR.REVIEW_TEXT ASC