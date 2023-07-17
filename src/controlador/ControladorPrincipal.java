
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Vendedor;
import modelo.ArregloPersonas;
import vista.frmIngreso;
import vista.frmPrincipal;

public class ControladorPrincipal {
    Vendedor modelo;
    frmPrincipal vista;
/*
    public ControladorPrincipal(Vendedor modelo, frmPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.lblUsuario.setText("Usuario:"+ modelo.getNombre());
        
        this.vista.btnSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmIngreso fIngreso = new frmIngreso();
                ControladorLogin controlador = 
                        new ControladorLogin(configuracion.Datos.vendedores, fIngreso);
                controlador.iniciar();
                
                vista.dispose();
            }
        });
    }
    
    
    
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
*/
}
