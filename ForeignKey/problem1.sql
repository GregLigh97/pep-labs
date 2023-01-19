CREATE TABLE post (
Id int NOT NULL
post int NOT NULL
user_fk int
post VARCHAR (255)
FOREIGN KEY (user_fk) REFERENCES user(Id)
)