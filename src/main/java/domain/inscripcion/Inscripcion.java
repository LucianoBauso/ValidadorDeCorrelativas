package domain.inscripcion;
import domain.alumno.Alumno;
import domain.materia.Materia;
import java.util.List;

public class Inscripcion {
    public Alumno alumno;
    public List<Materia> materias;
    public Inscripcion(Alumno alumno, List<Materia> materias){
        this.alumno = alumno;
        this.materias = materias;
    }
    public Boolean aprobada(){
        return  this.materias.stream().allMatch(materia -> alumno.tieneAprobadasCorrelativasDe(materia));
    }

}
