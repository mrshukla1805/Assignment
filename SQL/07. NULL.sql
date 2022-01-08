-- create
CREATE TABLE Interns (
  empId INTEGER PRIMARY KEY,
  name TEXT ,
  dept TEXT NOT NULL
);

-- insert
INSERT INTO Interns VALUES (0001, 'Parth', 'Kubernetes Developer');
INSERT INTO Interns VALUES (0002, 'Rishabh', 'Backend Engineer');
INSERT INTO Interns VALUES (0003, 'Khushboo', 'CA');
INSERT INTO Interns VALUES (0004, 'Archana', 'CA');

INSERT INTO Interns VALUES (0005, NULL, 'Java Developer');
-- fetch 
SELECT * FROM Interns where name is NULL;


SELECT * FROM Interns where name is NOT NULL;
