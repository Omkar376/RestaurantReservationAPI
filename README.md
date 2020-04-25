# RestaurantReservationAPI
API Endpoints:
  1. GET: http://localhost:8080/reservations
  2. POST: http://localhost:8080/reservations
  3. GET: http://localhost:8080/restaurants
  4. POST: http://localhost:8080/restaurants
  5. GET: http://localhost:8080/users
  6. POST: http://localhost:8080/users
  
  
Description:  
GET: http://localhost:8080/reservations
[
    {
        "id": 1,
        "restaurant_id": 1,
        "user_id": 1513,
        "start_datetime": "2020-04-24T14:07:50.000+0000",
        "end_datetime": "2020-04-25T04:07:50.000+0000",
        "table_type": "two_table"
    },
    {
        "id": 2,
        "restaurant_id": 1,
        "user_id": 1513,
        "start_datetime": "2020-04-24T14:11:51.000+0000",
        "end_datetime": "2020-04-25T05:11:51.000+0000",
        "table_type": "twelve_table"
    },
    {
        "id": 3,
        "restaurant_id": 1,
        "user_id": 1513,
        "start_datetime": "2020-04-24T14:12:06.000+0000",
        "end_datetime": "2020-04-25T06:12:06.000+0000",
        "table_type": "twelve_table"
    },
    {
        "id": 4,
        "restaurant_id": 2,
        "user_id": 1513,
        "start_datetime": "2020-04-24T14:14:46.000+0000",
        "end_datetime": "2020-04-25T07:14:46.000+0000",
        "table_type": "twelve_table"
    }
]

POST: http://localhost:8080/reservations
Request Body:
{
	"restaurant_id" : 2,
	"user_id" : 1513,
	"start_datetime": "{{start_timestamp}}",
	"end_datetime" : "{{end_timestamp}}",
	"table_type" : "twelve_table"
}
Response:
If confirmed: Reservation Confirmed
If not confirmed: Reservation not Confirmed

GET : http://localhost:8080/users
[
    {
        "id": 2,
        "name": "Omkar",
        "contact_number": "+123456987",
        "email": "omkar@test.com"
    },
    {
        "id": 3,
        "name": "Rahul",
        "contact_number": "+123456988",
        "email": "rahul@test.com"
    }
]

POST: http://localhost:8080/users
{
	"name" : "Omkar",
	"contact_number" : "+123456987",
	"email" : "omkar@test.com"
}

response:
User created


GET : http://localhost:8080/restaurants
Response:
[
    {
        "id": 1,
        "name": "Restaurant 2",
        "address": "Address 2",
        "contact_number": "9833618923",
        "email": "test@123",
        "two_table": 12,
        "four_table": 6,
        "six_table": 4,
        "twelve_table": 2
    },
    {
        "id": 2,
        "name": "Restaurant 1",
        "address": "Address 1",
        "contact_number": "9833618923",
        "email": "test@123",
        "two_table": 12,
        "four_table": 6,
        "six_table": 4,
        "twelve_table": 1
    }
]

POST: http://localhost:8080/restaurants
{

        "name": "Restaurant 2",
        "address": "Address 2",
        "contact_number": "9833618923",
        "email": "test@123",
        "two_table": 12,
        "four_table": 6,
        "six_table": 4,
        "twelve_table": 1
}

response:
Restaurant Created

MySql Queries:
CREATE DATABASE restaurantdb;

USE restaurantdb;
drop table reservation

CREATE TABLE restaurant (
`id` INTEGER NOT NULL AUTO_INCREMENT,
`name` VARCHAR(50) NOT NULL,
`address` VARCHAR(100) NOT NULL,
`contact_number` VARCHAR(15) NOT NULL,
`email` VARCHAR(25) NOT NULL,
`two_table` INTEGER,
`four_table` INTEGER,
`six_table` INTEGER,
`twelve_table` INTEGER,
PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARSET=utf8;


CREATE TABLE reservation (
`id` INTEGER NOT NULL AUTO_INCREMENT,
`restaurant_id` INTEGER NOT NULL,
`user_id` INTEGER NOT NULL,
`start_datetime` DATETIME NOT NULL,
`end_datetime` DATETIME NOT NULL,
`table_type` VARCHAR(25) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARSET=utf8;

CREATE TABLE user (
`id` INTEGER NOT NULL AUTO_INCREMENT,
`name` VARCHAR(50) NOT NULL,
`contact_number` VARCHAR(15) NOT NULL,
`email` VARCHAR(25) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARSET=utf8;
