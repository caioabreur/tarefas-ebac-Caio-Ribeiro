package com.mycompany.projeto_1;

public class Cliente {

    private String nome;
    private String cpf;
    private String tel;
    private String end;

    public Cliente(String nome, String cpf, String tel, String end) {
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.end = end;

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTel() {
        return tel;
    }


    public String getEnd() {
        return end;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", tel='" + tel + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}
