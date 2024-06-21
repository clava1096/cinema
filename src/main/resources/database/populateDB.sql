INSERT INTO users (id ,username, password, email, birthdate) VALUES
(1,'user1', 'password1', 'user1@example.com', '1990-01-01'),
(2,'user2', 'password2', 'user2@example.com', '1991-02-02'),
(3,'user3', 'password3', 'user3@example.com', '1992-03-03'),
(4,'user4', 'password4', 'user4@example.com', '1993-04-04'),
(5,'user5', 'password5', 'user5@example.com', '1994-05-05');

-- Заполнение таблицы row_and_place
INSERT INTO row_and_place (hall, row_id, place_id, category) VALUES
('Зал 1', 1, 1, 'VIP'),
('Зал 1', 1, 2, 'Обычный'),
('Зал 2', 1, 1, 'VIP'),
('Зал 2', 2, 1, 'Обычный'),
('Зал 3', 1, 1, 'Обычный');

-- Добавление необходимых записей в таблицу films
INSERT INTO films (id, name, country, date_of_release, genre, duration) VALUES
(1, 'Фильм 1', 'США', '2000-01-01', 'Боевик', 120),
(2, 'Фильм 2', 'Великобритания', '2001-02-02', 'Комедия', 90),
(3, 'Фильм 3', 'Франция', '2002-03-03', 'Драма', 150),
(4, 'Фильм 4', 'Италия', '2003-04-04', 'Ужасы', 100),
(5, 'Фильм 5', 'Германия', '2004-05-05', 'Мелодрама', 110);

-- Заполнение таблицы sessions
INSERT INTO sessions (date, time, hall, film_id) VALUES
('2022-06-01', '10:00:00', 'Зал 1', 1),
('2022-06-01', '13:00:00', 'Зал 2', 2),
('2022-06-01', '16:00:00', 'Зал 3', 3),
('2022-06-01', '19:00:00', 'Зал 1', 4),
('2022-06-01', '22:00:00', 'Зал 2', 5);

-- Заполнение таблицы prices
INSERT INTO prices (date, time, category, price) VALUES
('2022-06-01', '10:00:00', 'VIP', 100.00),
('2022-06-01', '13:00:00', 'Обычный', 50.00),
('2022-06-01', '16:00:00', 'Обычный', 50.00),
('2022-06-01', '19:00:00', 'VIP', 100.00),
('2022-06-01', '22:00:00', 'Обычный', 50.00);

-- Добавление необходимых записей в таблицу row_and_place
INSERT INTO row_and_place (id, hall, row_id, place_id, category) VALUES
(1, 'Зал 1', 1, 1, 'VIP'),
(2, 'Зал 1', 1, 2, 'Обычный'),
(3, 'Зал 2', 1, 1, 'VIP'),
(4, 'Зал 2', 2, 1, 'Обычный'),
(5, 'Зал 3', 1, 1, 'Обычный');

-- Заполнение таблицы tickets
INSERT INTO tickets (date, session_id, row_and_place_id, issold) VALUES
('2022-06-01', 1, 1, FALSE),
('2022-06-01', 2, 2, FALSE),
('2022-06-01', 3, 3, FALSE),
('2022-06-01', 4, 4, FALSE),
('2022-06-01', 5, 5, FALSE);

-- Добавление необходимых записей в таблицу users
INSERT INTO users (id, username, password, email, birthdate) VALUES
(1, 'username1', 'password1', 'username1@example.com', '1990-01-01'),
(2, 'username2', 'password2', 'username2@example.com', '1991-02-02'),
(3, 'username3', 'password3', 'username3@example.com', '1992-03-03'),
(4, 'username4', 'password4', 'username4@example.com', '1993-04-04'),
(5, 'username5', 'password5', 'username5@example.com', '1994-05-05');

INSERT INTO tickets (id, date, session_id, row_and_place_id, issold) VALUES
(1, '2022-06-01', 1, 1, FALSE),
(2, '2022-06-01', 2, 2, FALSE),
(3, '2022-06-01', 3, 3, FALSE),
(4, '2022-06-01', 4, 4, FALSE),
(5, '2022-06-01', 5, 5, FALSE);

-- Заполнение таблицы purchases
INSERT INTO purchases (user_id, ticket_id, purchase_date, price) VALUES
(1, 1, '2022-05-31 12:00:00', 100.00),
(2, 2, '2022-05-31 13:00:00', 50.00),
(3, 3, '2022-05-31 14:00:00', 50.00),
(4, 4, '2022-05-31 15:00:00', 100.00),
(5, 5, '2022-05-31 16:00:00', 50.00);

-- Заполнение таблицы reviews
INSERT INTO reviews (user_id, film_id, session_id, description, raiting) VALUES
(1, 1, 1, 'Отличный фильм', 5),
(2, 2, 2, 'Скучный фильм', 3),
(3, 3, 3, 'Интересный фильм', 4),
(4, 4, 4, 'Ужасный фильм', 1),
(5, 5, 5, 'Замечательный фильм', 5);