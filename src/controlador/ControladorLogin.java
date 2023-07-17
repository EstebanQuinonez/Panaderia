
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Vendedor;
import modelo.ArregloPersonas;
import modelo.Persona;
import vista.frmIngreso;
import vista.frmPrincipal;

public class ControladorLogin {
    ArregloPersonas modelo;
    frmIngreso vista;

    public ControladorLogin(ArregloPersonas modelo, 
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
                Vendedor u = modelo.validar(vista.txtUsuairo.getText(), 
                            vista.txtClave.getText() );
                if (u != null){
                    frmPrincipal vistaP = new frmPrincipal();
                    ControladorPrincipal controladorPrincipal =
                            new ControladorPrincipal(u,vistaP);
                    controladorPrincipal.iniciar();
                    vista.dispose();
                    //JOptionPane.showMessageDialog( vista, u );
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
