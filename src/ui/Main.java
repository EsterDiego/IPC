/**
 *@author Adrian de Prado
 * @author Ester Diego 
 * equipo 10
 * 
 *credenciales guardadas para login:
 * User: usuario
 * Pass: 1234
 */
package ui;

/**
 *
 *
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
