/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal2;
// import paquetedatos.*;
import paquetedatos.Variable;
import paquetedatos.VariableDos;
/**
 *
 * @author Junior Aguilar
 */
public class Principal {
    public static void main (String[] args){
        double resultado;
        resultado = Variable.numero1 + Variable.numero2;
        System.out.printf("El resultado es:%.1f \n", resultado );
        
        double resultado2;
        resultado2 = Variable.numero1 + VariableDos.numero3;
        System.out.printf("El resultado es:%.1f \n", resultado2 );
    }
    
}
