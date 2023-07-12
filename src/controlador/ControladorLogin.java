/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.UsuarioArreglo;
import vista.frmIngreso;
import vista.frmPrincipal;

/**
 *
 * @author Aulafisi
 */
public class ControladorLogin {
    UsuarioArreglo modelo;
    frmIngreso vista;

    public ControladorLogin(UsuarioArreglo modelo, 
            frmIngreso vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnSalir.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        this.vista.btnIngresar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario u = modelo.validar(vista.txtUsuairo.getText(), 
                            vista.txtClave.getText() );
                if (u != null){
                    //JOptionPane.showMessageDialog( vista, u );
                    frmPrincipal vistaP = new frmPrincipal();
                    ControladorPrincipal controladorPrincipal = 
                            new ControladorPrincipal(u, vistaP);
                    controladorPrincipal.iniciar();
                    vista.dispose();
                    
                    
                } else {
                    JOptionPane.showMessageDialog( vista, "Credenciales invalidas" );
                }
                limpiarControles();
            }
        });
    }

    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        limpiarControles();
        this.vista.setVisible(true);
    }
    
    public void limpiarControles(){
        vista.txtClave.setText("");
        vista.txtUsuairo.setText("");
        
    }
}
