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
        listaSalas.add(new Sala(01,"Rayos",date , 16 ));
        listaSalas.add(new Sala(02,"Lobitos",date , 14 ));
        listaSalas.add(new Sala(03,"Crushes ",date, 25 ));
        listaSalas.add(new Sala(04,"Crushes ",date  , 24 ));
        listaSalas.add(new Sala(05,"Crushes ",date  , 22 ));
        listaSalas.add(new Sala(06,"Crushes ",date, 11 ));
        listaSalas.add(new Sala(07,"Crushes ",date, 12 ));
        listaSalas.add(new Sala(8,"Crushes ",date , 15 ));
        listaSalas.add(new Sala(9,"Crushes ",date  , 20 ));
    }

    public void  crearListBaseAgruparPorMociones (){
        Date date = Date.from(Instant.now());
        listaSalas.add(new Sala(01,"Rayos",date , 01 ));
        listaSalas.add(new Sala(02,"Lobitos",date , 02 ));
        listaSalas.add(new Sala(03,"Crushes ",date, 01 ));
        listaSalas.add(new Sala(04,"Crushes ",date  , 02 ));
        listaSalas.add(new Sala(05,"Crushes ",date  , 01 ));
        listaSalas.add(new Sala(06,"Crushes ",date, 02 ));
        listaSalas.add(new Sala(07,"Crushes ",date, 01 ));
        listaSalas.add(new Sala(8,"Crushes ",date , 01 ));
        listaSalas.add(new Sala(9,"Crushes ",date  , 02 ));
    }

    public void mostrarSalas(){
        for(int i=0; i<listaSalas.size();i++){
            System.out.println(listaSalas.get(i));
        }
    }

    public String mostrarInfoSala(int idSala){
        String info =((Sala) listaSalas.get(idSala)).toString();

        return info;

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

    public int buscarSalasPorNombreSala(String nombreSala){
        int idSala = 0;
        for (int i = 0; i < listaSalas.size(); i++) {
            if (((Sala) listaSalas.get(i)).getnombreSala() == nombreSala) {
               idSala=((Sala) listaSalas.get(i)).getIdSala();
            }
        }
        return idSala;

    }

    public int getContSalas() {
        return contSalas;
    }

    public ArrayList getListaSalas() {
        return listaSalas;
    }
}
