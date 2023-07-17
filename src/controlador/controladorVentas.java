
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Persona;
import modelo.Venta;
import vista.frmVentas;


public class controladorVentas {
  
    Venta venta;
    frmVentas fmrV;

    /*
    
    public controladorVentas() {
        this.venta = new Venta();
        this.fmrV = new frmVentas();
    }

    public void iniciar(){
           fmrV.getBtnRegistar().addActionListener(this);
           fmrV.getBtnMostrar().addActionListener(this);
           fmrV.setLocationRelativeTo(null);
           fmrV.setVisible(true);
    } 
 

    @Override
    public void actionPerformed(ActionEvent e) {
            if(ae.getSource().equals(fmrV.getBtnRegistar())){
                Persona objP = new Persona(
                fmrV.getTxtNom().getText(),
                fmrV.getTxtApellidos().getText(),
                fmrV.getTxtDni().getText()
                );
              venta.getListaC().add(objP);
                JOptionPane.showMessageDialog(fmrV, "Datos registrados..\n"+objP.toString());
            }
    }

    */
    
}
