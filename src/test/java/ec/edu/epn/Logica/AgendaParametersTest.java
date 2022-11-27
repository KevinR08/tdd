package ec.edu.epn.Logica;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.*;
@RunWith(value= Parameterized.class)
public class AgendaParametersTest {
    // Definir los parametros
    private int idSala, TipoMocion, expected;
    Agenda agenda;
    @Before
    public  void Set_Up(){
        agenda= new Agenda();
        agenda.crearListBase();
    }
    @Test
    public  void given_parameters_when_consultar_then_ok(){
        int actual = agenda.buscarIdSalaPorTipoMocion(TipoMocion);
        assertEquals(expected,actual);
    }
    //9 pruebas a ejecutar simultaneamente
    @Parameterized.Parameters
    public static Iterable<Object[]>parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        //Mocion ; Sala ; Excepted Sala
        objects.add(new Object[]{16, 01, 01});
        objects.add(new Object[]{14, 02, 02});
        objects.add(new Object[]{25, 03, 03});
        objects.add(new Object[]{24, 04, 04});
        objects.add(new Object[]{22, 05, 05});
        objects.add(new Object[]{11, 06, 06});
        objects.add(new Object[]{12, 07, 8}); // Se cambia para ver error forzado y verifar funcionamiento
        objects.add(new Object[]{15, 8, 8});
        objects.add(new Object[]{20, 9, 9});
        return objects;
    }
    //Construsctor de busqueda por parametros
    public AgendaParametersTest (int idMocion, int idSala, int expected){
        this.TipoMocion=idMocion;
        this.idSala=idSala;
        this.expected=expected;
    }
}