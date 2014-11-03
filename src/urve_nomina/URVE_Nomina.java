/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urve_nomina;

import vista.*;

/**
 *
 * @author Jorge Ricardo Escobar Carrasco.
 * @version Alpha 1.0
 * @since 31 oct 2014
 */
public class URVE_Nomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Proyecto: URVE Nómina.");
        System.out.println("Versión: Alpha 1.0");
        System.out.println("Fecha: 31 octubre 2014.");
        
        // Creación e invocación de la ventana principal.
        FormPrincipal FormPrincipal;
        FormPrincipal = new FormPrincipal();
        FormPrincipal.setVisible(true);
        
    }
    
}
