/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ariel
 */
public class Validador {
    private final String nombrePattern= "/^[a-z\\d_]{4,15}$/i";
  
    
    public boolean validarNickname(String nombre){
        Pattern pat = Pattern.compile(nombrePattern, Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(nombre);
        return mat.find();       
    }

}
