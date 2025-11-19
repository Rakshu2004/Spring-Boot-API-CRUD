This project is a simple RESTful CRUD API built using Java Spring Boot to manage student records. It demonstrates how to implement core CRUD operations (Create, Read, Update, Delete) using a layered architecture with Controller, Service, and Model components.

The API allows users to:

Add a single student or multiple students

Fetch a student by ID

Fetch all students

Update existing student details

Delete a student by ID

Delete all students

The application uses Spring Boot Web for API creation and supports JSON-based request/response handling, making it easy to test with tools like Postman.



To Insert Single student data

http://localhost:1222/students

{
    "id":1,
    "name":"ABC"
}

To insert multiple student data

http://localhost:1222/students/all           (POST)

[
{
    "id":1,
    "name":"ABC"
},
{
    "id":2,
    "name":"DEF"
}
]

To fetch the student by id 

http://localhost:1222/students/id/1    (GET)

To fetch all the student

http://localhost:1222/students           (GET)

To update the student

http://localhost:1222/students           (PUT)
(body)
{
  "id": 1,
  "name": "Updated Name"
}

To delete the student by id

http://localhost:1222/students/id/6           (DELETE)

To delete all the students

http://localhost:1222/students               (DELETE)



