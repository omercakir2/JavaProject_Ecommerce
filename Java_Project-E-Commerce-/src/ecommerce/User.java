package ecommerce;

public class User {
	protected int id;
	protected String username;
	protected String password;
	
	
	public User() {
		this.id = 987654321;
		this.username = "noUserName";
		this.password = "noPassword";
	}
	
	
	
	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "\nid=" + id + "\nusername=" + username + "\npassword=" + password;
	}
	
	public String encryptPassword(String password) //simple encryption algorithm just for show, it is not save!
	{
		int len = password.length();
		StringBuilder updated = new StringBuilder();
		for(int i=0;i<len;i++)
		{
			char ch=(char) (password.charAt(i)+len);
			updated.append(ch);
		}
		return(updated.toString());
	}
	
	public String decryptPassword(String encrypted)
	{
		int len =encrypted.length();
		StringBuilder decrypted =new StringBuilder();
		for(int i=0;i<len;i++)
		{
			char ch = (char) (encrypted.charAt(i)-len);
			decrypted.append(ch);
		}
		return(decrypted.toString());
		
	}
	
	
	
	
	

}
