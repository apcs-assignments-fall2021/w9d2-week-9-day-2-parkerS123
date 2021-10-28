public class Person {

    private String lastname;
    private String firstname;

    public Person (String f, String l){
        lastname = l;
        firstname = f;
    }

    public void doSomething(){
        System.out.println("I am watching nathan watch Netfix");
    }

    public String toString(){
        return firstname + " " + lastname;
    }

    public String getLastname(){
        return lastname;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setLastname(String x){
        lastname = x;
    }

    public void setFirstname(String y){
        firstname = y;
    }



}
