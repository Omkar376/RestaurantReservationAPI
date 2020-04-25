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
