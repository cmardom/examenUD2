package Ejercicio3.Modelo;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface UsuarioAnotacion {
    String usuario () default "VOID";
    String password () default "VOID";

}
