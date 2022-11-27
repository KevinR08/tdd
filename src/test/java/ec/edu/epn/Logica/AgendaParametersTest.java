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
        objects.add(new Object[]{01, 01, 01});
        objects.add(new Object[]{02, 01, 02});
        objects.add(new Object[]{03, 01, 03});
        objects.add(new Object[]{03, 02, 02});
        objects.add(new Object[]{02, 03, 02});
        objects.add(new Object[]{02, 03, 02});
        objects.add(new Object[]{05, 03, 05});
        objects.add(new Object[]{02, 05, 02});
        objects.add(new Object[]{04, 04, 04});
        return objects;
    }



    //Construsctor de busqueda por parametros

    public AgendaParametersTest (int idMocion, int idSala, int expected){
        this.TipoMocion=idMocion;
        this.idSala=idSala;
        this.expected=expected;
    }


}