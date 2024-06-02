[![Badge](https://github.com/TimWHitee/techtask2/actions/workflows/javatest.yml/badge.svg)](https://github.com/Zero-Bite/Tech_Task/blob/master/.github/workflows/maven.yml)

##ТЗ 2

Описание проекта
Проект реализован в рамках ТЗ 2 по дисциплине "Технологии программирования" 1 курс НИУ ВШЭ

Автор работы: Гончаров Григорий
Группа: ББИ236

##Весь функционал реализован в ветке `master`

Функционал и использование
- Реализованы следующие базовые функции: чтение данных из файлов [data1, data2, data3, data4, dataMulti].txt, поиск минимума и максимума среди этих данных, нахождение суммы и произведения всех чисел

- Реализованы тесты на проверку базовых функций в файле `TestMain.java`

- Добавлен тесты на проверку скорости выполнения программы

- Добавлен произвольный тест на проверку корректности работы процедуры 'parser' -которая реализует корректность считывания из входной строки

- Построен график зависимости времени выполнения функции произведения от кол-ва данных в файле

- Создан репозиторий и оформлен файл README.md

- Добавлен бэйдж со статусом автотестов в верху файла README.md

- Подключена CI-система Github Actions -`JAVA + MAVEN` (файл maven.yml)

- Настроено автотестирование при выполнение git push

- Реализована интеграция с Telegram -отправка статуса автотестирования в группу с ботом