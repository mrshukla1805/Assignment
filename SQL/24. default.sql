-- create
CREATE TABLE Interns (
  empId INTEGER PRIMARY KEY,
  name TEXT ,
  dept TEXT NOT NULL,
  salary INTEGER,
  location varchar(255) default 'Mumbai'
);


-- insert
INSERT INTO Interns (empId,name,dept,salary) VALUES (0001, 'Parth', 'Kubernetes Developer',1000);
INSERT INTO Interns (empId,name,dept,salary) VALUES (0002, 'Rishabh', 'Backend Engineer',1100);
INSERT INTO Interns (empId,name,dept,salary) VALUES (0003, 'Khushboo', 'CA',1500);
INSERT INTO Interns (empId,name,dept,salary) VALUES (0004, 'Archana', 'CA',1500);


select * from Interns;
