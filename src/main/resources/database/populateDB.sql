INSERT INTO users (id ,username, password, email, birthdate) VALUES
(1,'user1', 'password1', 'user1@example.com', '1990-01-01'),
(2,'user2', 'password2', 'user2@example.com', '1991-02-02'),
(3,'user3', 'password3', 'user3@example.com', '1992-03-03'),
(4,'user4', 'password4', 'user4@example.com', '1993-04-04'),
(5,'user5', 'password5', 'user5@example.com', '1994-05-05');

-- ���������� ������� row_and_place
INSERT INTO row_and_place (hall, row_id, place_id, category) VALUES
('��� 1', 1, 1, 'VIP'),
('��� 1', 1, 2, '�������'),
('��� 2', 1, 1, 'VIP'),
('��� 2', 2, 1, '�������'),
('��� 3', 1, 1, '�������');

-- ���������� ����������� ������� � ������� films
INSERT INTO films (id, name, country, date_of_release, genre, duration) VALUES
(1, '����� 1', '���', '2000-01-01', '������', 120),
(2, '����� 2', '��������������', '2001-02-02', '�������', 90),
(3, '����� 3', '�������', '2002-03-03', '�����', 150),
(4, '����� 4', '������', '2003-04-04', '�����', 100),
(5, '����� 5', '��������', '2004-05-05', '���������', 110);

-- ���������� ������� sessions
INSERT INTO sessions (date, time, hall, film_id) VALUES
('2022-06-01', '10:00:00', '��� 1', 1),
('2022-06-01', '13:00:00', '��� 2', 2),
('2022-06-01', '16:00:00', '��� 3', 3),
('2022-06-01', '19:00:00', '��� 1', 4),
('2022-06-01', '22:00:00', '��� 2', 5);

-- ���������� ������� prices
INSERT INTO prices (date, time, category, price) VALUES
('2022-06-01', '10:00:00', 'VIP', 100.00),
('2022-06-01', '13:00:00', '�������', 50.00),
('2022-06-01', '16:00:00', '�������', 50.00),
('2022-06-01', '19:00:00', 'VIP', 100.00),
('2022-06-01', '22:00:00', '�������', 50.00);

-- ���������� ����������� ������� � ������� row_and_place
INSERT INTO row_and_place (id, hall, row_id, place_id, category) VALUES
(1, '��� 1', 1, 1, 'VIP'),
(2, '��� 1', 1, 2, '�������'),
(3, '��� 2', 1, 1, 'VIP'),
(4, '��� 2', 2, 1, '�������'),
(5, '��� 3', 1, 1, '�������');

-- ���������� ������� tickets
INSERT INTO tickets (date, session_id, row_and_place_id, issold) VALUES
('2022-06-01', 1, 1, FALSE),
('2022-06-01', 2, 2, FALSE),
('2022-06-01', 3, 3, FALSE),
('2022-06-01', 4, 4, FALSE),
('2022-06-01', 5, 5, FALSE);

-- ���������� ����������� ������� � ������� users
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

-- ���������� ������� purchases
INSERT INTO purchases (user_id, ticket_id, purchase_date, price) VALUES
(1, 1, '2022-05-31 12:00:00', 100.00),
(2, 2, '2022-05-31 13:00:00', 50.00),
(3, 3, '2022-05-31 14:00:00', 50.00),
(4, 4, '2022-05-31 15:00:00', 100.00),
(5, 5, '2022-05-31 16:00:00', 50.00);

-- ���������� ������� reviews
INSERT INTO reviews (user_id, film_id, session_id, description, raiting) VALUES
(1, 1, 1, '�������� �����', 5),
(2, 2, 2, '������� �����', 3),
(3, 3, 3, '���������� �����', 4),
(4, 4, 4, '������� �����', 1),
(5, 5, 5, '������������� �����', 5);