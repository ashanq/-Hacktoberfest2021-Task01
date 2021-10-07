
public class Customer {
	//Customer Class All Attributes
    private int id;
    private String name;
    private String email;
    private String phone;
    private String userName;
    private String password;
    
	//Customer Class Defualt Contractor
    public Customer(int id, String name, String email, String phone, String userName, String password) {
	    
	this.id = id;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.userName = userName;
	this.password = password;
	    
	}
	//Get Customer ID
	public int getId() {
		return id;
	}
	//Set Customer ID
	public void setId(int id) {
		this.Id = id;
	}
	//Get Customer Name
	public String getName() {
		return name;
	}
	//Set Custoemr Name
	public void setName(String name) {
		this.name = name;
	}
	//Get Email
	public String getEmail() {
		return email;
	}
	//Set Email
	public void setEmail(String email) {
		this.email = email;
	}
	//Get Phone Number
	public String getPhone() {
		return phone;
	}
	//Set Phone Number
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//Get User Name
	public String getUserName() {
		return userName;
	}
	//Set User Name
	public void setUserName(String userName) {
		this.userName = userName;
	}
	//Get Password
	public String getPassword() {
		return password;
	}
	//Set Password
	public void setPassword(String password) {
		this.password = password;
	}
    
	
    
}
