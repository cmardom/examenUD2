package Ejercicio3.Modelo;

@UsuariosAnotacion( value = {
        @UsuarioAnotacion(usuario = "usuario1", password = "1234"),
        @UsuarioAnotacion(usuario = "usuario2", password = "admin.1")
})

public class Usuario {
    private String usuario;
    private String password;

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


