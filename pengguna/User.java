package pengguna;

public class User{
    private String username;
    private String password;

    public User(String arg_username, String arg_password){
        this.username = arg_username;
        this.password = arg_password;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getUsername(){
        return this.username = username;
    }
    
    public String getPassword() {
        return this.password = password;
    }

}