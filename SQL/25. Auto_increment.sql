-- create
CREATE TABLE Interns (
  empId INTEGER PRIMARY KEY AUTO_INCREMENT,
  name TEXT ,
  dept TEXT NOT NULL,
  salary INTEGER
);


-- insert
INSERT INTO Interns (empId,name,dept,salary) VALUES (0, 'Parth', 'Kubernetes Developer',1000);
INSERT INTO Interns (name,dept,salary) VALUES ( 'Rishabh', 'Backend Engineer',1100);
INSERT INTO Interns (name,dept,salary) VALUES ( 'Khushboo', 'CA',1500);
INSERT INTO Interns (name,dept,salary) VALUES ( 'Archana', 'CA',1500);


select * from Interns;
