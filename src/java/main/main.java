package main;

import java.util.List;
import java.util.Scanner;
import ws.Competencia;
import ws.ManipulacionDeDatos;
import ws.ManipulacionDeDatos_Service;

public class main {
    public static void main(String[] args) {
        ManipulacionDeDatos_Service service = new ManipulacionDeDatos_Service();
        ManipulacionDeDatos cliente = service.getManipulacionDeDatosPort();
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el usuario --> ");
        String usuario = in.nextLine();
        
        System.out.println("Ingrese la contraseña --> ");
        String password = in.nextLine();
        
        List<Competencia> competencias = cliente.login(usuario, password);
        
        if (!competencias.isEmpty()) {
            for (Competencia competencia : competencias) {
                System.out.println("\nCompetencia: " + competencia.getNombreCom() + ",Descripcion: " + competencia.getDescripcionCom());
            }    
        } else {
            System.out.println("USUARIO NO ENCONTRADO");
        }
        
        
    }
}
