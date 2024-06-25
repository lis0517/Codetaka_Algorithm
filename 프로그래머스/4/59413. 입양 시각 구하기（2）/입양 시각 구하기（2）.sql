WITH RECURSIVE HOURS AS (
  SELECT 0 AS HOUR
  UNION ALL
  SELECT HOUR + 1 FROM HOURS WHERE HOUR < 23
)
SELECT HOURS.HOUR, COUNT(HOUR(o.DATETIME)) AS COUNT
FROM HOURS
LEFT JOIN ANIMAL_OUTS o ON HOUR(o.DATETIME) = HOURS.HOUR
GROUP BY HOURS.HOUR
ORDER BY HOURS.HOUR;