package com.project.demo.Model;

import javax.persistence.*;

@Entity
public class Contas {

    private int agencia;
    @Id
    private Integer numero;
    private Integer saldo;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id",nullable = false,unique = true)
    private Cliente cliente;

    public Contas(){}

    public Contas(int agencia, int numero, int saldo) {
        super();
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
