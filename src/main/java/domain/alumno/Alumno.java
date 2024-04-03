package domain.alumno;
import domain.materia.Materia;
import java.util.List;

public class Alumno {
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(Integer legajo, List<Materia> materiasAprobadas){
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }
    public boolean tieneAprobadasCorrelativasDe(Materia materiaCorrelativas){
        return materiaCorrelativas.cumplenCorrelatividad(this.materiasAprobadas);
    }
}
