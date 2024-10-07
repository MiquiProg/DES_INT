/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import datos.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miqui Delgado
 */
public class logicaNegocio {
    private static List<Cliente> listaClientes = new ArrayList<>();
    
    public static void anadirCliente(Cliente c) {
        listaClientes.add(c);
    }
    
    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }
}
