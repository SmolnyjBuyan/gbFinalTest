# Итоговая контрольная работа
1. Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека). <br> Решение: [linux/history.txt](https://github.com/SmolnyjBuyan/gbFinalTest/blob/122db7d7aeca754d6f5ebd69a3fd739b9934d941/linux/history.txt)
2. Создать директорию, переместить файл туда. <br> Решение: [linux/history.txt](https://github.com/SmolnyjBuyan/gbFinalTest/blob/122db7d7aeca754d6f5ebd69a3fd739b9934d941/linux/history.txt)
3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория. <br> Решение: [linux/history.txt](https://github.com/SmolnyjBuyan/gbFinalTest/blob/122db7d7aeca754d6f5ebd69a3fd739b9934d941/linux/history.txt)
4. Установить и удалить deb-пакет с помощью dpkg. <br> Решение: [linux/history.txt](https://github.com/SmolnyjBuyan/gbFinalTest/blob/122db7d7aeca754d6f5ebd69a3fd739b9934d941/linux/history.txt)
5. Выложить историю команд в терминале ubuntu. <br> Решение: [linux/history.txt](https://github.com/SmolnyjBuyan/gbFinalTest/blob/122db7d7aeca754d6f5ebd69a3fd739b9934d941/linux/history.txt)
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, верблюды и ослы). <br> Решение: [class_diagram/Human Friends.png](https://github.com/SmolnyjBuyan/gbFinalTest/blob/122db7d7aeca754d6f5ebd69a3fd739b9934d941/class_diagram/Human%20Friends.png)
7. В подключенном MySQL репозитории создать базу данных “Друзья человека”. <br> Решение: [sql_queries/create_db.sql](https://github.com/SmolnyjBuyan/gbFinalTest/blob/122db7d7aeca754d6f5ebd69a3fd739b9934d941/sql_queries/create_db.sql)
8. Создать таблицы с иерархией из диаграммы в БД. <br> Решение: [sql_queries/create_db.sql](https://github.com/SmolnyjBuyan/gbFinalTest/blob/122db7d7aeca754d6f5ebd69a3fd739b9934d941/sql_queries/create_db.sql)
9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения. <br> Решение: [sql_queries/insert_values.sql](https://github.com/SmolnyjBuyan/gbFinalTest/blob/122db7d7aeca754d6f5ebd69a3fd739b9934d941/sql_queries/insert_values.sql)
10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу. <br> Решение: [sql_queries/delete_from_camels.sql](https://github.com/SmolnyjBuyan/gbFinalTest/blob/122db7d7aeca754d6f5ebd69a3fd739b9934d941/sql_queries/delete_from_camels.sql); [sql_queries/join_horses_donkeys.sql](https://github.com/SmolnyjBuyan/gbFinalTest/blob/122db7d7aeca754d6f5ebd69a3fd739b9934d941/sql_queries/join_horses_donkeys.sql)
11. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице <br> Решение: [sql_queries/create_view_young_animals.sql](https://github.com/SmolnyjBuyan/gbFinalTest/blob/122db7d7aeca754d6f5ebd69a3fd739b9934d941/sql_queries/create_view_young_animals.sql)
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам. <br> Решение: [sql_queries/join_all_tables.sql](https://github.com/SmolnyjBuyan/gbFinalTest/blob/122db7d7aeca754d6f5ebd69a3fd739b9934d941/sql_queries/join_all_tables.sql)
13. Создать класс с Инкапсуляцией методов и наследованием по диаграмме. <br> Решение: [HumanFriendsApp](https://github.com/SmolnyjBuyan/gbFinalTest/tree/122db7d7aeca754d6f5ebd69a3fd739b9934d941/HumanFriendsApp)
14. Написать программу, имитирующую работу реестра домашних животных.
 * Завести новое животное
 * Определять животное в правильный класс
 * Увидеть список команд, которое выполняет животное
 * Обучить животное новым командам
 * Реализовать навигацию по меню <br> Решение: [HumanFriendsApp](https://github.com/SmolnyjBuyan/gbFinalTest/tree/122db7d7aeca754d6f5ebd69a3fd739b9934d941/HumanFriendsApp)

15.Создайте класс Счетчик, у которого есть метод add(), увеличивающий" значение внутренней"^ переменной"на 1 при нажатие “Завести новое животное” Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение считать в ресурсе try, если при заведения животного заполнены все поля. <br> Решение: [HumanFriendsApp](https://github.com/SmolnyjBuyan/gbFinalTest/tree/122db7d7aeca754d6f5ebd69a3fd739b9934d941/HumanFriendsApp)

# Запуск приложения в Docker.
1. Убедиться что в системе установлен Docker.
2. Склонировать приложение в удобную для вас директорию.
3. Перейти в директорию docker.
4. Выполнить команду(Находясь в директории docker!) <br> ```docker compose up -d```
5. Выполнить команду(Находясь в директории docker!) <br> ```./start_app```
