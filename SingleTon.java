public class SingleTon {
    public static void main(String[] args) {
    //    Email email = new Email(); 
    Email email = Email.getInstance(); 
    //    Email email1 = new Email(); 
    //    Email email2 = new Email(); 
    }
}

class Email{
    static Email obj = null;
    private Email(){

    }
    static Email getInstance(){
        if(obj == null){
            obj = new Email();
        }
        return obj;
    }
}