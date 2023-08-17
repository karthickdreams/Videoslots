SELECT id, name, surname FROM users WHERE country='MT';

SELECT id, name, surname FROM users WHERE country NOT LIKE 'PT' AND country NOT LIKE 'FR';

SELECT users.id, users.name, users.surname FROM users INNERJOIN users_creds ON users_creds.id = users.id ;

SELECT users.name, users.surname, users.email FROM users INNERJOIN users_creds ON users_creds.id = users.id WHERE users_creds.required_reset_password = 1;
