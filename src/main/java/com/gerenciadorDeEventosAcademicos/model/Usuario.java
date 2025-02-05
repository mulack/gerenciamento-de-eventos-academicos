package com.gerenciadorDeEventosAcademicos.model;

public class Usuario{

    private String id;
    private String nome;
    private String email;
    private String senha;

    @Override
    public String toString() {
        return "Nome: '" + nome +
                ", Email: '" + email;
    }

    public void login(){}
    public void verInfoEvento(Evento evento){}
    public void verInfoAtividade(Atividade atividade){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}