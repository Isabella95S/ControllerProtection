INSERT INTO role (name) VALUES ('ADMIN');
INSERT INTO role (name) VALUES ('USER');

INSERT INTO user (name,surname,username, password) VALUES ('Isabella','De Sanctis','admin','$2a$10$3uRtQDuZ5dzv4s1X9aKq0uT3CZhCvPvQHCHJ/PzWzQqvzpJmDccmu'); -- password: admin
INSERT INTO user (name,surname,username, password) VALUES ('Enrico','Bellagamba','user', '$2a$10$3uRtQDuZ5dzv4s1X9aKq0uT3CZhCvPvQHCHJ/PzWzQqvzpJmDccmu'); -- password: admin

INSERT INTO users_roles(role_id,user_id) VALUES (1,1);
INSERT INTO users_roles(role_id,user_id) VALUES (2,2);

INSERT INTO salary (`sum`, user_id) VALUES (3000.0, 1);
INSERT INTO salary (`sum`, user_id) VALUES (2000.0, 2);