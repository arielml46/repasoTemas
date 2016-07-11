/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import chat.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Ariel
 */
public class ControlEnviar implements ActionListener{

    Cliente cliente;
    
    public ControlEnviar(Cliente cliente)
    {
        this.cliente= cliente;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         
        if(e.getActionCommand().equals("Enviar"))
        {
            cliente.escuchaBoton();
        }
    }
    
}
