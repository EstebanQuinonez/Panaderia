
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ArregloVentas;
import modelo.Persona;
import modelo.Venta;
import vista.frmVentas;
import modelo.ArregloPersonas;


public class controladorVentas implements ActionListener{
  
    ArregloVentas ventas;
    frmVentas fmrV;
    ArregloPersonas personas = new ArregloPersonas(100);

    
    public controladorVentas() {
      this.ventas = new ArregloVentas();
      this.fmrV = new frmVentas();
    }

    public void iniciar(){
           fmrV.getBtnRegistar().addActionListener(this);
           fmrV.getBtnMostrar().addActionListener(this);
           fmrV.setLocationRelativeTo(null);
           fmrV.setVisible(true);
    } 
 

    @Override
    public void actionPerformed(ActionEvent ae) {
            if(ae.getSource().equals(fmrV.getBtnRegistar())){
                Persona objP = new Persona(
                fmrV.getTxtNom().getText(),
                fmrV.getTxtApellidos().getText(),
                fmrV.getTxtDni().getText()
                );
               personas.agregar(objP);
                JOptionPane.showMessageDialog(fmrV, "Datos registrados..\n"+objP.toString());
            }
    }    


    
}