select
    e.last_name as last_name,
	e.first_name as first_name,
	d.dept_no as dept_no
from employees e
left outer join dept_emp d
on e.emp_no=d.emp_no
where d.dept_no is not null
