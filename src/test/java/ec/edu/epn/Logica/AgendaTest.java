package ec.edu.epn.Logica;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgendaTest {


// Funcionalidad a implementar: Busqueda de sala por ID  o tipo de Moción Ingresados por el usuario final

    // Tests Units

// Prueba 1 : Ingresando Tipo de Mocion , se despliega toda la info de salas con esa mocion

// Prueba 3: Usuario puede elegir si ver las salas solo en estado disponible, no disponible o ambas
// Prueba 4 : Mostrar mensaje de rechazo cuando no se encuentra la sala

    // Test Parametrizados
    Agenda agenda;
    @Before
    public void setUp(){
        agenda= new Agenda();
        agenda.crearListBase();
    }

    // Prueba 1 : Ingresando Tipo de Mocion , se retorna el Id de la Sala correspondiente
    @Test
    public void given_parameters_when_consultar_then_ok(){
        assertEquals(01, agenda.buscarIdSalaPorTipoMocion(16));
    }
    // Prueba 2:  Ingresando un nombre de sala obtenemos un id

    @Test
    public void given_parameter_nombreSala_get_ID() {
       assertEquals(2,agenda.buscarSalasPorNombreSala("lobitos"));
}