import domain.alumno.Alumno;
import domain.inscripcion.Inscripcion;
import domain.materia.Materia;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class tests {
    @Test
    public void test1(){
        Materia Algoritmos = new Materia(1,"Algoritmos" , new ArrayList<>());
        Materia ParadigmasDeProgramacion = new Materia(2, "Paradigmas de Programacion", new ArrayList<>());
        Materia DisenoDeSistemas= new Materia(3,"Diseño de Sistemas", List.of(Algoritmos,ParadigmasDeProgramacion));

        Alumno Luciano = new Alumno(2025711,List.of(Algoritmos, ParadigmasDeProgramacion));
        Inscripcion inscripcion = new Inscripcion(Luciano, List.of(DisenoDeSistemas));
        assert inscripcion.aprobada() : "Luciano se puede inscribir a Diseño de Sistemas";
    }

    @Test
    public void test2(){
        Materia Algebra = new Materia(4,"Algebra" , new ArrayList<>());
        Materia AMI = new Materia(5, "AMI", new ArrayList<>());
        Materia AMII= new Materia(6,"AMII", List.of(Algebra,AMI));

        Alumno Luciano = new Alumno(2025711,List.of());
        Inscripcion inscripcion = new Inscripcion(Luciano, List.of(AMII));
        assert !inscripcion.aprobada() : "Luciano No se puede inscribir a AMII";
    }

}
