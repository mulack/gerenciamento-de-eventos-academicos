package com.gerenciadorDeEventosAcademicos.view;

import com.gerenciadorDeEventosAcademicos.controller.MainViewController;
import com.gerenciadorDeEventosAcademicos.model.Model;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainView implements Observer{

    private Model model;
    private MainViewController controller;
    private boolean finalizar = false;

    public void finalizarSistema() {
        System.out.println("Quase finalizando...");
        finalizar = true;
    }

    public void initMainView(Model model) {
        this.model = model;
        controller = new MainViewController();
        controller.initMainViewController(model, this);
        model.attachObserver(this);
        menuPrincipal();
    }

    public void menuPrincipal() throws NoSuchElementException {
        Scanner sc = new Scanner(System.in);
        String[] opcoes = { "[1] - Fazer Login", "[2] - Fazer Cadastro", "[3] - Sair" };
        while (!finalizar) {
            try{
                System.out.println("===================================");
                System.out.println("GERENCIAMENTO DE EVENTOS ACADEMICOS");
                System.out.println("===================================");
                System.out.println("Selecione uma opcao:");
                if (model.getUsuarioAutenticado() != null) {
                    System.out.println("Usuario: " + model.getUsuarioAutenticado().getNome());
                    opcoes[0] = "[1] - Fazer Logout";
                    opcoes[1] = "[2] - Acessar pagina de eventos";
                } else {
                    opcoes[0] = "[1] - Fazer Login";
                }
                System.out.println();
                System.out.println(opcoes[0]);
                System.out.println(opcoes[1]);
                System.out.println(opcoes[2]);
                System.out.println();
                System.out.println("Digite a opcao desejada: ");
                String event = sc.nextLine();
                controller.handleEvent(event); // Repassa o evento (opção digitada) para o controller
            } catch (NoSuchElementException e){
                this.finalizarSistema();
                break;
            }
        }
        sc.close();
    }

    public void update(){
    }
}
