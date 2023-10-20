package Ejercicio3.Modelo;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface UsuariosAnotacion {
    UsuarioAnotacion[] value();
}
