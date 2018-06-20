package br.com.eteczonaleste.view;

import javax.swing.JFrame;

import br.com.eteczonaleste.controller.ClienteJpaDAO;
import br.com.eteczonaleste.model.Cliente;

public class App
{
    public static void main( String[] args )
    {
    	 Cliente cliente = new Cliente();
         cliente.setCpf("372.468.423-53");
         cliente.setId(1);
         cliente.setNome("Jeferson Roberto de Lima");
         cliente.setRg("52.563.456-2");
         ClienteJpaDAO.getInstance().merge(cliente);
         System.out.println("Objetos salvo com sucesso!!!");
    }
}
