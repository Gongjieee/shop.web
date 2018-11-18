CREATE TABLE user(
user_id CHAR(32) PRIMARY KEY,
user_name VARCHAR(10) NOT NULL,
password VARCHAR(32) NOT NULL,
vip INT,
bank_card VARCHAR(16) NOT NULL,
user_picture_path VARCHAR(50),
user_picture_name VARCHAR(50)
)

CREATE TABLE goods(
goods_id CHAR(32) PRIMARY KEY,
goods_name VARCHAR(30) NOT NULL,
goods_type INT,
goods_num INT,
goods_price BIGINT,
picture_path VARCHAR(50),
picture_name VARCHAR(50)
)