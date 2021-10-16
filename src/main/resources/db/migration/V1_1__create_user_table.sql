CREATE TABLE tb_user(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(64) NOT NULL,
password VARCHAR(255) NOT NULL
);

INSERT INTO tb_user (username, password) values ('admin', '$2a$10$C7igMinuiOIufQbDwZ5d5eKGu9mZgoHN9SFq33m84H1pNxj6z5NGq')