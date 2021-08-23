package practiceconcepts;

import org.hibernate.Session;

public class TestForeignKeyAssociation {

	public static void main(String[] args) {
		   Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	 
	        AccountEntity account = new AccountEntity();
	        account.setAccount_number(12334565454L);
	 
	        // Add new Employee object
	        EmployeeEntity emp = new EmployeeEntity();
	        emp.setEmail("demo-user@mail.com");
	        emp.setFirst_name("demo");
	        emp.setLast_name("user");
	 
	        // Save Account
	        session.saveOrUpdate(account);
	   
	        // Save Employee
	        emp.setAccount(account);
	  
	        session.saveOrUpdate(emp);
	      
	        session.getTransaction().commit();
	        HibernateUtil.shutdown();
	    }
	

	}

