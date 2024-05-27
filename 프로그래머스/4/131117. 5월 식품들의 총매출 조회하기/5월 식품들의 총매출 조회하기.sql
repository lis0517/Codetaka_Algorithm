-- 코드를 입력하세요
SELECT f.PRODUCT_ID, f.PRODUCT_NAME, SUM(o.AMOUNT * f.PRICE) AS "TOTAL_SALES"
FROM FOOD_PRODUCT f
JOIN FOOD_ORDER o ON f.PRODUCT_ID = o.PRODUCT_ID
WHERE EXTRACT(YEAR_MONTH FROM o.PRODUCE_DATE) = 202205
GROUP BY f.PRODUCT_ID, f.PRODUCT_NAME
ORDER BY TOTAL_SALES DESC, f.PRODUCT_ID ASC
