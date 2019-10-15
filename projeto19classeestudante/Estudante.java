/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto19classeestudante;

import java.util.ArrayList;

/**
 *
 * @author Bruna Silveira
 */
public class Estudante {

    private String nome;
    private String RA;
    private String celular;
    private ArrayList<String> disciplinas;
    private ArrayList<Integer> notas;
    private ArrayList<Estudante> monitor;

    public Estudante() {
    }

    public Estudante(String nome, String RA, String celular) {
        this.nome = nome;
        this.RA = RA;
        this.celular = celular;
        this.disciplinas = new ArrayList<>();
        this.notas = new ArrayList<>();
        this.monitor = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void addEstudante(Estudante e) {
        this.monitor.add(e);
    }
    
    public void listarMonitorados() {
        for (int i = 0; i < monitor.size(); i++) {
            System.out.println("Monitor:  " + monitor.get(i).getNome());
        }
    }
    public void addDisciplinasNotas(String disciplina, int nota) {
        this.disciplinas.add(disciplina);
        this.notas.add(nota);
    }

    public void listarNotasDisciplinas() {
        for (int i = 0; i < disciplinas.size(); i++) {
            System.out.println("Disciplina: " + disciplinas.get(i) + " - Nota: " + notas.get(i));
        }
    }

    public double calcularMediaNotas() {
        int total = 0;
        int quantidade = 0;
        double media;

        for (int i = 0; i < notas.size(); i++) {
            quantidade++;
            total += notas.get(i);
        }
        return media = total / quantidade;

    }

}
