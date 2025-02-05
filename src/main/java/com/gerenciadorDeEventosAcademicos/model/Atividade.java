package com.gerenciadorDeEventosAcademicos.model;

import java.util.ArrayList;

public class Atividade {

    private Evento evento;
    private int id;
    private String nome;
    private String descricao;
    private Local local;
    private Palestrante palestrante;
    private String dataInicio;
    private String dataFim;
    private String horaInicio;
    private String horaFim;
    private ArrayList<Participante> participantesDaAtividade = new ArrayList<Participante>();
    private ArrayList<Palestrante> palestrantesDaAtividade = new ArrayList<Palestrante>();

    public Atividade(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Nome: ***" + nome + "***" +
                "\n    Descricao: " + descricao +
                "\n    Local: " + local +
                "\n    Palestrante: " + palestrante +
                "\n    Data de Inicio: " + dataInicio +
                "\n    Hora de inicio: " + horaInicio +
                "\n    Hora de fim: " + horaFim +
                "\n    Participantes da atividade: " + participantesDaAtividade +
                "}";
    }

    public void addParticipante(Participante participante){
        participantesDaAtividade.add(participante);
    }
    public void addPalestrante(Palestrante palestrante){
        palestrantesDaAtividade.add(palestrante);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        if (palestrante == null){
            System.out.println("O palestrante informado não existe \n Tente novamente");
        } else {
            this.palestrante = palestrante;
        }
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        if (dataInicio.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
            this.dataInicio = dataInicio;
        } else {
            System.out.println("O formato da data de inicio informada esta incoreto.\n Tente novamente passando a data no formato xx/xx/xxxx");
        }
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        if (dataFim.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
            this.dataFim = dataFim;
        } else{
            System.out.println("O formato da data de fim informada esta incoreto.\n Tente novamente passando a data no formato xx/xx/xxxx");
        }
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        if (horaInicio.matches("\\d{1,2}:\\d{2}")) {
            this.horaInicio = horaInicio;
        }
        else {
            System.out.println("O formato da hora de inicio informada esta incoreto.\n Tente novamente passando a hora no formato xx:xx");
        }
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        if (horaInicio.matches("\\d{1,2}:\\d{2}")) {
            this.horaInicio = horaInicio;
        }
        else {
            System.out.println("O formato da hora do fim informado esta incoreto.\n Tente novamente passando a hora no formato xx:xx");
        }
    }

    public ArrayList<Palestrante> getPalestrantesDaAtividade() {
        return palestrantesDaAtividade;
    }

    public void setPalestrantesDaAtividade(ArrayList<Palestrante> palestrantesDaAtividade) {
        this.palestrantesDaAtividade = palestrantesDaAtividade;
    }

    public ArrayList<Participante> getParticipantesDaAtividade() {
        return participantesDaAtividade;
    }

    public void setParticipantesDaAtividade(ArrayList<Participante> participantesDaAtividade) {
        this.participantesDaAtividade = participantesDaAtividade;
    }
}
