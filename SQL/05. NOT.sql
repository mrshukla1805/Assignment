CREATE TABLE Interns (
  empId INTEGER PRIMARY KEY,
  name TEXT NOT NULL,
  dept TEXT NOT NULL
);

-- insert
INSERT INTO Interns VALUES (0001, 'Parth', 'Kubernetes Developer');
INSERT INTO Interns VALUES (0002, 'Rishabh', 'Backend Engineer');
INSERT INTO Interns VALUES (0003, 'Khushboo', 'CA');
INSERT INTO Interns VALUES (0004, 'Archana', 'CA');
-- fetch 
SELECT * FROM Interns WHERE NOT dept='CA';
