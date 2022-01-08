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




select name from Interns 
where exists (select * from Interns where
dept = 'Kubernetes Developer');
