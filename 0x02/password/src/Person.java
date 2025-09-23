public class Person {




    public boolean checkUser(String user){
      boolean verificaCarateresEspeciais = user.matches(".*[^a-zA-Z0-9\\s].*");
       
       
        if(user.length()< 8 || verificaCarateresEspeciais ){
            return false;
        }
        return true;

    }

    public boolean checkPassword(String psw){
        boolean verificaCarateresEspeciais = psw.matches(".*[^a-zA-Z0-9\\s].*");
        boolean verificaLetraMaiusculas = psw.matches(".*[A-Z].*");
        boolean verificaNumeros = psw.matches(".*\\d.*");

        if(psw.length()>= 8 && verificaCarateresEspeciais && verificaLetraMaiusculas && verificaNumeros ){
            return true;
        }
        return false;


    }
}
