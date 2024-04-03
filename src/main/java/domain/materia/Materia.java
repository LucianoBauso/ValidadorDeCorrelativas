package domain.materia;
import java.util.HashSet;
import java.util.List;

public class Materia {
    private Integer idMateria;
    private String nombre;
    private List<Materia> correlativas;

    public Materia(Integer idMateria, String nombre, List<Materia> correlativas){
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public boolean cumplenCorrelatividad(List<Materia> materiasDeAlumno){
        return new HashSet<>(materiasDeAlumno).containsAll(this.correlativas);
    }
}