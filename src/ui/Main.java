/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author electra
 */
public class Main {
    
    private static StateMachine stateMachine;
    private static StateMachineLogin stateMachineLogin;
    
     public static void main(String args[]) {
        stateMachine = new StateMachine();
    }
     public static void cambiaALogin(){
        stateMachine.close();
        stateMachineLogin=new StateMachineLogin();
    }
    public static void cambiaAInicio(){
        stateMachineLogin.close();
        stateMachine=new StateMachine();
    }
     
    public static StateMachine getStateMachine() {
        return stateMachine;
    }
    public static StateMachineLogin getStateMachineLogin() {
        return stateMachineLogin;
    }
     
     
}
