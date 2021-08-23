package practiceconcepts;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AccountEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Account_id;
	
	private Long Account_number;
	
//	@OneToOne(mappedBy="account")
//	private EmployeeEntity employee;
	
	@OneToOne(mappedBy="account", cascade=CascadeType.ALL)
	private EmployeeEntity employee;

	public int getAccount_id() {
		return Account_id;
	}

	public Long getAccount_number() {
		return Account_number;
	}

	public void setAccount_number(Long account_number) {
		Account_number = account_number;
	}
	
	

}
