package Ejercicio3.Modelo;

import java.util.Scanner;

@UsuariosAnotacion( value = {
        @UsuarioAnotacion(usuario = "usuario1", password = "1234"),
        @UsuarioAnotacion(usuario = "usuario2", password = "admin.1")
})
public class Login {
    Usuario usuario;

    public Login(Usuario usuario) {
        this.usuario = usuario;
    }

    public Login() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Login{" +
                "usuario=" + usuario +
                '}';
    }

    public static Scanner sc = new Scanner (System.in);

    public void login (Login login){

        //    * Login tendrá un método de login() que solicitará por consola (Scanner) un usuario y contraseña.
        //     *
        //     * Seguidamente, comprobará en una lista interna de credenciales de Login, si existe algún usuario con dicha contraseña, indicando por mensaje 2 opciones:
        //     * ACCESO CONCEDIDO
        //     * ACCESO DENEGADO.
        UsuariosAnotacion usuariosPadre = login.getClass().getAnnotation(UsuariosAnotacion.class);
        UsuarioAnotacion[] usuariosHijos = usuariosPadre.value();

        System.out.println("Introduce tu usuario");
        String usuarioIntroducido = sc.nextLine();

        System.out.println("Introduce tu contraseña");
        String contraseñaIntroducida = sc.nextLine();

        for (UsuarioAnotacion usuarioHijo : usuariosHijos){
            String usuario = usuarioHijo.usuario();
            String password = usuarioHijo.password();

            if (usuarioHijo.usuario().equals(usuarioIntroducido) && usuarioHijo.password().equals(contraseñaIntroducida)){
                login.setUsuario(new Usuario(usuario, password));
                System.out.println("ACCESO CONCEDIDO");
            } else if (!usuarioHijo.usuario().equals(usuarioIntroducido) && usuarioHijo.password().equals(contraseñaIntroducida)){
                System.out.println("ACCESO DENEGADO");

            }
        }
    }
}
