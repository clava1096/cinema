
--CREATE SEQUENCE clients_id_seq START WITH 3 INCREMENT BY 1;
CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    birthdate DATE,
    registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS purchases (
    id SERIAL PRIMARY KEY,
    user_id INTEGER REFERENCES users(id),
    ticket_id INTEGER REFERENCES tickets(id),
	session_id INTEGER REFERENCES sessions(id),
    purchase_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    price DECIMAL(5,2)
);


CREATE TABLE IF NOT EXISTS reviews(
	id SERIAL PRIMARY KEY,
	user_id INTEGER REFERENCES users(id),
	film_id INTEGER REFERENCES films(id),
	session_id INTEGER REFERENCES sessions(id),
	description TEXT,
	raiting INTEGER
);

CREATE TABLE IF NOT EXISTS tickets(
	id SERIAL PRIMARY KEY,
	date DATE,
	session_id INTEGER REFERENCES sessions(id),
	row_and_place_id INTEGER REFERENCES row_and_place(id),
	issold BOOLEAN
);

CREATE TABLE IF NOT EXISTS row_and_place (
    id SERIAL PRIMARY KEY,
    hall VARCHAR(50),
    row_id INTEGER,
    place_id INTEGER,
    category VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS sessions (
    id SERIAL PRIMARY KEY,
    date DATE,
    time TIME,
    hall VARCHAR(50),
    film_id INTEGER REFERENCES films(id)
);

CREATE TABLE IF NOT EXISTS films (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    country VARCHAR(100),
    date_of_release DATE,
    genre VARCHAR(50),
    duration INTEGER
);

CREATE TABLE IF NOT EXISTS prices (
    id SERIAL PRIMARY KEY,
    date DATE,
    time TIME,
    category VARCHAR(50),
    price DECIMAL(5,2)
);