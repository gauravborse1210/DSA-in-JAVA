SELECT EMP2.unique_id, EMP1.name
FROM Employees EMP1 LEFT JOIN EmployeeUNI EMP2
ON EMP1.id = EMP2.id;
