package ec.edu.epn.Logica;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Agenda {
    private ArrayList listaSalas = new ArrayList<Sala>();
    private int contSalas;
    public void agendarSala(Sala sala){
        listaSalas.add(sala);
        contSalas++;
    }

    public Agenda() {
        contSalas=1;
    }

    public void  crearListBase(){
        Date date = Date.from(Instant.now());
        listaSalas.add(new Sala(01,"Rayos",date , 01 ));
        listaSalas.add(new Sala(02,"Lobitos",date , 01 ));
        listaSalas.add(new Sala(03,"Crushes ",date, 01 ));
        listaSalas.add(new Sala(03,"Crushes ",date  , 01 ));
        listaSalas.add(new Sala(03,"Crushes ",date  , 02 ));
        listaSalas.add(new Sala(02,"Crushes ",date, 03 ));
        listaSalas.add(new Sala(04,"Crushes ",date, 04 ));
        listaSalas.add(new Sala(05,"Crushes ",date , 03 ));
        listaSalas.add(new Sala(02,"Crushes ",date  , 05 ));
    }

    public void mostrarSalas(){
        for(int i=0; i<listaSalas.size();i++){
            System.out.println(listaSalas.get(i));
        }
    }

    public int buscarIdSalaPorTipoMocion(int tipoMocion) {
        int idSearch = 0;
        for (int i = 0; i < listaSalas.size(); i++) {
            if (((Sala) listaSalas.get(i)).getTipoMocion() == tipoMocion) {
                idSearch = ((Sala) listaSalas.get(i)).getIdSala();
            }
        }
        return idSearch;
    }


    public int getContSalas() {
        return contSalas;
    }

    public ArrayList getListaSalas() {
        return listaSalas;
    }
}
