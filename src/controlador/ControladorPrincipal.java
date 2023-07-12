/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Usuario;
import modelo.UsuarioArreglo;
import vista.frmIngreso;
import vista.frmPrincipal;

public class ControladorPrincipal {
    Usuario modelo;
    frmPrincipal vista;

    public ControladorPrincipal(Usuario modelo, frmPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.lblUsuario.setText("Usuario:"+ modelo.getNombre());
        
        this.vista.btnSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmIngreso fIngreso = new frmIngreso();
                ControladorLogin controlador = 
                        new ControladorLogin(configuracion.Datos.usuarios, fIngreso);
                controlador.iniciar();
                
                vista.dispose();
            }
        });
    }
    
    
    
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
