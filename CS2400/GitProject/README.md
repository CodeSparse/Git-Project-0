
public record User(String first_name, String last_name, int id, String email, String password){
    @Override
    public String toString(){
        StringBuilder build = new StringBuilder();
        build.append(first_name+" "+last_name+"\n");
        build.append(String.format("ID: %06d\n", id));
        build.append("Email: "+email+"\n");
        build.append("Password: "+password+"\n");
     
        return build.toString();
    }
}