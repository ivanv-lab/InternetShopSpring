--liquibase formatted sql

--changeset your.name:1
Create Table PickPoint(
id serial primary key NOT NULL,
name character varying(255),
address character varying(255)
);

--changeset your.name:2
Create Table "user"(
id serial primary key NOT null,
email character varying(255),
phone character varying(255),
fio character varying(11)
);

--changeset your.name:3
Create Table Product(
id serial primary key NOT NULL,
name character varying(255),
number integer,
location integer,
price decimal,
Foreign key (location) references PickPoint(id)
);

--changeset your.name:4
create table "order"(
id serial primary key NOT NULL,
location integer,
date date,
sum decimal,
user_id integer,
Foreign key(location) references PickPoint(id),
Foreign key(user_id) references "user"(id)
);

--changeset your.name:5
create table "order_product"(
order_id integer,
product_id integer,
number integer,
price decimal,
Foreign key(order_id) references "order"(id),
Foreign key(product_id) references "product"(id)
);

