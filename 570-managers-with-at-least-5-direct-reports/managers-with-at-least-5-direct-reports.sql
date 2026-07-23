Select name from Employee where id in (
    Select managerId from Employee group by managerId HAVING COUNT(*) >= 5);