
package urve_nomina;

import vista.*;
import testing.*;

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
        System.out.println("Versión: Alpha 1.1");
        System.out.println("Fecha: 12 noviembre 2014.");
        
        // Creación e invocación de la ventana principal.
//        FormPrincipal FormPrincipal;
//        FormPrincipal = new FormPrincipal();
//        FormPrincipal.setVisible(true);
        
               
        // conexion con la base de datos
        testingConnectionDatabase form = new testingConnectionDatabase();
        form.setVisible(true);
    }
    
}
