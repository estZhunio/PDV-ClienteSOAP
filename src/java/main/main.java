package main;

import java.util.List;
import java.util.Scanner;
import ws.Competencia;
import ws.ManipulacionDeDatos;
import ws.ManipulacionDeDatos_Service;
import ws.Rol;
import ws.RolCompetencia;
import ws.UsuarioRol;
import ws.Usuario;

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
        
        if (competencias != null) {
            // System.out.println("USUARIO ENCONTRADO, NUMERO DE COMPETENCIAS --> " + usuarioEncontrado.getListaRoles());
            for (Competencia com : competencias) {
                    System.out.println("\nCompetencia: " + com.getNombreCom() + ",Descripcion: " + com.getDescripcionCom());
               }
                        
               
        } else {
           System.out.println("USUARIO NO ENCONTRADO");     
        }
        
        
    }
}
