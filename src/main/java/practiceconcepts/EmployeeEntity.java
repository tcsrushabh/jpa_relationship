package practiceconcepts;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Employee_id;
	private String Email;
	private String First_name;
	private String Last_name;
	
//  Hibernate one to one mapping with foreign key association
//	@OneToOne
//	@JoinColumn(name="Account_id")
//	private AccountEntity account;
	
//  Hibernate one to one mapping with common join table
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinTable(name="EMPLOYEE_ACCCOUNT", joinColumns = @JoinColumn(name="Employee_id"),
//	inverseJoinColumns = @JoinColumn(name="Account_id"))
//	private AccountEntity account;
	
//	Hibernate one to one mapping with shared primary key
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private AccountEntity account;
	
//	Hibernate one to one mapping with @MapsId
//	@OneToOne
//	@MapsId()
//	private AccountEntity account;
	
	public int getEmployee_id() {
		return Employee_id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public AccountEntity getAccount() {
		return account;
	}
	public void setAccount(AccountEntity account) {
		this.account = account;
	}
	
}