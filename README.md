# Chat 
***

##Додаток для обміну текстовими повідомленнями

Додаток базується на java sockets, JDBC, Postgres SQL,
Swing для графічного інтерфейсу та LOG4J як 
система логування.

## Збірка і запуск проекту

1. Зібрати docker image для бази даних 
[build-db-image.bat](./build-db-image.bat).

2. Запустити базу даних [start-db.bat](./start-db.bat).

3. Запустити сервер [start-server.bat](./start-server.bat) 
(перед запуском проект буде автоматично
зкомлільований та запакований в jar архів).

4. Запустити клієнт [start-client.bat](./start-client.bat).

## Інтерфейс

Головне вікно додатку виглядає наступним чином

![main-window](./samples/main-window.PNG)

Для входу в додаток можна скористатися логіном і паролем вже
існуючих користувачів _login_: *kornev*, _password_: *1* або 
_login_: *lebedev*, _password_: *1*.
Або ж зареєструвати свого користувача натиснувши на 
_Registration_.
