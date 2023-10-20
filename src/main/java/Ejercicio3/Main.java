package Ejercicio3;

import Ejercicio3.Modelo.Login;

public class Main {
    public static void main(String[] args) {
        Login login1 = new Login();
        login1.login(login1);
        System.out.println(login1.getUsuario());
    }



}
