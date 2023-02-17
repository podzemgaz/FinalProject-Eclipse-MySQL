Проект (Dynamic Web Project) для Eclipse IDE for Enterprise Java Developers.
Содержит пример частично решенной задачи финального проекта.

*********************************************************************

1. Запустить сервер MySQL.

2. Зайти в административную консоль и выполнить команду

	source ABSOLUTE_PATH_TO_SCRIPT;

где ABSOLUTE_PATH_TO_SCRIPT - абсолютный путь к файлу:

	sql/dbcreate-mysql.sql

3. Создать пользователя с именем user, паролем userpass и дать ему все права на базу данных st4db:

	grant all privileges on st4db.* to user@'%' identified by 'userpass';	
	
(выполнить в административной консоли MySQL)

4. Открыть проект в Eclipse.

5. Сконфигурировать в Eclipse Apache Tomcat.
