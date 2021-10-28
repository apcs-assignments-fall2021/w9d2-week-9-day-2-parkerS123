public class NinthGrader extends Student {

    public NinthGrader (String a, String b){
        super(a, b, 2025);
    }

    public NinthGrader (){
        super("Lequandre", "Jenkins", 2025);
    }

    public void doSomething(){
        System.out.println("I am doing harkness");
    }

    public String toString(){
        return this.getFirstname() + " " + this.getLastname() + " '2025";
    }


}
