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
public class Projeto19ClasseEstudante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Leôncio", "25598", "35057643886");
        Estudante e2 = new Estudante("Carla", "25365", "3526547896");
        Estudante e3 = new Estudante("Roberto", "23565", "236578945");

        System.out.println("Nome estudante: " + e1.getNome());
        System.out.println("RA: " + e1.getRA());
        System.out.println("Celular: " + e1.getCelular());
        System.out.println("--------------------");
        
        e1.addDisciplinasNotas("ciencias", 10);
        e1.addDisciplinasNotas("Literatura", 10);
        e1.addDisciplinasNotas("Jornalismo", 10);
        e1.addDisciplinasNotas("Socialismo", 9);
        e1.addDisciplinasNotas("Finanças", 8);

        e1.listarNotasDisciplinas();
        System.out.println("----------------------------");
        
        e1.addEstudante(e2);
        e1.addEstudante(e3);
        
        System.out.println("Media:  " + e1.calcularMediaNotas());
        
        System.out.println("----------------------------");
        
        e1.listarMonitorados();
        
        
        
      
    }

}
