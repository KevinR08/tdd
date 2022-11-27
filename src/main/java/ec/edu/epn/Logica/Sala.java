package ec.edu.epn.Logica;

import java.util.ArrayList;
import java.util.Date;

public class Sala {
    private int idSala;
    private ArrayList listaRegistros = new ArrayList<RegistroIndividual>();
    private String nombreSala;
    private Date horario;
    private int tipoMocion;
    private int numParticipantes;
    private boolean quorum;


    public Sala(int idSala, String nombreSala, Date horario, int tipoMocion) {
        this.idSala = idSala;
        this.nombreSala = nombreSala;
        this.horario = horario;
        this.tipoMocion = tipoMocion;

    }

    public int getTipoMocion() {
        return tipoMocion;
    }



    public int getListaRegistroLenght() {
        return listaRegistros.size();
    }

    public void addRegistroInd(RegistroIndividual reg){
        listaRegistros.add(reg);
    }

    public int getIdSala() {
        return idSala;
    }

    public void aumentarNum(){
        numParticipantes++;
    }


    @Override
    public String toString() {
        return "Sala{" +
                "idSala=" + idSala +
                ", listaRegistros=" + listaRegistros +
                ", nombreSala='" + nombreSala + '\'' +
                ", horario=" + horario +
                ", tipoMocion=" + tipoMocion +
                ", numParticipantes=" + numParticipantes +
                ", quorum=" + quorum +
                '}';
    }
}


