INSERT INTO role (name) VALUES ('ADMIN');
INSERT INTO role (name) VALUES ('USER');

INSERT INTO user (name,surname,username, password) VALUES ('Isabella','De Sanctis','admin','$2b$10$Wbcx1UuSXBXCR3qrxPNCXuciJ0QPnHR8ymfAKXR8NiWRicsZi8XdG'); -- password: admin
INSERT INTO user (name,surname,username, password) VALUES ('Enrico','Bellagamba','user', '$2b$10$ZEPZr2vYFnB3ccdupUxu9uHRtesvMWybK5jdqk65bPmF8M5d5tbHi'); -- password: admin

INSERT INTO users_roles(role_id,user_id) VALUES (1,1);
INSERT INTO users_roles(role_id,user_id) VALUES (2,2);

INSERT INTO salary (`sum`, user_id) VALUES (3000.0, 1);
INSERT INTO salary (`sum`, user_id) VALUES (2000.0, 2);