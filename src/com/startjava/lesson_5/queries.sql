--queries

SELECT * FROM Jeagers; --вывод всей таблицы

SELECT * FROM Jeagers WHERE status = 'Active'; --отображение только не уничтоженных роботов

SELECT * FROM Jeagers WHERE mark IN ('1','6'); --отображение роботов нескольких серий (Mark-1,6)

SELECT * FROM Jeagers ORDER BY mark DESC; --отсортированная таблицы по убыванию по столбцу mark

SELECT * FROM Jeagers WHERE launch = (SELECT MIN(launch) FROM Jeagers); --самый старый робот

SELECT * FROM Jeagers WHERE kaijukill = (SELECT MAX(kaijukill) FROM Jeagers); --убил больше всех kaiju

SELECT * FROM Jeagers WHERE kaijukill = (SELECT MIN(kaijukill) FROM Jeagers); --убил меньше всех kaiju

SELECT AVG(weight) FROM Jeagers; --средний вес роботов

UPDATE Jeagers SET kaijukill = kaijukill + 1 WHERE status = 'Active'; --увеличил на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены

DELETE FROM Jeagers WHERE status = 'Distroyed'; --удалил уничтоженных роботов