-- create
CREATE TABLE Interns (
  empId INTEGER PRIMARY KEY,
  name TEXT ,
  dept TEXT NOT NULL,
  salary INTEGER
);


-- insert
INSERT INTO Interns VALUES (0001, 'Parth', 'Kubernetes Developer',1000);
INSERT INTO Interns VALUES (0002, 'Rishabh', 'Backend Engineer',1100);
INSERT INTO Interns VALUES (0003, 'Khushboo', 'CA',1500);
INSERT INTO Interns VALUES (0004, 'Archana', 'CA',1500);


CREATE TABLE Address (
  empId INTEGER PRIMARY KEY,
  city TEXT NOT NULL
); 

-- INSERT 
INSERT INTO Address VALUES (0001, 'Mumbai');
INSERT INTO Address VALUES (0002, 'Rajasthan');
INSERT INTO Address VALUES (0003, 'Dubai');
INSERT INTO Address VALUES (0005, 'Mumbai');


select * from Interns left join Address on
Interns.empId = Address.empId;


select * from Interns right join Address on
Interns.empId = Address.empId;
