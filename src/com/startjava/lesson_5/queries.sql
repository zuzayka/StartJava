-- ключ psql -d jaegers -f /var/lib/postgres/queries.sql
SELECT * FROM jaegers;
SELECT * FROM jaegers WHERE status = 'active';
SELECT * FROM jaegers WHERE mark = 'Mark-2' OR mark = 'Mark-6';
SELECT * FROM jaegers ORDER BY mark DESC;
SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);
SELECT * FROM jaegers WHERE kaijukill = (SELECT MIN(kaijukill) FROM jaegers)
    OR kaijukill = (SELECT MAX(kaijukill) FROM jaegers);
SELECT AVG(weight) FROM jaegers;
UPDATE jaegers SET kaijukill = kaijukill + 1 WHERE status = 'active';
DELETE FROM jaegers WHERE status = 'destroyed';
